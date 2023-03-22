package com.projectmanagement.demo.Repositories;

import com.projectmanagement.demo.Entities.TaskDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskDetailRepo extends JpaRepository<TaskDetails,Integer> {
}
