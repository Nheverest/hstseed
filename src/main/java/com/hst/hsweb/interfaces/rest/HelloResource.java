package com.hst.hsweb.interfaces.rest;

import com.google.inject.Inject;
import com.hst.hsweb.domain.model.client.ClientId;
import org.seedstack.business.domain.Repository;
import org.seedstack.seed.Configuration;


import com.hst.hsweb.domain.model.client.Client;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("hello")
public class HelloResource {

    @Inject
    private Repository<Client, ClientId> clientRepository;

    @Configuration("properties.user")
    private String name;

    @Path("/{idclient}")
    @GET
    public String hello(@PathParam("idclient") String idclient) {
        return clientRepository.get(new ClientId(idclient)).map(com.hst.hsweb.domain.model.client.Client::getCode).orElseThrow(NotFoundException::new);
    }

    @GET
    public String hello() {
        return "Hello " + name + "!";
    }
}
