package pl.sdacademy.designpatterns.adapter;

import java.util.List;

public interface User {
    String getFullname();
    String getUsername();
    Integer getAge();
    List<String> getRoles();
    default String toReadableString(){
        return getFullname() + " " + getUsername() + " " + getAge() + " " + getRoles() ;
    }
}
