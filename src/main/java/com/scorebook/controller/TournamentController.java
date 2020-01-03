package com.scorebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.scorebook.entity.Admin;
import com.scorebook.entity.Tournament;
import com.scorebook.service.AdminService;
import com.scorebook.service.TournamentService;

@RestController
public class TournamentController {

	@Autowired
	private TournamentService tournamentService;
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/{adminId}/tournament")
	public Tournament addTournament(@RequestBody Tournament tournament, @PathVariable long adminId) {
		System.out.println(adminId);
		Admin admin = adminService.getById(adminId).get();
		tournament.setAdmin(admin);
		return tournamentService.addTournament(tournament);
	}
}
