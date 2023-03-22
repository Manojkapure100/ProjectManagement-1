package com.projectmanagement.demo.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.stream.Location;
import java.io.Serializable;
import java.util.Date;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "project")
@Entity
public class Project implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id" )
    private Integer projectId;

    @Column(name = "project_status" )
    private Integer projectStatus;

    @Column(name = "project_name" )
    private  String projectName;

    @Column(name = "project_starting_date" )
    private Date projectStartingDate;

    @Column(name = "project_deadline" )
    private Date projectDeadline;

    @Column(name = "project_type_name" )
    private String projectTypeName;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "project_location_id",name="project_location_id")
    private ProjectLocation projectLocation;




}
