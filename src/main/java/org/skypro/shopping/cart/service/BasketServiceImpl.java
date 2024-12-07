package org.skypro.shopping.cart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketServiceImpl implements BasketService {
    @Autowired
    private final Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public List<Integer> add(List<Integer> id) {
        return basket.add(id);
    }

    @Override
    public List<Integer> get() {
        return basket.getList();
    }

}
