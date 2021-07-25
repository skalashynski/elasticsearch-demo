package com.skalashynski.spring.elasticsearch.elasticsearchdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
  private static final String INDEX_NAME = "sample";
  private static final String INDEX_TYPE = "employee";

  @Id
  private String id;
  @Field(type = FieldType.Text, name = "first_name")
  private String firstName;
  @Field(type = FieldType.Text, name = "last_name")
  private String lastName;
  @Field(type = FieldType.Integer, name = "age")
  private Integer age;
}
