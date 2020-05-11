package com.haloandrei.remoting.common;

import com.haloandrei.remoting.common.domain.Acquisition;
import com.haloandrei.remoting.common.domain.validators.MovieRentalException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ServiceAcquisition {
    List<Acquisition> getAllAcquisitions();
    void addAcquisition(Acquisition acquisition) throws MovieRentalException;

    CompletableFuture<ArrayList<Acquisition>> getAllRents();

    CompletableFuture<HashSet<String>> filterMoviesIfRented();

    CompletableFuture<String> findMostRentedMovie();
}
