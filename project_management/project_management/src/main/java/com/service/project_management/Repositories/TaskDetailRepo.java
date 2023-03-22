package com.service.project_management.Repositories;

import com.service.project_management.Entities.TaskDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskDetailRepo extends JpaRepository<TaskDetails,Integer> {
}
