package com.service.project_management.Controllers;

import com.service.project_management.Entities.Project;
import com.service.project_management.Entities.ProjectLocation;
import com.service.project_management.Repositories.ProjectLocationRepo;
import com.service.project_management.service.ProjectByLocationService;
import com.service.project_management.service.ProjectLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/projectbylocation/")
public class ProjectLocationController{


    @Autowired
    ProjectLocationService projectLocationService;

  @Autowired
  ProjectByLocationService projectByLocationService;

    @Autowired
    ProjectLocationRepo projectLocationRepo;

    @GetMapping("/{locationId}/")
    public ResponseEntity<Object> getProject(@PathVariable Integer locationId){


            List<Project> projectLocation = projectByLocationService.getAllProjectwithLocation(locationId);

            return ResponseEntity.ok().body(Map.of("message","success","data",projectLocation));

    }

    @PostMapping("/projectLocation")
    public ProjectLocation saveProjectLocation(@RequestBody ProjectLocation projectLocation){
            return projectLocationService.saveProjectLocation(projectLocation);

    }

}
