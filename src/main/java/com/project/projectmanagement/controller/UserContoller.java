package com.project.projectmanagement.controller;

import com.project.projectmanagement.entity.Project;
import com.project.projectmanagement.entity.User;
import com.project.projectmanagement.repositories.ProjectRepository;
import com.project.projectmanagement.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/user")
public class UserContoller {

    @Autowired
    UserRepository userRepo;

    @Autowired
    ProjectRepository projectRepo;


    @RequestMapping("/addUser")
    public String addUser(){

        User user = new User();
        user.setUserName("Keshav");
        user.setUserDescription("Manager");
        user.setCreationDate(LocalDateTime.now().toString());
        Project project= projectRepo.findById(1);
        user.setProject(project);
        userRepo.save(user);
        return "Created";

    }

}
