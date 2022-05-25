package nl.hu.bep.azuredemo.rest;

import nl.hu.bep.azuredemo.HelloService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloResource {
    private HelloService service;

    @Inject
    public HelloResource(HelloService service){
        this.service = service;
    }

    @GET
    public String hello(){
        return this.service.getMessage();
    }
}
