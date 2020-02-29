package pl.sdacademy.designpatterns.adapter;

import pl.sdacademy.designpatterns.adapter.systema.SystemAUser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SystemAUserAdapter implements User {


    private static final Map<String, Integer> usernameToIndex = new HashMap<>();

    private final SystemAUser systemAUser;

    SystemAUserAdapter(final SystemAUser systemAUser) {
        this.systemAUser = systemAUser;
    }

    @Override
    public String getFullname() {
        return systemAUser.getFirstName() + " " + systemAUser.getLastName();
    }

    @Override
    public String getUsername() {
        final String userNameBase = systemAUser.getFirstName() + " " + systemAUser.getLastName();
        int index;
        if (!usernameToIndex.containsKey(userNameBase)) {
            usernameToIndex.put(userNameBase, 1);
            index = 1;
        } else {
            final int lastIndex = usernameToIndex.get(userNameBase);
            usernameToIndex.put(userNameBase, lastIndex + 1);
            index = lastIndex + 1;
        }
        return userNameBase + index;
    }

    @Override
    public Integer getAge() {
        return (int)systemAUser.getAge();
    }

    @Override
    public List<String> getRoles() {
        return systemAUser.getRoles();
    }
}
