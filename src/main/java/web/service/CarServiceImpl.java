package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.List;
import java.util.ArrayList;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2020));
        cars.add(new Car("Honda", "Accord", 2010));
        cars.add(new Car("Mazda", "CX-5", 2018));
        cars.add(new Car("Hyundai", "i30", 2022));
        cars.add(new Car("BMW", "X5", 2013));
    }

    @Override
    public List<Car> getCars(int count) {
        return count >= 5 ? cars : cars.subList(0, count);
    }
}