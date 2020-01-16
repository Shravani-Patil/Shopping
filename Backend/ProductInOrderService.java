package me.org.shopapi.service;

import me.org.shopapi.entity.ProductInOrder;
import me.org.shopapi.entity.User;

/**
 * Created By Zhu Lin on 1/3/2019.
 */
public interface ProductInOrderService {
    void update(String itemId, Integer quantity, User user);
    ProductInOrder findOne(String itemId, User user);
}
