package com.junglee.service;

import com.junglee.common.RequestJson;
import com.junglee.common.ResponseObject;
import com.junglee.model.Team;

public interface LeaderService {

	/*
	 * This service Saves the Team Details
	 */
	public void saveTeam(RequestJson request);

	/*
	 * This service assigns the indivisual player score
	 */
	public void assignPlayerScore();

	/*
	 * This service calculates Total scores of Team
	 */
	public void calculateTotalScore(Team team);

	/*
	 * This service generated Leader board
	 */
	public ResponseObject leaderBoard();
	
	// add  other methods as needed. 
}
