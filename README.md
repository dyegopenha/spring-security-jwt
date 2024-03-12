This is a sample app showing how to implement authentication and authorization with Spring Security and JWT.

- TEST
```
http -a username:password POST :8080/authenticate
JWT = <token>
http :8080/private -A bearer -a ${JWT}
```
