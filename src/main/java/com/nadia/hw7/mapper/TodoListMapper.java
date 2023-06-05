package com.nadia.hw7.mapper;

import com.nadia.hw7.model.domain.TodoList;
import com.nadia.hw7.model.entity.TodoListEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;



@Mapper(
   componentModel = "spring",
   nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
   uses = TaskMapper.class
)
public interface TodoListMapper {
    TodoListEntity toEntity(TodoList list);

    TodoList fromEntity(TodoListEntity entity);
}
