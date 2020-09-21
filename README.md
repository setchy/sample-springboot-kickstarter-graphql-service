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

# Expected behavior
Size validation errors for givenName and title


# Current response
```json
{
  "errors": [
    {
      "message": "/requestNullable/nameRequest/givenName size must be between 1 and 1"
    },
    {
      "message": "/requestNullable/nameRequest/title size must be between 1 and 1"
    }
  ],
  "extensions": {},
  "data": {
    "requestNullable": null,
    "requestNonNullable": "Hello world"
  }
}
```