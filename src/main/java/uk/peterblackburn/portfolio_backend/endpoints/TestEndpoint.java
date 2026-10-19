package uk.peterblackburn.portfolio_backend.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestEndpoint {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }

}
