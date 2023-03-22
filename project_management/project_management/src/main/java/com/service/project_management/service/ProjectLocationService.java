package com.service.project_management.service;

import com.service.project_management.Entities.ProjectLocation;
import com.service.project_management.Repositories.ProjectLocationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectLocationService {

    @Autowired
    ProjectLocationRepo projectLocationRepo;
    public ProjectLocation saveProjectLocation(ProjectLocation projectLocation) {
        return projectLocationRepo.save(projectLocation);
    }
}
