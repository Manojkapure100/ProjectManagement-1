package com.projectmanagement.demo.Repositories;

import com.projectmanagement.demo.Entities.Contractor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractorRepo extends JpaRepository<Contractor,Integer> {
}
