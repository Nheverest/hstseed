package com.hst.hsweb.interfaces.rest;

import com.google.inject.Inject;
import com.hst.hsweb.application.ConfigurationUser;
import com.hst.hsweb.domain.model.client.Client;
import com.hst.hsweb.domain.model.client.ClientId;
import com.hst.hsweb.interfaces.data.client.ClientDTO;
import org.seedstack.business.domain.Repository;
import org.seedstack.seed.Configuration;

import javax.ws.rs.*;


@Path("hola")
public class HolaResource {

    @GET
    @Produces("application/json")
    public String hello() {
        return "{\"message\": \"Hola\"}";
    }
}
