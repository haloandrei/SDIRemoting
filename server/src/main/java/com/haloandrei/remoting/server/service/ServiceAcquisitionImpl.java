package com.haloandrei.remoting.server.service;

import com.haloandrei.remoting.common.ServiceAcquisition;
import com.haloandrei.remoting.common.domain.Acquisition;
import com.haloandrei.remoting.common.domain.validators.MovieRentalException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ServiceAcquisitionImpl implements ServiceAcquisition {
    @Override
    public List<Acquisition> getAllAcquisitions() {
        return null;
    }

    @Override
    public void addAcquisition(Acquisition acquisition) throws MovieRentalException {

    }

    @Override
    public CompletableFuture<ArrayList<Acquisition>> getAllRents() {
        return null;
    }

    @Override
    public CompletableFuture<HashSet<String>> filterMoviesIfRented() {
        return null;
    }

    @Override
    public CompletableFuture<String> findMostRentedMovie() {
        return null;
    }
}
