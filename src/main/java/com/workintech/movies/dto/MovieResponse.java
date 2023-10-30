package com.workintech.movies.dto;

import java.time.LocalDate;

public record MovieResponse(long id, String name, String directorName, double rating, LocalDate releaseDate) {
    
}
