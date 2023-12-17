package org.example.roma_s.pw2;

import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class ProductRepository {
  List<Product> products;

  //Замість @PostConstruct бо IDEA не хоче бачити його

  public ProductRepository(){

  }

  public Product findById(int id){
    return products.get(id);
  }

  public List<Product> findAll(){
    return products;
  }
}
