package pl.demo.greetingsservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class GreetingsController {

    @GetMapping
    public String greet(@Value ("${greeter: hello}") String greetingForm,
                        @RequestParam(value = "name", defaultValue = "noname") String name)
    {
        System.out.println(LocalDateTime.now() + " Greetings for " + name);
        return greetingForm + " " + name;
    }
}
