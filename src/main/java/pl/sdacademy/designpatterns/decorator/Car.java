package pl.sdacademy.designpatterns.decorator;

public class Car implements EngineStarter {

    private boolean isStarted = false;

    @Override
    public void startEngine() {
        isStarted = true;
    }

    @Override
    public void stopEngine() {
        isStarted = false;
    }
}
