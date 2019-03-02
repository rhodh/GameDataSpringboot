# Game Details
Load game details via rest API
`

Get report on games via `games/report`


## Prerequisites
* Java Development Kit (JDK)
* Maven 

## Setup

1) Build jar using Maven `mvn package`
2) Run service server `java -jar target/RestfulAPIGameData-0.1.0.jar`
3) Call rest api via http://localhost:8080/games


## Improvements

* Cucumber integration test for end to end testing.
* Improve logging 
* Add unit tests
* Store loaded data in mongdb database
