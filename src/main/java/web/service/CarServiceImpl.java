package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars;

    public CarServiceImpl() {
        cars = Arrays.asList(
                new Car("Toyota", "Camry", 2020),
                new Car("Honda", "Accord", 2010),
                new Car("Mazda", "CX-5", 2018),
                new Car("Hyundai", "i30", 2022),
                new Car("BMW", "X5", 2013)
        );
    }

    @Override
    public List<Car> getCars(int count) {
        return count >= 5 ? cars : cars.subList(0, count);
    }
}