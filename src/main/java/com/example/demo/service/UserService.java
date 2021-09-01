package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository=new UserRepository();

    public List<User> getUsers()
    {
        return UserRepository.showall();
    }

    public User getUser(int id)
    {
        User u=null;
        for(User u1:UserRepository.list)
        {
            if(u1.getId()==id)
            {
                u=u1;
                break;
            }
        }
        return u;
    }

    public String addUser(User u)
    {
        boolean ans=false;

        for(User u1:userRepository.list)
        {
            if(u1.getEmail().equals(u.getEmail()))
            {
                ans=true;
                break;
            }
        }

        if(ans)
        {
            return "Duplicate email";
        }
        else
        {
            UserRepository.save(u);
            return "Added successfully";
        }

    }

    public User deleteUser(int id)
    {
        User u=null;
        for(User u1:userRepository.list)
        {
            if(u1.getId()==id)
            {
                u=u1;
                break;
            }
        }
        userRepository.delete(u);
        return u;


    }
}







