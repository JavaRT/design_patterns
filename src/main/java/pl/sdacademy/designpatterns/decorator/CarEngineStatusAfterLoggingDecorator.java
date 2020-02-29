package pl.sdacademy.designpatterns.decorator;

public class CarEngineStatusAfterLoggingDecorator implements EngineStarter  {

    private final EngineStarter engineStarter;

    public CarEngineStatusAfterLoggingDecorator(final EngineStarter engineStarter) {
        this.engineStarter = engineStarter;
    }
    @Override
    public void startEngine() {
        engineStarter.startEngine();
        System.out.println("engine started");
    }
    @Override
    public void stopEngine() {
        engineStarter.stopEngine();
        System.out.println("engine has stopped");
    }
}
