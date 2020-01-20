package com.hst.hsweb.interfaces.rest;

import com.google.inject.Inject;
import com.hst.hsweb.domain.model.client.ClientId;
import com.hst.hsweb.interfaces.data.client.ClientDTO;
import org.seedstack.business.domain.Repository;
import org.seedstack.seed.Configuration;


import com.hst.hsweb.domain.model.client.Client;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("hello")
public class HelloResource {

    @Inject
    private Repository<Client, ClientId> clientRepository;

    @Inject
    ClientAssembler assembler;

    @Configuration("properties.user")
    private String name;

    @Path("/{idclient}")
    @GET
    public String hello(@PathParam("idclient") String idclient) {
        Client client = clientRepository.get(new ClientId(idclient)).orElseThrow(NotFoundException::new);
        ClientDTO dto = assembler.customAssemble(client);
        return dto.getCode();
    }

    @GET
    public String hello() {
        return "Hello " + name + "!";
    }
}
