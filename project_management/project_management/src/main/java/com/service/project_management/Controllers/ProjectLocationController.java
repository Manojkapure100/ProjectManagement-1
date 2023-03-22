package com.service.project_management.Controllers;

import com.service.project_management.Entities.Investor_Project;
import com.service.project_management.Entities.Project;
import com.service.project_management.Entities.ProjectLocation;
import com.service.project_management.service.ProjectByLocationService;
import com.service.project_management.service.ProjectLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
@RequestMapping("/projectbylocation/")
public class ProjectLocationController{


    @Autowired
    ProjectByLocationService projectByLocationService;

    @Autowired
    private ProjectLocationService projectLocationService;

    @GetMapping("/{locationId}/")
    public ResponseEntity<Object> getProject(@PathVariable Integer locationId){


            List<Project> projectLocation = projectByLocationService.getAllProjectwithLocation(locationId);

            return ResponseEntity.ok().body(Map.of("message","success","data",projectLocation));

    }

    @PostMapping("/add")
    public Boolean add(@RequestBody ProjectLocation projectLocation){
        try{
            ProjectLocation result = projectLocationService.saveProjectLocation(projectLocation);
            if(result!=null){
                return Boolean.TRUE;
            }else{
                return Boolean.FALSE;
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
            return Boolean.FALSE;
        }

    }

}
