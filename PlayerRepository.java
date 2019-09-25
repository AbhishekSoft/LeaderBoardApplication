package com.junglee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.junglee.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
	/*
	 * Repository to communicate with DB based on players.
	 */

}
