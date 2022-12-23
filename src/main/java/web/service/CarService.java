package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    public void createListUsers();
    public List<Car> getListCars(Integer number);
}
