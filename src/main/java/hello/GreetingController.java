package hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;
import java.net.*;
import java.io.*;
import java.util.*;
import java.net.InetAddress;
import java.sql.Timestamp;
@RestController
public class GreetingController {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting123")
    public Greeting greeting12() throws UnknownHostException{
        InetAddress localhost = InetAddress.getLocalHost();
        Date date = new Date();
        System.out.println(new Timestamp(date.getTime()));
        String systemipaddress = "";
        try {
            URL url_name = new URL("http://bot.whatismyipaddress.com");
            BufferedReader br = new BufferedReader(new InputStreamReader(url_name.openStream()));
            systemipaddress = br.readLine();
        }
        catch (Exception e) {
            systemipaddress = "Cannot Execute Properly";
        }

        return new Greeting(counter.incrementAndGet(),String.format(systemipaddress),localhost.getHostName(),new Timestamp(date.getTime()));
    }
}
