package com.projectmanagement.demo.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "investor_project")
@Entity
public class Investor_Project implements Serializable {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "investor_project_id" )
   private Integer investorProjectId;

   @ManyToOne
   @JoinColumn(referencedColumnName = "investor_id",name = "investor_id")
   private Investor investor;


   @ManyToOne
   @JoinColumn(referencedColumnName = "project_id",name="project_id")
   private Project project;

   @Column(name = "invested_share" )
   private Integer investedShare;





}
