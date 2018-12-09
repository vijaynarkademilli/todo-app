package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.*;

/**
 * Created by madhuri on 02-12-2018.
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldService {

    @RequestMapping(method = RequestMethod.GET, path = "/hello-world/path-variable/{name}")
    public HelloWorldBean getMessage(@PathVariable String name) {
        return new HelloWorldBean(String.format("Welcome to App %s", name));
    }


}
