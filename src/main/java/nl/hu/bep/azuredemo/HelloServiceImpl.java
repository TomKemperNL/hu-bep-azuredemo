package nl.hu.bep.azuredemo;

import org.jvnet.hk2.annotations.Service;

@Service
public class HelloServiceImpl implements HelloService {
    public String getMessage(){
        return "Hello World";
    }
}
