package pl.sdacademy.designpatterns.singleton;

public class Counter {
    private static final Counter INSTANCE = new Counter();
    private int value = 0;

    public static Counter getInstance() {
        return INSTANCE;
    }

    private Counter() {

    }
    public void addOne(){
        value++;
        System.out.println("value is = " + value);
    }
public void addTwo (){
        value +=2;
    System.out.println("value + 2 = "+ value);
}
public void addThree(){
        value +=3;
    System.out.println("value + 3 = " + value);
}
}
