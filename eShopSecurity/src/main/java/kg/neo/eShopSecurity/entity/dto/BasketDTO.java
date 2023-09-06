package kg.neo.eShopSecurity.entity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class BasketDTO {
    Long id;
    @JsonFormat(pattern = "dd-MM-yyyy")
    LocalDate date;

}
