package com.junglee.common;

import java.util.List;

import com.junglee.model.Player;

public class RequestJson {

	/*
	 * This class is used to get request from Client for the Team. it contains team details and Players List.
	 */
	private Long id;
	
	private Long teamId;
	
	private String teamName;
	
	private Long userId;
	
	private Long matchid;
	
	private Integer captainId;
	
	private Integer vCaptainId;
	
	private Float totalScore;
	
	private List<Player> playerList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTeamId() {
		return teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getMatchid() {
		return matchid;
	}

	public void setMatchid(Long matchid) {
		this.matchid = matchid;
	}

	public Integer getCaptainId() {
		return captainId;
	}

	public void setCaptainId(Integer captainId) {
		this.captainId = captainId;
	}

	public Integer getvCaptainId() {
		return vCaptainId;
	}

	public void setvCaptainId(Integer vCaptainId) {
		this.vCaptainId = vCaptainId;
	}

	public Float getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(Float totalScore) {
		this.totalScore = totalScore;
	}

	public List<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}
}
