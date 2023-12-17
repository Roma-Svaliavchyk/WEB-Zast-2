package org.example.roma_s.pw2;

import java.util.HashMap;
import java.util.Map;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Cart {
  public ProductRepository productRepository;
  public Map<Product, Integer> products;

  public Cart(ProductRepository productRepository){
    this.productRepository = productRepository;
    products = new HashMap<>();
  }

  public Map<Product, Integer>

  public void addItem(int id){\


    products.put(productRepository.findById(id));
  }

  public void deleteItem(int id){
    productList.remove(id);
  }

}
