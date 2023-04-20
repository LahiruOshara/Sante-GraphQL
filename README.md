# Sante-GraphQL

## Example query

```
query {
  resource(
    type: "Human", query: "barack obama"
    context: """{ "name": "http://www.w3.org/2000/01/rdf-schema#label",
    		  "Human": "http://dbpedia.org/ontology/Person"}"""
  	) 
	{
    name
    url
    type
  }
} 
```

