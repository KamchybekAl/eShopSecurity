package kg.neo.eShopSecurity.entity.dto;

import lombok.Data;

@Data
public class ProductDTO {
    Long id;
    String name;
    Double weight;
    String description;
    Integer quantity;
    Boolean isAvailable;
}
