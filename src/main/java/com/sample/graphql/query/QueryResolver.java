package com.sample.graphql.query;

import com.sample.graphql.model.NameRequest;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;


@Component
public class QueryResolver implements GraphQLQueryResolver {


  public String getRequestNullable(NameRequest nameRequest) {
    return "Hello world";
  }

  public String getRequestNonNullable(NameRequest nameRequest) {
    return "Hello world";
  }

  public Long getReturnLong() {
    return 1L;
  }
}
