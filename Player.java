package com.junglee.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="player_table")
public class Player {
	
	/*
	 * Entity class to Store Player Details
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
