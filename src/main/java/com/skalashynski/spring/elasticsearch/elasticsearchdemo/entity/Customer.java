package com.skalashynski.spring.elasticsearch.elasticsearchdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
  @Id
  private String id;
  private String firstName;
  private String lastName;
  private String age;
}
