package com.devadam.tasks.mappers;

import com.devadam.tasks.domain.dto.TaskListDto;
import com.devadam.tasks.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);
}
