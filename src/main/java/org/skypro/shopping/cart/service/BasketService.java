package org.skypro.shopping.cart.service;

import java.util.List;

public interface BasketService {
    List<Integer> add(List <Integer> id);

    List<Integer> get();
}

