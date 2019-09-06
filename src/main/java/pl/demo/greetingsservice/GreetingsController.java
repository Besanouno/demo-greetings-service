package pl.demo.greetingsservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class GreetingsController {

    @GetMapping
    public String greet(@Value ("${greeter: hello}") String greeter,
                        @RequestParam(value = "name", defaultValue = "noname") String name)
    {
        System.out.println(String.format("[%s] %s %s", LocalDateTime.now(), greeter, name));
        return greeter + " " + name;
    }
}
