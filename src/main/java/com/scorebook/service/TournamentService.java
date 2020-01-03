package com.scorebook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scorebook.entity.Tournament;
import com.scorebook.repository.TournamentRepository;

@Service
public class TournamentService {
	
	@Autowired
	private TournamentRepository tournamentRepositoty;
	
	public Tournament addTournament(Tournament tournament) {
		return tournamentRepositoty.save(tournament);
	}
}
