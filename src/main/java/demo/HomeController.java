package demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String greeting() {
        return "Hello Spring Boot World!";
    }
}