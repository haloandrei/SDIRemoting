package com.haloandrei.remoting.common;

import com.haloandrei.remoting.common.domain.Client;
import com.haloandrei.remoting.common.domain.Movie;
import com.haloandrei.remoting.common.domain.validators.ValidatorException;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

public interface ServiceClient {
    void addClient(Client client) throws ValidatorException;

    void deleteClient(Client id) throws ValidatorException;

    void updateMovie(Client client) throws ValidatorException;

    ArrayList<Client> getAllClients();

}
