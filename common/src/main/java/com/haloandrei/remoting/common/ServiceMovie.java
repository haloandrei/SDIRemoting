package com.haloandrei.remoting.common;

import com.haloandrei.remoting.common.domain.Movie;
import com.haloandrei.remoting.common.domain.validators.ValidatorException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public interface ServiceMovie {

    Future<List<Movie>> getSortedMovies();

    void addMovie(Movie movie) throws ValidatorException;

    void deleteMovie(Integer id) throws ValidatorException;

    void updateMovie(Movie movie) throws ValidatorException;

    ArrayList<Movie> getAllMovies();

}
