package com.tradenity.sdk.spring.config;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.services.*;
import com.tradenity.sdk.spring.SpringMvcSessionProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


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
    public ShoppingCartService shoppingCartService(){
        return new ShoppingCartService(client());
    }
    

    @Bean
    public CurrencyService currencyService(){
        return new CurrencyService(client());
    }
    

    @Bean
    public StateService stateService(){
        return new StateService(client());
    }
    

    @Bean
    public CountryService countryService(){
        return new CountryService(client());
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
    public OptionService optionService(){
        return new OptionService(client());
    }
    

    @Bean
    public OptionValueService optionValueService(){
        return new OptionValueService(client());
    }
    

    @Bean
    public OptionSetService optionSetService(){
        return new OptionSetService(client());
    }
    

    @Bean
    public ProductService productService(){
        return new ProductService(client());
    }
    

    @Bean
    public VariantService variantService(){
        return new VariantService(client());
    }
    

    @Bean
    public CollectionService collectionService(){
        return new CollectionService(client());
    }
    

    @Bean
    public PromotionService promotionService(){
        return new PromotionService(client());
    }
    

    @Bean
    public DiscountPromotionService discountPromotionService(){
        return new DiscountPromotionService(client());
    }
    

    @Bean
    public FreeShippingPromotionService freeShippingPromotionService(){
        return new FreeShippingPromotionService(client());
    }
    

    @Bean
    public CouponService couponService(){
        return new CouponService(client());
    }
    

    @Bean
    public DiscountCouponService discountCouponService(){
        return new DiscountCouponService(client());
    }
    

    @Bean
    public FreeShippingCouponService freeShippingCouponService(){
        return new FreeShippingCouponService(client());
    }
    

    @Bean
    public FreeItemCouponService freeItemCouponService(){
        return new FreeItemCouponService(client());
    }
    

    @Bean
    public CustomerGroupService customerGroupService(){
        return new CustomerGroupService(client());
    }
    

    @Bean
    public CustomerService customerService(){
        return new CustomerService(client());
    }
    

    @Bean
    public WishListService wishListService(){
        return new WishListService(client());
    }
    

    @Bean
    public GatewayService gatewayService(){
        return new GatewayService(client());
    }
    

    @Bean
    public TestGatewayService testGatewayService(){
        return new TestGatewayService(client());
    }
    

    @Bean
    public StripeGatewayService stripeGatewayService(){
        return new StripeGatewayService(client());
    }
    

    @Bean
    public BraintreeGatewayService braintreeGatewayService(){
        return new BraintreeGatewayService(client());
    }
    

    @Bean
    public ShippingMethodService shippingMethodService(){
        return new ShippingMethodService(client());
    }
    

    @Bean
    public FreeShippingService freeShippingService(){
        return new FreeShippingService(client());
    }
    

    @Bean
    public FixedRateShippingService fixedRateShippingService(){
        return new FixedRateShippingService(client());
    }
    

    @Bean
    public TableRateShippingService tableRateShippingService(){
        return new TableRateShippingService(client());
    }
    

    @Bean
    public TableRateRuleService tableRateRuleService(){
        return new TableRateRuleService(client());
    }
    

    @Bean
    public OrderService orderService(){
        return new OrderService(client());
    }
    

    @Bean
    public OrderLineItemService orderLineItemService(){
        return new OrderLineItemService(client());
    }
    

    @Bean
    public ReturnLineItemService returnLineItemService(){
        return new ReturnLineItemService(client());
    }
    

    @Bean
    public PaymentSourceService paymentSourceService(){
        return new PaymentSourceService(client());
    }
    

    @Bean
    public PaymentCardService paymentCardService(){
        return new PaymentCardService(client());
    }
    

    @Bean
    public PaymentTokenService paymentTokenService(){
        return new PaymentTokenService(client());
    }
    

    @Bean
    public PaymentService paymentService(){
        return new PaymentService(client());
    }
    

    @Bean
    public CreditCardPaymentService creditCardPaymentService(){
        return new CreditCardPaymentService(client());
    }
    

    @Bean
    public CashOnDeliveryPaymentService cashOnDeliveryPaymentService(){
        return new CashOnDeliveryPaymentService(client());
    }
    

    @Bean
    public StoreCreditPaymentService storeCreditPaymentService(){
        return new StoreCreditPaymentService(client());
    }
    

    @Bean
    public TransactionService transactionService(){
        return new TransactionService(client());
    }
    

    @Bean
    public PaymentTransactionService paymentTransactionService(){
        return new PaymentTransactionService(client());
    }
    

    @Bean
    public RefundTransactionService refundTransactionService(){
        return new RefundTransactionService(client());
    }
    

    @Bean
    public StoreCreditTransactionService storeCreditTransactionService(){
        return new StoreCreditTransactionService(client());
    }
    

    @Bean
    public StoreCreditService storeCreditService(){
        return new StoreCreditService(client());
    }
    

    @Bean
    public StoreProfileService storeProfileService(){
        return new StoreProfileService(client());
    }
    

    @Bean
    public RefundOperationService refundOperationService(){
        return new RefundOperationService(client());
    }
    

    @Bean
    public CancelOperationService cancelOperationService(){
        return new CancelOperationService(client());
    }
    

    @Bean
    public ReturnOperationService returnOperationService(){
        return new ReturnOperationService(client());
    }
    

    @Bean
    public GeoZoneService geoZoneService(){
        return new GeoZoneService(client());
    }
    

    @Bean
    public CountriesGeoZoneService countriesGeoZoneService(){
        return new CountriesGeoZoneService(client());
    }
    

    @Bean
    public StatesGeoZoneService statesGeoZoneService(){
        return new StatesGeoZoneService(client());
    }
    

    @Bean
    public ZipCodesGeoZoneService zipCodesGeoZoneService(){
        return new ZipCodesGeoZoneService(client());
    }
    

    @Bean
    public TaxClassService taxClassService(){
        return new TaxClassService(client());
    }
    

    @Bean
    public TaxRateService taxRateService(){
        return new TaxRateService(client());
    }
    


}