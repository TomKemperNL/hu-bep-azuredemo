package nl.hu.bep.azuredemo.rest;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

@Provider
public class HelloServiceProvider implements ContextResolver<HelloService> {
    @Override
    public HelloService getContext(Class<?> type) {
        return new HelloService();
    }
}
