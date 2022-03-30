package peaksoft.springdemo.mapper;

import org.springframework.stereotype.Component;
import peaksoft.springdemo.dto.CarResponse;
import peaksoft.springdemo.entity.Car;

import java.util.List;

@Component
public class CarViewMapper {

    public CarResponse viewCar(Car car){
        if(car==null){
            return null;
        }
        CarResponse response=new CarResponse();
        if(car.getId()!=null){
            response.setId(car.getId());
        }
        response.setName(car.getName());
        response.setCarModel(car.getCarModel());
        response.setMadeIn(car.getMadeIn());
        response.setPrice(car.getPrice());
        return response;
    }

    public List<CarResponse> viewCars(Car car){

        return null;
    }
}
