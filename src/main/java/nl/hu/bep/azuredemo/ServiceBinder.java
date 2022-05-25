package nl.hu.bep.azuredemo;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

public class ServiceBinder extends AbstractBinder {
    @Override
    protected void configure() {
        bind(HelloServiceImpl.class).to(HelloService.class);

    }
}
