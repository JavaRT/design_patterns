package pl.sdacademy.designpatterns.adapter;

import pl.sdacademy.designpatterns.adapter.systema.SystemAUser;
import pl.sdacademy.designpatterns.adapter.systemb.SystemBUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AdapterDemo {
    public static void main(String[] args) {
        final List<User> users = new ArrayList<>();
        final SystemAUser userA = new SystemAUser ("imie", "nazw", 22L, List.of("USER"));
        final SystemAUser userA2 = new SystemAUser ("imiee", "nazww", 21L, List.of("ADMIN"));
        final SystemBUser userB = new SystemBUser ("imieee", "nazwww", "20", Set.of("USER", "WIEDZAMIN"));
        users.add(new SystemAUserAdapter(userA));
        users.add(new SystemAUserAdapter(userA2));
        users.add(new SystemBUserAdapter(userB));
        users.forEach(user -> System.out.println(user.toReadableString()));
    }
}
