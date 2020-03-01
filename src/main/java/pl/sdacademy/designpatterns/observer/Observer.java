package pl.sdacademy.designpatterns.observer;

public abstract class Observer {
    protected Subject subject;

    public Observer(final Subject subject) {
        this.subject = subject;
        subject.subscribe(this);
    }

    public abstract void update();

}

