package org.anitab.controller;

import java.util.List;

import org.anitab.model.Apartment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApartmentController {

    @GetMapping("/")
    public List<Apartment> getApartments() {
        Apartment a1 = new Apartment("abc street", 2, 1.5f, 2000);
        Apartment a2 = new Apartment("xyz street", 1, 1.0f, 1500);
        return List.of(a1, a2);
    }
    @GetMapping("/cheapest")
    public Apartment getCheapest() {
        Apartment a1 = new Apartment("abc street", 2, 1.5f, 2000);
        Apartment a2 = new Apartment("xyz street", 1, 1.0f, 1500);
        if (a1.getPrice() < a2.getPrice()) {
            return a1;
        }
        return a2;
    }
}
//package org.anitab.spring.home_sweet_hunt;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.List;
//
//@Controller
//public class ApartmentController {
//
//    @GetMapping("/")
//    @ResponseBody
//    public List<Apartment> getApartments() {
//        Apartment a1 = new Apartment("abc street", 2, 1.5f, 2000);
//        Apartment a2 = new Apartment("xyz street", 1, 1.0f, 1500);
//        return List.of(a1, a2);
//    }
//
//    @GetMapping("/cheapest")
//    @ResponseBody
//    public Apartment getCheapest() {
//        Apartment a1 = new Apartment("abc street", 2, 1.5f, 2000);
//        Apartment a2 = new Apartment("xyz street", 1, 1.0f, 1500);
//        if (a1.getPrice() < a2.getPrice()) {
//            return a1;
//        }
//        return a2;
//    }
//
//}
