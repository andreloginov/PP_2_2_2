package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDAO {
    void createListUsers();
    List<Car> getListCars(Integer number);
}
