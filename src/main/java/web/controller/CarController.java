package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
@RequestMapping ("/cars")
public class CarController {
    @GetMapping(value = "")
    public String getAllListOfCars(Model model, @RequestParam(required = false) Integer count) {
        CarService carService = new CarServiceImpl();
        carService.createListUsers();
        model.addAttribute("car", carService.getListCars(count));

        return "cars";
    }
}
