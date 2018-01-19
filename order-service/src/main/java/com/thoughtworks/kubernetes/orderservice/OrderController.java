package com.thoughtworks.kubernetes.orderservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @RequestMapping(value = "/order-details", produces = "application/json")
    public String getOrderDetails(){

        return "[\n" +
                "  {\n" +
                "    \"name\": \"First Order\",\n" +
                "    \"orderId\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Second Order\",\n" +
                "    \"orderId\": 2\n" +
                "  }\n" +
                "]";
    }
}
