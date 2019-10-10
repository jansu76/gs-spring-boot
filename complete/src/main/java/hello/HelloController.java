package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.Math.max;
import static java.lang.Math.min;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @PostMapping
    public String index2(@RequestBody String requestString) {
        return "post: " + getRequestInfo(requestString);
    }

    private String getRequestInfo(String requ) {
        if (requ == null) return "null";
        String result = "request length=" + requ.length();
        result += ", request start=" + requ.substring(0, min((requ.length() + 1), 30));
        result += ", request end=" + requ.substring(max((requ.length() - 30), 0));
        return result;
    }
}
