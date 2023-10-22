package com.webregistration.demo.Entity;

//Import dependencies for Spring Data JPA
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

//Declare entity, table for MySQL generation
@Entity
@Table(name = "User")
public class User {

    //Declare private instances of user data
    //Declare JPA annotations

    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "f_name")
    private String f_name;

    @Column(name = "l_name")
    private String l_name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    //No arg constructor
    public User(){};

    //Class constructor
    public User(String f_name, String l_name, String email, String password) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.email = email;
        this.password = password;

    }

    //Methods - get and set
    public int getId() {
        return id;
    }

    public String getF_name(){
        return f_name;
    }

    public String getL_name(){
        return l_name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword(){
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
