package org.acn.sample.app.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by arang on 26/03/2018.
 */
@RestController()
@RequestMapping("/hello")
public class HelloContoller {

    @RequestMapping("")
    public Greeting greet()
    {
        Greeting g =new Greeting();
        g.setTimestamp(new Date().getTime());
        g.setMessage("Hello");

        return g;
    }

}
