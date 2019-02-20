package com.uae.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@CrossOrigin
public class Srpingcontroller {

	
	@GetMapping("test1")
	public List<Employee> get(@RequestParam String xrNo)
	{
		List<Employee> finalList  = new ArrayList<Employee>();
		
		Employee employee = new Employee();
		employee.setId(2547);
		employee.setName("madhan");
		employee.setAddress("tpt");
		
		finalList.add(employee);
		
		Employee employee1 = new Employee();
		employee1.setId(2548);
		employee1.setName("venkat");
		employee1.setAddress("ongole");
		
		finalList.add(employee1);
		
		Employee employee2 = new Employee();
		employee2.setId(2549);
		employee2.setName("sudheer");
		employee2.setAddress("tada");
		
		finalList.add(employee2);
		
		return finalList;
				
	}
	
}
