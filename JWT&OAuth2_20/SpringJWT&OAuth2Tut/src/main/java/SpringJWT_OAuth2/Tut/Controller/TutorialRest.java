package SpringJWT_OAuth2.Tut.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TutorialRest {
    @GetMapping("/")
    public String welcomePage(HttpServletRequest request){

        return "Welcome to page" + request.getSession().getId();

    }

    @GetMapping("/hello")
    public String helloBuddy(HttpServletRequest request){
        return "Hello Buddy "+request.getSession().getId();
    }
}
