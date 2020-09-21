package com.sample.graphql.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NameRequest {

  private String title;
  private String givenName;
  private String middleName;
  private String surName;
}
