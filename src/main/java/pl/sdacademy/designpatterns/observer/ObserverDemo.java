package pl.sdacademy.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverDemo {
    public static void main(String[] args) {
        final Subject subject = new Subject();
        final Observer observerA = new SpecificValueObserver(subject);
        final Observer observerB = new ValueOfLowerObserver(subject);
        final Observer observerC = new ByTenChangeObserver(subject);
        subject.changeStateBy(-1);
        subject.changeStateBy(2);
        subject.changeStateBy(13);
        subject.changeStateBy(1);
        subject.changeStateBy(-5);

        final List<Integer> x = new ArrayList<>();
        final List<Integer> y = new ArrayList<>(x);
        final List<Integer> z = x;
        z.add(1);
        System.out.println(y.size());
    }
}
