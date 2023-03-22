package com.projectmanagement.demo.Repositories;

import com.projectmanagement.demo.Entities.Investor;
import com.projectmanagement.demo.Entities.Investor_Project;
import com.projectmanagement.demo.Entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepo extends JpaRepository<Project,Integer> {



//    List<Project> findByInvestorProject(Investor_Project investorProject);




}
