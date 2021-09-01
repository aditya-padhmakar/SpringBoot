package com.example.demo.repository;

import com.example.demo.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public static ArrayList<User> list;

    public UserRepository() {
        list=new ArrayList<>();
        list.add(new User(1,"A1","A1@gamil.com"));
        list.add(new User(2,"A2","A2@gamil.com"));
    }


    public static List<User> showall() {
        return list;
    }


    public static void save(User u) {
        list.add(u);
    }

    public static void delete(User u) {
        list.remove(u);
    }

//    public void showone(User u) {
//
//    }
}
