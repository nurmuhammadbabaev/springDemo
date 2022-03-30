package peaksoft.springdemo.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Data
public class CarRequest {
    @NotNull
    private String name;
    private String carModel;

}
