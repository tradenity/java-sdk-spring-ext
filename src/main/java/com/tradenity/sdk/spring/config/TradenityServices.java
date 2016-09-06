package com.tradenity.sdk.spring.config;

import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.services.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by joseph
 * on 3/17/16.
 */
public class TradenityServices {

    @Autowired
    public TradenityClient client;

    @Autowired
    public CategoryService Categories;

    @Autowired
    public ProductService Products;

    @Autowired
    public BrandService Brands;

    @Autowired
    public CustomerService Customers;

    @Autowired
    public CollectionService Collections;

    @Autowired
    public ShoppingCartService ShoppingCart;

    @Autowired
    public OrderService Orders;
}
