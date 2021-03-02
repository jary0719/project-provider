package net.suncaper.projectprovider.controller;

import net.suncaper.projectprovider.domain.Project;
import net.suncaper.projectprovider.service.ProjectService;
import net.suncaper.projecttracking.common.PagableResponse;
import net.suncaper.projecttracking.common.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {
    private ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping("/save")
    public Boolean saveProject(@RequestBody Project project) {
        projectService.saveProject(project);
        return Boolean.TRUE;
    }

    @GetMapping("/remove")
    public Boolean removeProject(@RequestParam("id") Integer id) {
        projectService.removeProject(id);

        return Boolean.TRUE;
    }

    @GetMapping("/detail")
    public Project getProjectDetailById(@RequestParam("id") Integer id) {
        return projectService.getProjectDetailById(id);
    }

    @GetMapping("/search")
    public PagableResponse<List<Project>> searchProject(PageRequest request, @RequestParam("keyword") String Keyword) {
        return projectService.search(request, Keyword);
    }
}
