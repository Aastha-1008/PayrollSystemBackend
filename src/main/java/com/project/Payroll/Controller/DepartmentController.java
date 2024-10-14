package com.project.Payroll.Controller;

import com.project.Payroll.Request.DepartmentDetails;
import com.project.Payroll.entities.Department;
import com.project.Payroll.response.GenericResponse;
import com.project.Payroll.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department/")
@CrossOrigin(origins = {"http://localhost:3000"})
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping("/")
    public List<Department> getAllDepartment(){
        return departmentService.getAllDepartment();
    }

    @GetMapping("/{id}")
    public Department getAllDepartment(@PathVariable Long id){
        return departmentService.getDepartmentById(id);
    }

    @PostMapping("/")
    public GenericResponse addDepartment(@RequestBody DepartmentDetails departmentDetails){
       departmentService.addDepartment(departmentDetails);
       return GenericResponse.builder().statusCode(HttpStatus.OK).msg("Successfully added Department").build();
    }

}
