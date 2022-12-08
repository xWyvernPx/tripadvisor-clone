package tech.wyvernp.tripadvisor.javaserver.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/account")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/test")
    public String test() {
        return "World";
    }
    @GetMapping
    public List<User> createUser () {
        return userService.getAllUser();
    }
    @PostMapping("/login")

    public User loginWithMail (@RequestBody User loginInfo) {
        return userService.loginWithMail(loginInfo.getEmail(), loginInfo.getPassword());
    }

}
