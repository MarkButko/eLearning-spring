package butko.marko.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {
    private City city;
    private String detailed;
}
