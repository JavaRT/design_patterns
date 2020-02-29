package pl.sdacademy.designpatterns.factory;

import pl.sdacademy.designpatterns.factory.car.*;

public class SedanCarFactory implements AbstractFactory<Car> {
    //A4 - audi, diesel, 1.9tdi, 4c
    //A6 - audi, diesel, 2.7tdi, 4c
    //TC - toyota, benz, 1.8, 4c
    @Override
    public Car create(final String type) {
        switch (type) {
            case "a4":
                return createA4Sedan();
            case "a6":
                return createA6Sedan();
            case "TC":
                return createTCSedan();
        }
        throw new RuntimeException("unknown sedan type");
    }

        private Car createA4Sedan () {
            return new Audi("audi a4", EngineType.DIESEL, 1.9, 4, BodyType.SEDAN);

        }

        private Car createA6Sedan () {
            return new Audi("audi a6", EngineType.DIESEL, 2.7, 4, BodyType.SEDAN);
        }

        private Car createTCSedan () {
            return new Toyota("Corolla", EngineType.GASOLINE_NATURALLY_ASPIRATED, 1.8, 4, BodyType.SEDAN);
        }

    }
