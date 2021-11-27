package com.sample.graphql;

import com.sample.graphql.model.Cat;
import com.sample.graphql.model.Dog;
import graphql.Scalars;
import graphql.kickstart.tools.SchemaParserDictionary;
import graphql.scalars.ExtendedScalars;
import graphql.schema.GraphQLScalarType;
import graphql.validation.rules.OnValidationErrorStrategy;
import graphql.validation.rules.ValidationRules;
import graphql.validation.schemawiring.ValidationSchemaWiring;
import java.util.HashMap;
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
    return ExtendedScalars.GraphQLLong;
  }

  @Bean
  public SchemaParserDictionary getSchemaParser() {
    SchemaParserDictionary dictionary = new SchemaParserDictionary();
    dictionary.add(new HashMap() {{
      put("Cat", Cat.class);
      put("Dog", Dog.class);
    }});
    return dictionary;
  }
}
