package com.project.projectmanagement.controller;


import com.project.projectmanagement.entity.Project;
import com.project.projectmanagement.entity.Task;
import com.project.projectmanagement.repositories.ProjectRepository;

import com.project.projectmanagement.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    ProjectRepository projectRepo;

    @Autowired
    TaskRepository taskRepository;

    @RequestMapping("/viewTask")
    public String showTask(){
        return "All list of task";
    }


    @RequestMapping("/addTask")
    public String savetask(){

        Task task= new Task();
        task.setTaskName("Fist task");
        task.setTaskDesc("First Desc");
        task.setPriority(10);

        Project project= projectRepo.findById(1);
        task.setProject(project);
        taskRepository.save(task);
        return "Saved";
    }
}
