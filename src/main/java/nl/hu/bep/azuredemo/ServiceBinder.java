package nl.hu.bep.azuredemo;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

import javax.inject.Singleton;

public class ServiceBinder extends AbstractBinder {
    @Override
    protected void configure() {
        //Dit maakt 1 HelloServiceImpl instantie die hergebruikt wordt:
        //bind(HelloServiceImpl.class).to(HelloService.class).in(Singleton.class);

        //Dit maakt elk request een nieuwe HelloServiceImpl instantie:
        bind(HelloServiceImpl.class).to(HelloService.class);

        //De één is niet noodzakelijk beter dan de ander, maar per situatie kan de één handiger zijn dan de andere.
    }
}
