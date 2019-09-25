package com.junglee.common;

public class LeaderBoardResponse {

	/*
	 * This Class is used to send the Leader board Response having Details of Name of Team, Teams Score and Rank.
	 */

	private String name;
	
	private Double score;
	
	private Integer rank;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return "LeaderBoardResponse [name=\t" + name + ", score=\t" + score + ", rank=\t" + rank + "]";
	}
	
}
