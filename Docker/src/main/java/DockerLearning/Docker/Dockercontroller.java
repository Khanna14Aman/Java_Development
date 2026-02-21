package DockerLearning.Docker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dockercontroller {
    @RequestMapping("/")
    private String getString(){
        return "Hello World";
    }
}
