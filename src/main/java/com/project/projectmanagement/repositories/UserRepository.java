package com.project.projectmanagement.repositories;

import com.project.projectmanagement.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
