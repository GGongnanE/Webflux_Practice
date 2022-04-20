# Webflux_Practice
since : 22-04-19  
2차 과제 : REST API로 내부 통신하기 (Hello Server -> Info Server)

### Goals : Rest Call With WebFlux (Not MVC)
___
Spec : Spring5+, Java 8+, WebFlux, Functional Endpoint
- Test Case 01
  - Request 
    - (GET) localhost:8080/hello?name=$name
  - Response
    - application/json { "to" : "$name", "message" : "hello $name"}


- Test Case 02 (22-04-20 요건 추가)
  - Request 
    - (GET) localhost:8080/hello?name=$name
  - Response
    - application/json { "to" : "$name", "job": "developer", "message" : "hello $name"}

___

### Test Result (Case 01)
![image](https://user-images.githubusercontent.com/33744934/164144267-0baf8ad1-758a-4eb3-b0a0-91c77633af3c.png)


### Test Result (Case 02) 
![image](https://user-images.githubusercontent.com/33744934/164195431-5dbec604-1e7e-4dad-b90c-1875f125507c.png)



