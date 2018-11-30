package com.hst.hsweb.interfaces.rest;

import org.seedstack.seed.Configuration;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
public class HelloResource {

    @Configuration("properties.user")
    private String name;
    @GET
    public String hello() {
        return "Hello " + name + "!";
    }
}
