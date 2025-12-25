package au.com.marciomarinho.restful_service.controller;

import au.com.marciomarinho.restful_service.model.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController




public class ProductController {

    @PostMapping("/product")
    public String createProduct(@RequestBody final Product product) {
        System.out.println(product);
        return "1234";

    }
}
