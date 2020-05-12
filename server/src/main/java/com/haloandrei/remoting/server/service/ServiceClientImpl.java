package com.haloandrei.remoting.server.service;

import com.haloandrei.remoting.common.ServiceClient;
import com.haloandrei.remoting.common.domain.Client;
import com.haloandrei.remoting.common.domain.Movie;
import com.haloandrei.remoting.common.domain.validators.ValidatorException;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

public class ServiceClientImpl implements ServiceClient {

    @Override
    public void addClient(Client client) throws ValidatorException {

    }

    @Override
    public void deleteClient(Client id) throws ValidatorException {

    }

    @Override
    public void updateMovie(Client client) throws ValidatorException {

    }

    @Override
    public ArrayList<Client> getAllClients() {
        ArrayList<Client> list = new ArrayList<>();
        // new Movie("a","b",10,10)
        list.add(new Client("John",21));
        list.add(new Client("Snow",21));

        return list;

    }
}
