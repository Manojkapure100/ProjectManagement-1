package com.projectmanagement.demo.service;

import com.projectmanagement.demo.Dto.ProjectDto;
import com.projectmanagement.demo.Dto.ProjectInvestorDto;
import com.projectmanagement.demo.Entities.Investor;
import com.projectmanagement.demo.Entities.Investor_Project;
import com.projectmanagement.demo.Entities.Project;
import com.projectmanagement.demo.Repositories.InvestorRepo;
import com.projectmanagement.demo.Repositories.Investor_ProjectRepo;
import com.projectmanagement.demo.Repositories.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

