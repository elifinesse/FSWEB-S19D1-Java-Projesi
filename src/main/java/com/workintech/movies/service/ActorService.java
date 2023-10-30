package com.workintech.movies.service;

import java.util.List;

import com.workintech.movies.entity.Actor;


public interface ActorService {
    List<Actor> findAll();
    Actor findById(long id);
    Actor save(Actor actor);
    Actor delete(long id);
}
