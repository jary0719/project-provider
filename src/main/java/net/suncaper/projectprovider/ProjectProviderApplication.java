package net.suncaper.projectprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("net.suncaper.projectprovider.mapper")
@EnableSwagger2
@EnableCaching
public class ProjectProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectProviderApplication.class, args);
    }

}
