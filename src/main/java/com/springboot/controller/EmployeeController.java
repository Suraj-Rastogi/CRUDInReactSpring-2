package com.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.exception.ResourceNotFoundException;
import com.springboot.model.Employees;
import com.springboot.repository.EmployeeRepo;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	//get all employees
	@GetMapping("/employees")
	public List<Employees> getAllEmployees(){
		return employeeRepo.findAll();
	}
	
	//add employee "/employees
	@PostMapping("/employees/add")
	public ResponseEntity<String> addEmployee(@RequestBody Employees employee) {
		employeeRepo.save(employee);
		return ResponseEntity.ok("user saved successfully"+employee);
	}
//	 @GetMapping("/employees/{id}")
//	    public Optional<Employees> findUser(@PathVariable int id) {
//			Optional<Employees> employee  = employeeRepo.findById(id);
//			System.out.println("this is user by id >>>>>>>>>>"+id +" and id is >>>>>>>>>>"+employee );
//			return employee; 
//			Employees employee = employeeRepo.findById()
//					.orElseThrow(()-> new ResourceNotFoundException("Employee not exist with this id :"+id));
			//public ResponseEntity<Employees> 
			//return ResponseEntity.ok(employee);
	// }	
	 
	 @GetMapping("/employees/{id}")
	 public ResponseEntity<Employees> findEmployeeById(@PathVariable int id){
		 Employees employee = employeeRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee not exist with user id:"+id));
		 return ResponseEntity.ok(employee);
	 }
	 
	 @PutMapping("/employees/{id}")
	 public ResponseEntity<Employees> updateEmployee(@PathVariable int id,@RequestBody Employees employeeDetail){
		 Employees employee = employeeRepo.findById(id)
				 .orElseThrow(()->new ResourceNotFoundException("Employee not exist with user id:"+id));
		 System.out.println("user id is=>>>>>>>>>>>>>"+id +" and employees >>>>>>>>>>>>>"+employeeDetail.getName());
		 employee.setName(employeeDetail.getName());
		 employee.setEmail(employeeDetail.getEmail());
		 employee.setDob(employeeDetail.getDob());
		 employee.setQualification(employeeDetail.getQualification());
		 employee.setDomain(employeeDetail.getDomain());
		 employee.setAddress(employeeDetail.getAddress());
		 employee.setContact(employeeDetail.getContact());
		 employee.setExperiance(employeeDetail.getExperiance());
		 employee.setPassword(employeeDetail.getPassword());
		 
		 Employees updatedEmployees = employeeRepo.save(employee);
		 System.out.println("updated user id is>>>>>>>>>>>>>"+updatedEmployees.getId() +" and employees >>>>>>>>>>>>>"+updatedEmployees.getExperiance());
			
		 return ResponseEntity.ok(updatedEmployees);
	 }
	 
	    @DeleteMapping("/employees/{id}")
	    public List<Employees> deleteEmp(@PathVariable int id) {
	        employeeRepo.deleteById(id);
	        System.out.println("User deleted successfully >>>>>>>>>>>>>>>"+id);
	        return employeeRepo.findAll();
	    }
}
