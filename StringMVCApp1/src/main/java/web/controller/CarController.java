package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import web.Car;

import javax.servlet.http.HttpServletRequest;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCar(Model model, HttpServletRequest request) {
        String s1=request.getParameter("count");
        List<Car> messages=new ArrayList<>();
        if (s1==null){
            messages = Car.getListCars();
        } else {
            for (int i=0;i<Integer.parseInt(s1)&&i<5;i++){
                messages.add(Car.getListCars().get(i));
            }
        }
        model.addAttribute("Car", messages);
        return "Cars";
    }
}
