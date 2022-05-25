package nl.hu.bep.azuredemo;

import org.jvnet.hk2.annotations.Contract;

@Contract
public interface HelloService {
    String getMessage();
}
