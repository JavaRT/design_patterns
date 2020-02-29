package pl.sdacademy.designpatterns.decorator;

public class CarEngineStatusBeforeLoggingDecorator implements EngineStarter {

    private final EngineStarter engineStarter;

    public CarEngineStatusBeforeLoggingDecorator(EngineStarter engineStarter) {
        this.engineStarter = engineStarter;
    }

    @Override
    public void startEngine() {
        System.out.println("starting engine");
        engineStarter.startEngine();
    }

    @Override
    public void stopEngine() {
        System.out.println("stopping engine");
        engineStarter.stopEngine();
    }
}
