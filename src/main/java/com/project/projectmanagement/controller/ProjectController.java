package com.project.projectmanagement.controller;

import com.project.projectmanagement.entity.Project;
import com.project.projectmanagement.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {


    @Autowired
    ProjectRepository repo;

    @RequestMapping("/addProject")
    public String createProject(){

        Project pro= new Project();
        pro.setProjectName("Sample1");
//        pro.getEndDa;

        repo.save(pro);

     return "Created";
    }

    @RequestMapping("/getAllProject")
    public List<Project>  getProjects(){

        Project pro= new Project();
        pro.setProjectName("Sample1");
//        pro.getEndDa;

        List<Project> listProject = repo.findAll();

        return listProject;
    }
}
