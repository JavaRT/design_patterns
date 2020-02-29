package pl.sdacademy.designpatterns.factory;

import pl.sdacademy.designpatterns.factory.car.Car;
import pl.sdacademy.designpatterns.factory.car.FactoryCategory;

public class FactoryDemo {
    // w edit configuration / program argument dodajemy SEDAN TC
    public static void main(String[] args) {
        final FactoryCategory category = FactoryCategory.valueOf(args[0]);
        final String type = args[1];
        final Car car = new FactoryProvider().createFactory(category).create(type);
        System.out.println(car.getBodyType());
        System.out.println(car.getModelName());
        System.out.println(car.getEngineVolume());
        System.out.println(car.getType());
        System.out.println(car.getCylindersNum());

    }
}
