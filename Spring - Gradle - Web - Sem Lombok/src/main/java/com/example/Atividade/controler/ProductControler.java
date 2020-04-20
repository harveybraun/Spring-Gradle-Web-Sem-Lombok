package com.example.Atividade.controler;

import model.Client;
import model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Descreve a Classe ProductControler
 *
 * @author Harvey Braun
 * @version 1.0
 * @since 19/04/2020 - 15:00
 */
@RestController
public class ProductControler {

	@GetMapping("/produto")
	public Product getProduct() {
		Product product = new Product();
		product.setName("Caneta 0.7 Preta");
		product.setPrice(8.15);
		product.setAmount(2);
		return product;
	}

	@GetMapping("/produtos")
	public ArrayList<Product> getClients() {
		ArrayList<Product> products = new ArrayList<>();
		products.add(new Product("Apontador",4.99,3));
		products.add(new Product("Grampeador",12.45,2));
		return products;
	}

}
