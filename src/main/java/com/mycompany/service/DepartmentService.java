package com.mycompany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.entity.Department;
import com.mycompany.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
    
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("inside method of DepartmentService.saveDepartment ");
        return departmentRepository.save(department);
    }

    public Department getDepartmentById(Long departId) {
        log.info("inside method of DepartmentService.getDepartmentById ");
        return departmentRepository.findByDeptId(departId);
    }

}
