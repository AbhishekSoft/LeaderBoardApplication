package com.junglee.common;

public class PlayerRequest {
	
	/*
	 * This class is used to get request from Client for the Player.
	 */

	private Long id;
	
	private String name;
	
	private String playingStyleDesc;
	
	private Float score;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlayingStyleDesc() {
		return playingStyleDesc;
	}

	public void setPlayingStyleDesc(String playingStyleDesc) {
		this.playingStyleDesc = playingStyleDesc;
	}

	public Float getScore() {
		return score;
	}

	public void setScore(Float score) {
		this.score = score;
	}
	
	
}
