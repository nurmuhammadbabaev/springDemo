package peaksoft.springdemo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import peaksoft.springdemo.dto.CarRequest;
import peaksoft.springdemo.dto.CarResponse;
import peaksoft.springdemo.service.CarService;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/car")
public class CarController {
    private final CarService service;

    @PostMapping("/save")
    public CarResponse create(@RequestBody @Valid CarRequest carRequest){
        return service.create(carRequest);
    }

}
