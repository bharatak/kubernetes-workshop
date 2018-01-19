package com.thoughtworks.kubernetes.catalogservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogServiceController {

    @RequestMapping(value = "/catalog", produces = "application/json")
    public String getCatalog(){

        return "[\n" +
                "  {\n" +
                "    \"name\": \"Evolutionary Architectures\",\n" +
                "    \"id\": 1234\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Art of Scalability\",\n" +
                "    \"id\": 1235\n" +
                "  }\n" +
                "]";
    }
}
