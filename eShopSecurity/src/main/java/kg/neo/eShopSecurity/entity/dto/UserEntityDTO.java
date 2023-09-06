package kg.neo.eShopSecurity.entity.dto;

import lombok.Data;

@Data
public class UserEntityDTO {
    Long id;
    String firstName;
    String lastName;
    String email;
    String phone;
}
