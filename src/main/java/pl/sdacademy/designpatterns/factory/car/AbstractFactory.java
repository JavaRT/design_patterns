package pl.sdacademy.designpatterns.factory.car;

public interface AbstractFactory<T> {
    T create(String type);

}
