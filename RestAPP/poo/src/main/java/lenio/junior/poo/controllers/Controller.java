package lenio.junior.poo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    // This tells spring this function is a route for a get request to "/"
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String Hello() {
        // The response will include the return value
        return "Hello World";
    }

}