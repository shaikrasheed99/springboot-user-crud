# Spring Boot CRUD TDD

## Gradle based spring boot application which provide APIs to create, read, update and delete the users using test driven development.

## Features of the Application
    - Create user
    - Read user
    - Update user
    - Delete user

## APIs

### Create a User

* Request
```json
    POST /users 
    Host: localhost:3000
    Content-Type: application/json
    {
        "id": 1,
        "name": "ironman",
        "age": 21,
    }
```
* Response
```json
    {
        "id": 1,
        "name": "ironman",
        "age": 21,
    }
```

### Get User details by user id

* Request
```json
    GET /users/{1}
    Host: localhost:3000
```
* Response
```json
    {
        "id": 1,
        "name": "ironman",
        "age": 21,
    }
```

### Update User details

* Request
```json
    PUT /users/{1}
    Host: localhost:3000
    Content-Type: application/json
    {
        "id": 1,
        "name": "ironman",
        "age": 29,
    }
```
* Response
```json
    {
        "id": 1,
        "name": "ironman",
        "age": 29,
    }
```

### Delete a User by user id

* Request
```json
    DELETE /users/{1} 
    Host: localhost:3000
```
* Response
```json
    {
        "id": 1,
        "name": "ironman",
        "age": 21,
    }
```
