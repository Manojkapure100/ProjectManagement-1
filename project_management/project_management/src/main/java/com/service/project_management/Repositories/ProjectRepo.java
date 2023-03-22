package com.service.project_management.Repositories;

import com.service.project_management.Entities.Investor_Project;
import com.service.project_management.Entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ProjectRepo extends JpaRepository<Project,Integer> {


    @Query(value = "select * from project where project_location_id= l_id",nativeQuery = true)
    Optional<Project> findProjectByLocation(@Param("l_id")Integer locationId);




}
