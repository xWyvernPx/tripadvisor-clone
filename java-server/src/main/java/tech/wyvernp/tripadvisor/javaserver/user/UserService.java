package tech.wyvernp.tripadvisor.javaserver.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> getAllUser() {
    return userRepository.findAll();
    }
    public User loginWithMail(String email, String password){
       var user = userRepository.findUserByEmailIs(email);
       if(user != null) {
           boolean isValid = user.getPassword().equals(password);
           if(isValid) return user;
           return null;
       }
        return null;
    }

}
