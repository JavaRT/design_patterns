package pl.sdacademy.designpatterns.observer;

public class ByTenChangeObserver extends Observer {
    private int previousState;

    public ByTenChangeObserver(final Subject subject) {
        super(subject);
        previousState = subject.getState();

    }

    @Override
    public void update() {
        if (Math.abs(subject.getState() - previousState) >= 10) {
            System.out.println("Value changed by ten " + subject.getState());
        }
        previousState = subject.getState();
    }
}

