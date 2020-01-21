package fr.jobslake.resource;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Offers {

    @RequestMapping("/hello")
    @GetMapping
    public String hello() {
        return "Hello ";
    }
}
