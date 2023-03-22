package com.projectmanagement.demo.Repositories;

import com.projectmanagement.demo.Entities.MoneyManagement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoneyManagementRepo extends JpaRepository<MoneyManagement,Integer> {
}
