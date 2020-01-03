package com.scorebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.scorebook.entity.Admin;
import com.scorebook.service.AdminService;

@RestController
public class AdminConroller {
	
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/signup")
	public Admin signUp(@RequestBody Admin admin) {
		return adminService.add(admin);
	}
	
	@GetMapping("/admin/{id}")
	public ResponseEntity getAdmin(@PathVariable("id") long id) {
		return new ResponseEntity<>(adminService.getById(id), HttpStatus.OK);
	}
	
}
