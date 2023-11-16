package micronaut.test.project;

import io.micronaut.http.annotation.*;

@Controller("/hello")
public class HelloController {

    @Get(uri="/message", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}