package com.sample.graphql;

import graphql.Scalars;
import graphql.schema.GraphQLScalarType;
import graphql.validation.rules.OnValidationErrorStrategy;
import graphql.validation.rules.ValidationRules;
import graphql.validation.schemawiring.ValidationSchemaWiring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.sample")
public class SampleGraphApplication {

  public static void main(String[] args) {
    SpringApplication.run(SampleGraphApplication.class, args);
  }

  @Bean
  public ValidationSchemaWiring addValidationRules() {
    ValidationRules validationRules = ValidationRules.newValidationRules()
        .onValidationErrorStrategy(OnValidationErrorStrategy.RETURN_NULL)
        .build();

    // This will rewrite your data fetchers when rules apply to them so that validation
    ValidationSchemaWiring schemaWiring = new ValidationSchemaWiring(validationRules);

    return schemaWiring;
  }

  @Bean
  GraphQLScalarType longScalar() {
    return Scalars.GraphQLLong;
  }

}
