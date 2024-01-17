package com.example.demo.services;

import com.example.demo.model.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private final UserRepository userRepository;


    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User getUserById(int id) {
        User user = new User();
        List<User> users = findAll();
        for (User u : users) {
            if ( u.getId() == id) {
                user = u;
            }
        }
        return user;
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    //public void deleteById(int id)
    public void deleteUserById(int id) {
        userRepository.deleteById(id);
    }

    /**
     *
     * @param user экземпляр класса требующий изменений
     */
    public void updateUser(User user) { userRepository.updateById(user);}
}
