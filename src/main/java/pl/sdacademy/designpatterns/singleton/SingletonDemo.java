package pl.sdacademy.designpatterns.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        final Counter counterA = Counter.getInstance();
        final Counter counterB = Counter.getInstance();
        counterA.addOne();
        counterA.addTwo();
        counterB.addThree();
        counterB.addTwo();
        counterA.addThree();
        counterB.addTwo();
        final AppConnections appConnectionsA = AppConnections.getInstance();
        final AppConnections appConnectionsB = AppConnections.getInstance();
        appConnectionsA.connectUser("A");
        appConnectionsB.connectUser("B");
        appConnectionsA.connectUser("C");
        System.out.println(appConnectionsA.getCurrentConnectionsNum());
        System.out.println(appConnectionsB.getCurrentConnectionsNum());
        System.out.println(appConnectionsA.getConnectedUser().size());
        System.out.println(appConnectionsB.getConnectedUser().size());

    }

}
