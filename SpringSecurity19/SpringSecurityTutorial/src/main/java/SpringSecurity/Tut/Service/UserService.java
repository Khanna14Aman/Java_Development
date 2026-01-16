package SpringSecurity.Tut.Service;

import SpringSecurity.Tut.model.User;
import SpringSecurity.Tut.model.UserPrincipal;
import SpringSecurity.Tut.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;
    private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);

    public User saveUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
//        System.out.println(user.getPassword());
        return repo.save(user) ;
    }
    public User findUserById(int id){
        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();
        UserPrincipal user = (UserPrincipal) authentication.getPrincipal();

        String userName = user.getUsername();
        User findUser = repo.findByUsername(userName);
        if(findUser != null){
            if(findUser.getPassword().equals(user.getPassword()) && findUser.getId() == id){
                return findUser;
            }
            return new User();
        }
        return new User();
    }
}