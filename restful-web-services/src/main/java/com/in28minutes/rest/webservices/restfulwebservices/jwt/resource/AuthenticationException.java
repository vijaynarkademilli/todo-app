package com.in28minutes.rest.webservices.restfulwebservices.jwt.resource;

/**
 * Created by madhuri on 11-12-2018.
 */
public class AuthenticationException extends RuntimeException {
    public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }
}
