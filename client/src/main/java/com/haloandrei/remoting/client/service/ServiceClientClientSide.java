package com.haloandrei.remoting.client.service;

import com.haloandrei.remoting.common.ServiceClient;
import com.haloandrei.remoting.common.domain.Client;
import com.haloandrei.remoting.common.domain.Movie;
import com.haloandrei.remoting.common.domain.validators.ValidatorException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

public class ServiceClientClientSide implements ServiceClient {

    @Autowired
    private ServiceClient serviceClient;

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
        return serviceClient.getAllClients();
    }
}
