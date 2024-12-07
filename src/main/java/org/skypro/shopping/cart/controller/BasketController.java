package org.skypro.shopping.cart.controller;

import org.skypro.shopping.cart.service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")

public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping(path = "/add")
    public List<Integer> add(@RequestParam("id") List<Integer> id) {
        return basketService.add(id);
    }

    @GetMapping(path = "/get")
    public List<Integer> get() {
        return basketService.get();
    }

}
