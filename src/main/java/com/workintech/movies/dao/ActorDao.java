package com.workintech.movies.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workintech.movies.entity.Actor;

public interface ActorDao extends JpaRepository<Actor, Long>{
    
}
