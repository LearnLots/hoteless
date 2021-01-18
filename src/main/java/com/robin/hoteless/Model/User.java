package com.robin.hoteless.Model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Document(collection = "users")

@Component
public class User {
    @Id
    private ObjectId _id;
    private String firstName;
    private String lastName;

    public User() {}

    public User(ObjectId _id, String firstName, String lastName) {
        this._id = _id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return _id.toHexString();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public void setId(ObjectId _id) {
        this._id = _id;
    }

    @Override
    public String toString() {
        return "User{" +
                "_id=" + _id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public User addUser(User user) {
        user.setId(ObjectId.get());
        return user;
    }

//    public List<User> getUsers() {
//        return customerList;
//    }

}
