package com.mycompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

    Department findByDeptId(Long deptId);

}
