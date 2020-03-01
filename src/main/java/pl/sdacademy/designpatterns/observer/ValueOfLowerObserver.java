package pl.sdacademy.designpatterns.observer;

public class ValueOfLowerObserver extends Observer {
    private int previousState;

    public ValueOfLowerObserver(Subject subject) {
        super(subject);
        previousState = subject.getState();
    }

    @Override
    public void update() {
        if (subject.getState() < previousState) {
            System.out.println("value lower and now is: " + subject.getState());
        }
        previousState = subject.getState();
    }
}
