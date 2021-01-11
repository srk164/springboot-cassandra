package com.springcassandra.demo.repository;

import com.springcassandra.demo.model.Product;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;

public interface ProductRepository extends CassandraRepository<Product, String> {
    @AllowFiltering
    List<Product> findByFirstname(String firstName );
    @AllowFiltering
     List<Product>findBylastnameAndAge(String lastname,int age);
   /* @AllowFiltering
    List<Product> findAll();*/


}
