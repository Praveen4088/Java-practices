package interfaces;

public class car implements engine,brake{
    @Override
    public void brake() {
        System.out.println("I am applying brake");
    }

    @Override
    public void stop() {
        System.out.println("I am stopping the vehicle");

    }

    @Override
    public void start() {
        System.out.println("I am starting the vehicle");

    }

    @Override
    public void accelerate() {
        System.out.println("I am increasing the vehicle speed");

    }
}
