package pl.sdacademy.designpatterns.factory;

import pl.sdacademy.designpatterns.factory.car.Audi;
import pl.sdacademy.designpatterns.factory.car.BodyType;
import pl.sdacademy.designpatterns.factory.car.Car;
import pl.sdacademy.designpatterns.factory.car.EngineType;

public class CombiCarFactory implements AbstractFactory<Car> {
    //a4 -audi 2.5, 6c, diesel
    //a6- 3.3 , 8c , diesel
    //tc - 2.0 , 4c, benz
    @Override
    public Car create(final String type) {
        switch (type) {
            case "a4":
                return createA4Combi();
            case "a6":
                return createA6Combi();
            case "TC":
                return createTCCombi();
        }
        throw new RuntimeException("unknown sedan type");
    }

    private Car createA4Combi() {
        return new Audi("audi a4", EngineType.DIESEL, 2.5, 6, BodyType.COMBI);

    }

    private Car createA6Combi() {
        return new Audi("audi a6", EngineType.DIESEL, 3.3, 8, BodyType.COMBI);
    }

    private Car createTCCombi() {
        return new Audi("Corolla", EngineType.GASOLINE_NATURALLY_ASPIRATED, 2.0, 4, BodyType.COMBI);
    }

}