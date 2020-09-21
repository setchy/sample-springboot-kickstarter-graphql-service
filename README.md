# Sample queries
```graphql
query {
  requestNullable(nameRequest: {
    title: "Mr BAD",
    givenName:"BADLEY",
    surName:"FAKER"
  })
  
  requestNonNullable(nameRequest: {
    title: "Mr BAD",
    givenName:"BADLEY",
    surName:"FAKER"
  })
}
```