package au.com.marciomarinho.restful_service.controller;

import au.com.marciomarinho.restful_service.model.Product;
import au.com.marciomarinho.restful_service.model.ProductID;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;

import static org.springframework.web.servlet.function.RequestPredicates.contentType;


@RestController




public class ProductController {


    @GetMapping("/product")
    public ResponseEntity<ProductID> getProduct(@RequestBody final Product product) {
        System.out.println(product);
        ProductID result = new ProductID(UUID.randomUUID().toString());
        return ResponseEntity.status(HttpStatus.CREATED)
                .contentType(MediaType.APPLICATION_JSON)
                .body(result);



    }

}
