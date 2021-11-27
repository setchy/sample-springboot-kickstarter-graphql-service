package com.sample.graphql.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Dog extends Pet {

  private String dogName;
}
