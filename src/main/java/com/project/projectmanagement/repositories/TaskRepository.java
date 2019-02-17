package com.project.projectmanagement.repositories;

import com.project.projectmanagement.entity.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {


}