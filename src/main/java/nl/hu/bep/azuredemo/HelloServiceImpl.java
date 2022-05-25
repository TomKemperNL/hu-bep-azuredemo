package nl.hu.bep.azuredemo;

public class HelloServiceImpl implements HelloService {

    public HelloServiceImpl(){
        System.out.println("Ik wordt geconstruct!");
    }


    public String getMessage(){
        return "Hello World";
    }
}
