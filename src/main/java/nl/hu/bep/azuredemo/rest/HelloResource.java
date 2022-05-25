package nl.hu.bep.azuredemo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Providers;

@Path("/hello")
public class HelloResource {
    private HelloService service;

    public HelloResource(@Context Providers providers){
        this.service = providers.getContextResolver(HelloService.class, MediaType.WILDCARD_TYPE).getContext(HelloService.class);
    }

    @GET
    public String hello(){
        return this.service.getMessage();
    }
}
