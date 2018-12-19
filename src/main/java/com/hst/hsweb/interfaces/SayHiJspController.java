package com.hst.hsweb.interfaces;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.glassfish.jersey.server.mvc.Viewable;
import org.seedstack.seed.Logging;
import org.slf4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/hi")
public class SayHiJspController {

    @Logging
    private Logger log;

    public String getName() {
        return name;
    }

    public String name = "hervé";

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/ftl")
    public Viewable sayHiFreemarker() {
        log.info("About to return a Viewable object");
        Viewable view = new Viewable("/freemarker/hello",this);
        return view;
    }

    @GET
    @Path("/jsp")
    @Produces(MediaType.TEXT_HTML)
    public Viewable sayHiJsp() {
        String jspPath = "/hello";
        log.info("About to return a Viewable object for {}", jspPath);
        Viewable view = new Viewable(jspPath);
        return view;
    }
}
