package com.junglee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junglee.common.RequestJson;
import com.junglee.common.ResponseObject;
import com.junglee.service.LeaderService;

@RestController
public class HomeController {

	@Autowired
	private LeaderService service;
	
	/*
	 * This end-point is used to get list of Teams Registered.
	 */
	@GetMapping("/teamList")
	public ResponseObject getteamList() {
		
		//Impplement to get list of teams
		return null;
	}
	
	/*
	 * This end-point is used to get the leader board for available Teams. 
	 */
	@GetMapping("/getLeaderBoard")
	public ResponseObject getLeaderBoard() {
		ResponseObject response = new ResponseObject();
		response = service.leaderBoard();
		return response;
	}
	
	/*
	 * This end-point is used to add team details  to DB. 
	 */
	
	@PostMapping("/addTeam")
	public void addTeam(@RequestBody RequestJson request ) {
		
		// Implement to add/Edit team details
		service.saveTeam(request);
	}
	
}
