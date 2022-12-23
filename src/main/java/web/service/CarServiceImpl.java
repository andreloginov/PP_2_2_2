package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> carList;
    @Override
    public void createListUsers() {
        carList = Arrays.asList(
                new Car("Lada", 100, "black"),
                new Car("BMW", 500, "white"),
                new Car("Mercedes", 600, "red"),
                new Car("Toyota", 300, "black"),
                new Car("Lexus", 450, "yellow")
        );
    }

    @Override
    public List<Car> getListCars(Integer count) {
        // если пользователь не указал count или указал, но отрицальное значение
        if (count == null) {
            count = carList.size();
        } else if (count < 0) {
            count = 0;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }


}
