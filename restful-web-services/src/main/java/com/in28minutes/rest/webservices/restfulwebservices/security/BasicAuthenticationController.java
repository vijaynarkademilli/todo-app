package com.in28minutes.rest.webservices.restfulwebservices.security;

import org.springframework.web.bind.annotation.*;

/**
 * Created by madhuri on 02-12-2018.
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BasicAuthenticationController {

    @RequestMapping(method = RequestMethod.GET, path = "/basicauth")
    public AuthenticationBean getMessage() {
        return new AuthenticationBean(String.format("You are authenticated"));
    }


}
