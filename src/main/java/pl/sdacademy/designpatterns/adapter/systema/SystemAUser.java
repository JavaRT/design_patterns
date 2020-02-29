package pl.sdacademy.designpatterns.adapter.systema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SystemAUser {
    private String firstName;
    private String lastName;
    private long age;
    private List<String> roles;
}
