package com.mycompany.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "The database generated deptId", hidden = true)
    private Long deptId;
    
    @ApiModelProperty(notes = "Dept name", required = true, example = "CSE")
    private String deptName;
    
    @ApiModelProperty(notes = "Dept Addr", required = true, example = "pendurthi")
    private String deptAddr;
    
    @ApiModelProperty(notes = "Dept Code", required = true, example = "CSE-001")
    private String deptCode;

}
