package com.sample.graphql.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Cat extends Pet {

  private String catName;
}
