package com.nadia.hw7.repository;

import com.nadia.hw7.model.entity.TodoListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TodoListRepository extends JpaRepository<TodoListEntity, Long> {
}
