package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

import web.service.CarServiceImpl;

@Controller
//@RequestMapping(value = "/cars")
public class CarController {

    @GetMapping(value = "/cars")
    public String getCars(ModelMap model, HttpServletRequest request) {
       // @RequestParam("count") int count

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Hyundai", "Solaris", 2020));
        cars.add(new Car("BMW", "X5", 2015));
        cars.add(new Car("Audi", "A7", 2017));
        cars.add(new Car("Nissan", "Juke", 2019));
        cars.add(new Car("Volkswagen", "Tuareg", 1998));



        if (CarServiceImpl.isOKCount(request.getParameter("count"))) {
            int count = Integer.parseInt(request.getParameter("count"));
            cars = CarServiceImpl.cutCarsList(cars, count);
        }



        model.addAttribute("cars", cars);
        return "cars";
    }
}
