package com.service.project_management.service;

import com.service.project_management.Entities.ProjectLocation;
import com.service.project_management.Repositories.ProjectLocationRepo;
import com.service.project_management.Repositories.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectLocationService{
        @Autowired
        private ProjectRepo projectRepository;

        @Autowired
        private ProjectLocationRepo projectLocationRepository;


        public <S extends ProjectLocation> ProjectLocation saveProjectLocation(ProjectLocation projectLocation) {
            projectLocationRepository.save(projectLocation);
                return projectLocation;
        }

}
