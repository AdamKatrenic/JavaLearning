package com.devadam.tasks.mappers;

import com.devadam.tasks.domain.dto.TaskDto;
import com.devadam.tasks.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);
}
