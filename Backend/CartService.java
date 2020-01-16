package me.org.shopapi.service;

import java.util.Collection;

import me.org.shopapi.entity.Cart;
import me.org.shopapi.entity.ProductInOrder;
import me.org.shopapi.entity.User;

/**
 * Created By Zhu Lin on 3/10/2018.
 */
public interface CartService {
    Cart getCart(User user);

    void mergeLocalCart(Collection<ProductInOrder> productInOrders, User user);

    void delete(String itemId, User user);

    void checkout(User user);
}
