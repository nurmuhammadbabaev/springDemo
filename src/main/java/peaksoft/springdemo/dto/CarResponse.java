package peaksoft.springdemo.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Data
public class CarResponse {

    private Long id;
    private String name;
    private String carModel;
    private String madeIn;
    private Long price;

}
