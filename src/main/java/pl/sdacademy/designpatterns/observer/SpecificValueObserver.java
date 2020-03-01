package pl.sdacademy.designpatterns.observer;

public class SpecificValueObserver extends Observer {

    public SpecificValueObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("specific value observer: "+ subject.getState());

    }
}
