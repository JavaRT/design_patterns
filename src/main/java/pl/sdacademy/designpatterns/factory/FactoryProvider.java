package pl.sdacademy.designpatterns.factory;

import pl.sdacademy.designpatterns.factory.car.Car;
import pl.sdacademy.designpatterns.factory.car.FactoryCategory;

public class FactoryProvider {
    public AbstractFactory<Car> createFactory (final FactoryCategory category){
        switch (category) {
            case COMBIS:
                return new CombiCarFactory();
            case SEDANS:
                return new SedanCarFactory();
        }
        throw new RuntimeException("unknown kactory type");

    }
}
