package com.tradenity.sdk.spring.config;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.services.*;
import com.tradenity.sdk.spring.SpringMvcSessionProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * User: Joseph Fouad
 * Date: 7/27/2015
 * Time: 8:21 AM
 */
@Configuration
public class TradenitySDKConfig {


    @Value("${tradenity.endpoint:https://api.tradenity.com/v1/}")
    public String apiEndpoint;

    @Value("${tradenity.publicKey}")
    public String publicKey;

    @Value("${tradenity.secretKey}")
    public String secretKey;


    @Bean
    public TradenityClient client(){
        return new TradenityClient(apiEndpoint, secretKey, new SpringMvcSessionProvider());
    }

    @Bean
    public AddressService addressService(){
        return new AddressService(client());
    }

    @Bean
    public BrandService brandService(){
        return new BrandService(client());
    }

    @Bean
    public CategoryService categoryService(){
        return new CategoryService(client());
    }

    @Bean
    public CollectionService collectionService(){
        return new CollectionService(client());
    }

    @Bean
    public CurrencyService currencyService(){
        return new CurrencyService(client());
    }

    @Bean
    public CustomerService customerService(){
        return new CustomerService(client());
    }

    @Bean
    public GatewayService gatewayService(){
        return new GatewayService(client());
    }

    @Bean
    public OrderService orderService(){
        return new OrderService(client());
    }

    @Bean
    public ProductService productService(){
        return new ProductService(client());
    }

    @Bean
    public ShippingMethodService shippingMethodService(){
        return new ShippingMethodService(client());
    }

    @Bean
    public ShoppingCartService shoppingCartService(){
        return new ShoppingCartService(client());
    }

    @Bean
    public TaxService taxService(){
        return new TaxService(client());
    }

    @Bean
    public TransactionService transactionService(){
        return new TransactionService(client());
    }

}
