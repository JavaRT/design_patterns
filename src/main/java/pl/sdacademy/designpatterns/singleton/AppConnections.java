package pl.sdacademy.designpatterns.singleton;

import java.util.ArrayList;
import java.util.List;

public class AppConnections {
    private static AppConnections instance;
    private List<String> connectedUser;
    private int currentConnectionsNum;

    public static AppConnections getInstance() {
        if (instance == null) {
            // tworzymy instancje
            instance = new AppConnections();

        }
        return instance;
    }

    private AppConnections() {
        connectedUser = new ArrayList<>();

    }

    public List<String> getConnectedUser() {
        return connectedUser;
    }

    public int getCurrentConnectionsNum() {
        return currentConnectionsNum;
    }

    public void connectUser(final String username) {
        if (!connectedUser.contains(username)) {
            connectedUser.add(username);
        }
        currentConnectionsNum++;


    }
}
