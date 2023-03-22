package com.projectmanagement.demo.Repositories;

import com.projectmanagement.demo.Entities.ProjectLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectLocationRepo extends JpaRepository<ProjectLocation,Integer> {
}
