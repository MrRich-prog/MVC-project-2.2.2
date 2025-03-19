package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private final List<Car> cars = new ArrayList<>();

    public CarService() {
        cars.add(new Car("FX2", "Ford", 1999));
        cars.add(new Car("RS12", "Toyota", 2001));
        cars.add(new Car("MK11", "Volga", 1983));
        cars.add(new Car("PR00", "Rio", 2013));
        cars.add(new Car("XYZ", "Mustang", 2025));
    }

    public List<Car> getCars(int count) {
        List<Car> result = new ArrayList<>();
        for (int i = 0; i < count ; i++) {
            result.add(cars.get(i));
        }
        return result;
    }

    public int getCountsCar() {
        return cars.size();
    }

}
