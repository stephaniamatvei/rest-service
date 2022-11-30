# RESTful Service built with Spring

## About

A simple service that manages the employees of a company. 
- Employee objects are stored in a (**H2 in-memory**) **database**
- The objects are accessed by declaring the ```EmployeeRepository``` interface which extends **Spring Data JPA**'s ```JPARepository```, specifying the domain type as ```Employee``` and the id type as ```Long```
- To allow the access over the internet, everything is wrapped with the **Spring MVC layer**

## Why REST?

REST has quickly become the de-facto standard for building web services on the web because they’re easy to build and easy to consume.

REST is a collection of architectural constraints that when adopted make your application much more resilient. A key factor of resilience is that when you make upgrades to your services, your clients don’t suffer from downtime.

## What benefits?

The web and its core protocol, HTTP, provide a stack of features:
- Suitable actions (GET, POST, PUT, DELETE, …​)
- Caching
- Redirection and forwarding
- Security (encryption and authentication)


By building on top of HTTP, REST APIs provide the means to build:
- Backwards compatible APIs
- Evolvable APIs
- Scaleable services
- Securable services
- A spectrum of stateless to stateful services
