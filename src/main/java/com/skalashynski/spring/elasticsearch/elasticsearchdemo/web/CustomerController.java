package com.skalashynski.spring.elasticsearch.elasticsearchdemo.web;

import com.skalashynski.spring.elasticsearch.elasticsearchdemo.entity.Customer;
import com.skalashynski.spring.elasticsearch.elasticsearchdemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
  @Autowired
  private CustomerRepository customerRepository;


  @PostMapping("/save")
  public int saveCustomer(@RequestBody List<Customer> customers) {
    customerRepository.saveAll(customers);
    return customers.size();
  }

  @GetMapping("/find")
  public Iterable<Customer> findAllCustomers() {
    return customerRepository.findAll();
  }

  @GetMapping("/find/{firstName}")
  public List<Customer> findByFirstName(@PathVariable String firstName) {
    return customerRepository.findByFirstName(firstName);
  }
}
