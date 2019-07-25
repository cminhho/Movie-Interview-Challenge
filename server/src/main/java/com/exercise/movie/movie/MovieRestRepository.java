package com.exercise.movie.movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "movie")
public interface MovieRestRepository extends JpaRepository<Movie, Long> {
}