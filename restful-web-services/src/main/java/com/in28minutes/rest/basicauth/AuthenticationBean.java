package com.in28minutes.rest.basicauth;

/**
 * Created by madhuri on 02-12-2018.
 */
public class AuthenticationBean {

    private String message;

    public AuthenticationBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AuthenticationBean{");
        sb.append("message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
