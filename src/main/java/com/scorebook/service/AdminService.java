package com.scorebook.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scorebook.entity.Admin;
import com.scorebook.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepository;
	
	public Admin add(Admin admin) {
		return adminRepository.save(admin);
	}

	public Optional<Admin> getById(long id) {
		return adminRepository.findById(id);
	}
}
