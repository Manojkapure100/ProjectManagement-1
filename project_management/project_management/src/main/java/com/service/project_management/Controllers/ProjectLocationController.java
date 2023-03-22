package com.service.project_management.Controllers;

import com.service.project_management.Entities.Investor_Project;
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
    ProjectLocationController projectLocationController;

    @GetMapping("/{locationId}/")
    public ResponseEntity<Object> getProject(@PathVariable Integer locationId){
        if(projectId.equals(0)){
            List<Investor_Project> investerProjects = investerService.getAllInvesterProjects(investerId);
            return ResponseEntity.ok().body(Map.of("message","success","data",investerProjects));
        }
        else {
            Optional<Investor_Project> project = investerService.getInvesterProject(investerId,projectId);

            return ResponseEntity.ok().body(Map.of("message","success","data",project));
        }
    }

}
