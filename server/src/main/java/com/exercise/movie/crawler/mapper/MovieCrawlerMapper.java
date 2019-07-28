package com.exercise.movie.crawler.mapper;

import com.exercise.movie.crawler.vo.MovieCrawler;
import com.exercise.movie.movie.Movie;
import java.util.Collections;
import org.springframework.stereotype.Service;

@Service
public class MovieCrawlerMapper {

  public Movie movieCrawlerToMovie(MovieCrawler movieCrawler) {
    return new Movie()
        .title(movieCrawler.getTitle())
        .backdropPath(movieCrawler.getBackdropPath())
        .posterPath(movieCrawler.getPosterPath())
        .adult(movieCrawler.getAdult())
        .originalTitle(movieCrawler.getOriginalTitle())
//        .overview(movieCrawler.getOverview().substring(0, 250))
        .releaseDate(movieCrawler.getReleaseDate())
        .video(movieCrawler.getVideo())
        .genres(Collections.emptySet())
        .comments(Collections.emptySet())
        .movielists(Collections.emptySet())
        .voteAverage(movieCrawler.getVoteAverage())
        .popularity(movieCrawler.getPopularity());
  }
}