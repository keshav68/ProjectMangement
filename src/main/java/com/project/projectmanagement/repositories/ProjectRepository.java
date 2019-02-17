package com.project.projectmanagement.repositories;

import com.project.projectmanagement.entity.Project;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProjectRepository extends CrudRepository<Project, Integer> {

    Project findById(int id);
    List<Project> findAll();
}
