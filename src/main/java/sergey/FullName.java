package sergey;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FullName {
    private String firstName;
    private String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
