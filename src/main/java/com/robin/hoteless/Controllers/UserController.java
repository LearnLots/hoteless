package com.robin.hoteless.Controllers;
import com.robin.hoteless.Model.User;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping ("/user")
public class UserController {

    //@Autowired
    private UserRepository userRepository;

    @PostMapping(value = "/new")
    public User createUser(@RequestBody User user) {

        user.setId(ObjectId.get());

        try {
            System.out.println(user.toString());
            userRepository.save(user);

        } catch (Exception e) {
            System.out.println(e);
        }
        return user;

        //return userRepository.addUser(user);

    }
    @GetMapping("/")
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Repository
    public interface UserRepository extends MongoRepository<User, String> {
        //List<User> findByName(String name);
        User findBy_id(ObjectId _id);
        List<User> findAll();
    }
}
