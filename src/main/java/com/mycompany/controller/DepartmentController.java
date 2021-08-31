package com.mycompany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.entity.Department;
import com.mycompany.service.DepartmentService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @ApiOperation(value = "create a department", response = Department.class)
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successfully created dept"),
        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")})
    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("inside method of DepartmentController.saveDepartment ");
        return departmentService.saveDepartment(department);

    }

    @GetMapping("{id}")
    public Department getDepartmentById(@PathVariable(name = "id") Long departId) {
        log.info("inside method of DepartmentController.getDepartmentById ");
        return departmentService.getDepartmentById(departId);

    }

}
