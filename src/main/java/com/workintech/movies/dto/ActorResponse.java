package com.workintech.movies.dto;

import java.time.LocalDate;

public record ActorResponse(long id, String firstName, String lastName, String gender, LocalDate birthDate) {
    
}
