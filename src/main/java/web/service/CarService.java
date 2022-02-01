package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Honda", 2008, "Japan"));
        cars.add(new Car("Audi", 2014, "Slovakia"));
        cars.add(new Car("BMW", 2018, "USA"));
        cars.add(new Car("Tesla", 2019, "USA"));
        cars.add(new Car("Lexus", 2017, "Japan"));
    }

    public List<Car> peopleList(int count){
        List<Car> listOfCars = new ArrayList<>();
        int a = 0;
        if (count >= 5){
            return cars;
        }
        while (a != count) {
            listOfCars.add(cars.get(a));
            a++;
        }
        return listOfCars;
    }
}
