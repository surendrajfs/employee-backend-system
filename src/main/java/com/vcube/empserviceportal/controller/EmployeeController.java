package com.vcube.empserviceportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.empserviceportal.model.Employee;
import com.vcube.empserviceportal.service.EmployeeService;

@CrossOrigin(origins = "http://localhost:5173")

@RestController
@RequestMapping("api/v1")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

//  http://localhost:9999/api/v1/createEmp
	@PostMapping("/createEmp")
	Employee createEmp(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}

//  http://localhost:9999/api/v1/getEmp/1
	@GetMapping("/getEmp/{eid}")
	Employee getEmployee(@PathVariable("eid") Integer eid) {
		return employeeService.getEmployeeByEid(eid);
	}
	
	@PutMapping("/update/{eid}")
	Employee updateEmployee(@RequestBody Employee employee,@PathVariable("eid") Integer eid ) {
		return employeeService.updateEmployee(employee,eid);
	}

	@GetMapping("/getEmpList")
	List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
	@DeleteMapping("/delete/{eid}")
	String deleteEmployee(@PathVariable("eid") Integer eid) {
		employeeService.deleteEmployee(eid);
		return "Delete employee Successfully";
	}

	@GetMapping("getEmp/fname/{fname}")
	Employee getEmployee(@PathVariable("fname") String fname) {
		return employeeService.getEmployeeByFirstName(fname);
	}

}
