# spring-boot-dynamodb
## Getting Started
### DynamoDB local
```
docker run -d --name "dynamo-db" -p 8000:8000 amazon/dynamodb-local
```

## Documentation
- [Official AWS DynamoDB Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GettingStarted.Java.html)
- [Community Spring Module for data access on AWS DynamoDB](https://github.com/derjust/spring-data-dynamodb)
- [Example using the Spring module](https://www.baeldung.com/spring-data-dynamodb)

## How to test application
```
Container setup
	stop and remove old container (if it exists) : docker container stop dynamo-db; docker container rm dynamo-db;
	create a new container : docker run -d --name "dynamo-db" -p 8000:8000 amazon/dynamodb-local

Start Application

Hit rest end points showing Dynamo functionality: 
	create the table: get localhost:8080/hotels/table
	populate json data into table: get localhost:8080/hotels/data
	get single entry by id: get localhost:8080/hotels/5891
	get single entry by name: get localhost:8080/hotels/5891?hotelId=Jailhouse%20Accommodation 
	delete entry by id: delete localhost:8080/hotels/5891
	show entry is gone: get localhost:8080/hotels/5891
```
