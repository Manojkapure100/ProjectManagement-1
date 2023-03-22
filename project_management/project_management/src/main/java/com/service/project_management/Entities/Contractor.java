package com.projectmanagement.demo.Entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
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
@Entity
@Table(name = "contractor")
public class Contractor implements Serializable {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "contractor_id" )
     private Integer contractorId;

     @Column(name = "name" )
     private String name;

     @Column(name = "job_role" )
     private String jobRole;

     @Column(name = "email" )
     private String email;

     @Column(name = "phone_no" )
     private String phoneNo;

     @Column(name = "address" )
     private String address;

     @Column(name = "experience" )
     private String experience;






}
