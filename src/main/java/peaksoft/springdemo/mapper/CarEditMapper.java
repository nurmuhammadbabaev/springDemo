package peaksoft.springdemo.mapper;

import org.springframework.stereotype.Component;
import peaksoft.springdemo.dto.CarRequest;
import peaksoft.springdemo.entity.Car;

@Component
public class CarEditMapper {

    public Car create(CarRequest carRequest){
        if(carRequest==null){
            return null;
        }
        Car car=new Car();
        car.setName(carRequest.getName());
        car.setCarModel(carRequest.getCarModel());
        return car;
    }

    public void update(Car car,CarRequest carRequest){
        car.setName(carRequest.getName());
        car.setCarModel(carRequest.getCarModel());

    }
}
