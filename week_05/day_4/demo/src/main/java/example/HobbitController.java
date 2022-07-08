package example;

import example.Demo.Hobbit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HobbitController {

    // Create, Read, Update, Delete = POST, GET, PUT, DELETE

    @GetMapping("/hobbit")
    Hobbit getHobbit() {
        return new Hobbit("Frodo", "Baggins");
    }

}
