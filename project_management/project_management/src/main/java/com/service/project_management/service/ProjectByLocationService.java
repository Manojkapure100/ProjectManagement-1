package com.service.project_management.service;

import com.service.project_management.Entities.Investor_Project;
import com.service.project_management.Entities.Project;
import com.service.project_management.Repositories.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service
public class ProjectByLocationService {


    @Autowired
    ProjectRepo projectRepo;

    @Autowired
    Project project;

    public Optional<Project> getAllProjectwithLocation(Integer locationId) {

        Optional<Project> projects = projectRepo.findProjectByLocation(locationId);
        return projects;
    }

}
