package com.service.project_management.Controllers;



import com.service.project_management.Entities.Investor_Project;
import com.service.project_management.service.InvestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/invester/")
public class ProjectController {

    @Autowired
    InvestorService investerService;
    @GetMapping("/{investerId}/")
    public ResponseEntity<Object> getProjects(@PathVariable Integer investerId,@RequestParam(defaultValue ="0" ,required = false) Integer projectId){
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
