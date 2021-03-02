package net.suncaper.projectprovider.service;

import net.suncaper.projectprovider.domain.SysDict;
import net.suncaper.projectprovider.domain.SysDictExample;
import net.suncaper.projectprovider.mapper.SysDictMapper;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class SysDictService {
    private SysDictMapper sysDictMapper;

    public SysDictService(SysDictMapper sysDictMapper) {
        this.sysDictMapper = sysDictMapper;
    }

    @Cacheable(value = "SYS-DICT-MAP-CACHE", key = "'UNIQUE-KEY'")
    public Map<String, List<SysDict>> getSysDictsMap() {
        return sysDictMapper.selectByExample(new SysDictExample()).stream().collect(Collectors.groupingBy(SysDict::getType));
    }
}
