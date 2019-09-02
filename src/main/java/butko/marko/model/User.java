package butko.marko.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Singular;

import java.util.List;
import java.util.Set;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class User {
    private long id;
    private String name;
    @Singular
    private Set<User> friends;
    private Address address;
    @Singular
    private List<Product> products;
}
