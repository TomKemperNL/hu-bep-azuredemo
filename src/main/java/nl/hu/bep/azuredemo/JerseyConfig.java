package nl.hu.bep.azuredemo;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/restservices")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {

        packages("nl.hu.bep.azuredemo.rest");
        register(new ServiceBinder());
    }
}
