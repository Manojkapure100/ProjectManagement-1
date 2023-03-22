package com.projectmanagement.demo.Repositories;

import com.projectmanagement.demo.Entities.Investor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestorRepo extends JpaRepository<Investor,Integer> {
}
