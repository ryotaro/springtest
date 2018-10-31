package com.packt.webstore.controller;

import com.packt.webstore.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;

@Controller
public class ProductController {

    @RequestMapping("/products")
    public String list(Model model) {
        Product iphone = new Product("P1234", "iPhone", new BigDecimal(1000));
        model.addAttribute(iphone);
        return "products";
    }

}
