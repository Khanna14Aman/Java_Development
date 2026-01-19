package SpringJWT_OAuth2.Tut.Controller;

import SpringJWT_OAuth2.Tut.Service.JWTService;
import SpringJWT_OAuth2.Tut.Service.UserService;
import SpringJWT_OAuth2.Tut.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService service;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JWTService jwtService;

    @PostMapping("register")
    public User register(@RequestBody User user) {
        return service.saveUser(user);
    }

    @PostMapping("login")
    public String login(@RequestBody User user){
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword()));
        if(authentication.isAuthenticated()){
            return jwtService.generateJWTToken(user.getUsername());
        }
        return "login failed";
    }

    @GetMapping("user/{id}")
    public User getUsers(@PathVariable("id") int id){
        User user = service.findUserById(id);
        return user;
    }
}