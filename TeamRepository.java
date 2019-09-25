package com.junglee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.junglee.model.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {


	/*
	 * Repository to communicate with DB based on Team.
	 */
}
