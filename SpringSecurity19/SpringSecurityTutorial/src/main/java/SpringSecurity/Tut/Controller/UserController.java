package SpringSecurity.Tut.Controller;

import SpringSecurity.Tut.Service.UserService;
import SpringSecurity.Tut.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("register")
    public User register(@RequestBody User user) {
        return service.saveUser(user);
    }

    @GetMapping("user/{id}")
    public User getUsers(@PathVariable("id") int id){
        User user = service.findUserById(id);
        return user;
    }
}