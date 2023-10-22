package com.webregistration.demo.Controller;

//Import spring dependencies
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

//Import inbuilt package dependencies
import com.webregistration.demo.Entity.User;
import com.webregistration.demo.Service.UserService;

//Use RestController param annotation for REST API
@RestController
public class UserController {

    //Autowired annotation for dependency injection
    @Autowired
    private UserService service;

    //Annotions for http requests

    //Find all users
    @GetMapping("/user/listAll")
    @CrossOrigin(origins = "http://localhost:8080")
    public Iterable<User> findAll() {
        return service.getAll();
    }

    /*
    //Find user by id
    @GetMapping("/user/{id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<User> findById(@PathVariable Integer id) {
        User reponse = service.findById(id);
        return new ResponseEntity<User>(response, HttpStatus.OK);
    }
    */

    //Find user by email
    @GetMapping("/user/email")
    @CrossOrigin(origins = "http://localhost:8080")
    public Iterable<User> findByEmail(@RequestParam String email) {
        return service.findByEmail(email);
    }


    //Post new user in database
    @PostMapping("/userRegistration")
    @CrossOrigin(origins = "http://localhost:8080")
    User newUser(@RequestBody User user) {
        return service.save(user);
        }

    //Delete all users
    @GetMapping("/user/deleteAll")
    @CrossOrigin(origins = "http://localhost:8080")
    public void deleteAll() {
        service.deleteAll();
    }



}
