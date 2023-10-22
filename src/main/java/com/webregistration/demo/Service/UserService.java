package com.webregistration.demo.Service;

//Import spring dependencies
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//Import inbuilt package dependencies
import com.webregistration.demo.Entity.User;
import com.webregistration.demo.Repository.UserRepository;

public class UserService {

    //Autowired annotation for dependency injection
    @Autowired
    private UserRepository repository;

    //Get all users
    public Iterable<User> getAll() {
        return repository.findAll();
    }

    //Find by user id
    public Iterable<User> findById(int id) {
        return repository.findById(id);
    }

    //Find by email
    public Iterable<User> findByEmail(String email) {
        return repository.findByEmail(email);
    }

    //Save user to database
    public User save(User user) {
        return repository.save(user);
    }

    //Delete
    public void deleteAll(){
        repository.deleteAll();
    }
}
