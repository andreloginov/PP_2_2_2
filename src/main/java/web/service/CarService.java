package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    void createListUsers();
    List<Car> getListCars(Integer number);
}
