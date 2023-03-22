package com.service.project_management.service;

import com.service.project_management.Entities.Investor_Project;
import com.service.project_management.Repositories.InvestorRepo;
import com.service.project_management.Repositories.Investor_ProjectRepo;
import com.service.project_management.Repositories.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvestorService {

   @Autowired
    private ProjectRepo projectRepo;

   @Autowired
   private InvestorRepo investorRepo;

   @Autowired
    private Investor_ProjectRepo investorProjectRepo;

    public List<Investor_Project> getAllInvesterProjects(Integer investerId) {
        List<Investor_Project> projects = investorProjectRepo.findByInvestorId(investerId);
        return projects;
    }

    public Optional<Investor_Project> getInvesterProject(Integer investerId, Integer projectId) {
        Optional<Investor_Project> project = investorProjectRepo.findProjectByIp(investerId,projectId);
        return project;
    }



}

