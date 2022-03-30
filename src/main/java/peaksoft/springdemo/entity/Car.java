package peaksoft.springdemo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "cars")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String carModel;
    private String madeIn;
    private Long price;

}
