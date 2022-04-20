# Webflux_Practice
since : 22-04-20

## Goals : Rest Call With WebFlux (Not MVC)
Spec : Spring5+, Java 8+, WebFlux, Functional Endpoint
- Test Case 01
  - Request 
    - (GET) localhost:8080/hello?name=$name
  - Response
    - application/json { "to" : "$name", "message" : "hello $name"}

### Test Result (Case 01)
![image](https://user-images.githubusercontent.com/33744934/164144267-0baf8ad1-758a-4eb3-b0a0-91c77633af3c.png)

