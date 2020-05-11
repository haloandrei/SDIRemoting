package com.haloandrei.remoting.common;

import com.haloandrei.remoting.common.domain.Movie;
import com.haloandrei.remoting.common.domain.validators.MovieRentalException;
import com.haloandrei.remoting.common.domain.validators.ValidatorException;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

public interface ServiceClient {
    CompletableFuture<ArrayList<Movie>> getSortedMovies();

    void addMovie(Movie movie) throws ValidatorException;

    void deleteMovie(Integer id) throws ValidatorException;

    void updateMovie(Movie movie) throws ValidatorException;

    CompletableFuture<ArrayList<Movie>> getAllMovies();

}
