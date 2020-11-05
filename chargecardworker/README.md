Charge Card Worker camunda java client
**1.bu kodu isletmek ucun bpm fileni camunda ile gelen timcat serveri start verib  deploy edirik ve java kodunu isledirik ve task listden start edirik**
2. {
  	"variables": {
  		"amount": {
  			"value":555,
  			"type":"long"
  		},
  		"item": {
  			"value": "item-xyz"
  		}
  	}
  }
  seklinde postmandan start edirik
  
3. curl -H "Content-Type: application/json" -X POST -d '{"variables": {"amount": {"value":555,"type":"long"}, "item": {"value":"item-xyz"} } }' http://localhost:8080/engine-rest/process-definition/key/payment-retrieval/start
 


