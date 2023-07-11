package com.caiquegomes.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiquegomes.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
