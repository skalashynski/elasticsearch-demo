package com.skalashynski.spring.elasticsearch.elasticsearchdemo.repository;

import com.skalashynski.spring.elasticsearch.elasticsearchdemo.entity.Customer;
import java.util.List;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends ElasticsearchRepository<Customer, String> {
  List<Customer> findByFirstName(String firstName);
}
