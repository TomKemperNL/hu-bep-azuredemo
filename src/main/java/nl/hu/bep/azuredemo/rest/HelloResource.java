package nl.hu.bep.azuredemo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloResource {
    @GET
    public String hello(){
        return "Hello!";
    }
}
