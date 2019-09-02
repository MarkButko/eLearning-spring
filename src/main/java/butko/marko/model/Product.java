package butko.marko.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
    private long id;
    private String name;
}
