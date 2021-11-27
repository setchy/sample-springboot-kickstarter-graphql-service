package com.sample.graphql.query;

import com.sample.graphql.model.Cat;
import com.sample.graphql.model.NameRequest;
import com.sample.graphql.model.Pet;
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

  public Pet getRequestPet() {
    Cat myCat = new Cat();
    myCat.setCatName("Felix");
    return myCat;
  }
}
