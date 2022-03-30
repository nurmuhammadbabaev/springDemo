package peaksoft.springdemo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.springdemo.dto.CarRequest;
import peaksoft.springdemo.dto.CarResponse;
import peaksoft.springdemo.mapper.CarEditMapper;
import peaksoft.springdemo.mapper.CarViewMapper;
import peaksoft.springdemo.repositories.CarRepository;

@Service
@RequiredArgsConstructor
public class CarService {
    private final CarViewMapper viewMapper;
    private final CarRepository repository;
    private final CarEditMapper editMapper;

    public CarResponse create(CarRequest carRequest){

        return viewMapper.viewCar(repository.save(editMapper.create(carRequest)));
    }

    public CarResponse update(){
        return null;
    }

    public CarResponse getById(){
        return null;
    }

    public CarResponse deleteById(){
        return null;
    }

    public CarResponse getAllCars(){
        return null;
    }

}
