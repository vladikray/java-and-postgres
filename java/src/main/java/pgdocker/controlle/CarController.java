package pgdocker.controlle;

import org.springframework.web.bind.annotation.*;

import pgdocker.domain.Car;
import pgdocker.repository.CarRepository;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CarController {

    final private CarRepository carRepository;


    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping("/cars")
    List<Car> getAll(){
        return carRepository.findAll();
    }

    @PostMapping("/cars")
    Car create(@RequestBody Car car){
        return carRepository.save(car);
    }
}
