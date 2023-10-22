package com.webregistration.demo.Repository;

//Import java array list
import java.util.ArrayList;

//Import spring dependencies
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//Import inbuilt package dependencies
import com.webregistration.demo.Entity.User;

//Annotation for RESTful services
public interface UserRepository extends JpaRepository<User, Integer> {

    //Declare array list to hold users
    ArrayList<User> findById(int id);

    Iterable<User> findByEmail(String email);
}
