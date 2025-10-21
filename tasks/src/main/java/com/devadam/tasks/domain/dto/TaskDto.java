package com.devadam.tasks.domain.dto;

import com.devadam.tasks.domain.entities.TaskPriority;
import com.devadam.tasks.domain.entities.TaskStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDto(UUID id,
                      String title,
                      String description,
                      LocalDateTime dueDate,
                      TaskPriority priority,
                      TaskStatus status
) {

}
