package md.utm.restservice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@ToString
@NoArgsConstructor
@EqualsAndHashCode
public class Employee {
    @Id @GeneratedValue @Getter @Setter
    private Long id;

    @Getter @Setter
    private String firstName;

    @Getter @Setter
    private String lastName;

    @Getter @Setter
    private String role;

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public void setName(String name) {
        String[] parts = name.split(" ");
        this.firstName = parts[0];
        this.lastName = parts[1];
    }
}