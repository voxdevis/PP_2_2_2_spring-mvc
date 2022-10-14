
package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;


@Component
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCarslist(Integer count) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Hyundai", "Solaris", 2020));
        cars.add(new Car("BMW", "X5", 2015));
        cars.add(new Car("Audi", "A7", 2017));
        cars.add(new Car("Nissan", "Juke", 2019));
        cars.add(new Car("Volkswagen", "Tuareg", 1998));

        return cars.subList(0, count);
    }
}