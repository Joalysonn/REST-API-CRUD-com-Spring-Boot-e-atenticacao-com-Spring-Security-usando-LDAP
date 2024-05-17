package com.estoque.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


	  @GetMapping("/")
	  public String index() {
	    return "Ben vindo ao ecommerce!";
	  }
	
}
