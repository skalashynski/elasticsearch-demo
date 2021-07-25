package com.skalashynski.spring.elasticsearch.elasticsearchdemo.repository;

import com.skalashynski.spring.elasticsearch.elasticsearchdemo.entity.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface CustomerRepository extends ElasticsearchRepository<Customer, String> {

}
