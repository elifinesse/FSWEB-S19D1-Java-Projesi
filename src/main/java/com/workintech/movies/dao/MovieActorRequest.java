package com.workintech.movies.dao;

import java.util.List;

import com.workintech.movies.entity.Actor;
import com.workintech.movies.entity.Movie;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MovieActorRequest {
    private Movie movie;
    private List<Actor> actors;
}
