package hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(String.format(name));
    }
   @RequestMapping("/greeting/{value}")
    public Greeting greeting1(@PathVariable ("value") String name) {
        return new Greeting(String.format(name));
    }
}