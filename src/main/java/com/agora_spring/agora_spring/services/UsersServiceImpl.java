package com.agora_spring.agora_spring.services;

import com.agora_spring.agora_spring.model.Users;
import com.agora_spring.agora_spring.repository.UserRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HEINER - YULY - SERGIO
 */

@Service
public class UsersServiceImpl implements UserService{
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public Users newUsers(Users newUsers) {
        return userRepository.save(newUsers);
    }

    @Override
    public Iterable<Users> getAll() {
        return this.userRepository.findAll();
    }

    @Override
    public Users modifyUsers(Users users) {
        Optional<Users> userFind = this.userRepository.findById(users.getIduser());
        if(userFind.get() != null){
            userFind.get().setNomuser(users.getNomuser());
             userFind.get().setApellido(users.getApellido()); 
             userFind.get().setEmail(users.getEmail());
             return this.newUsers(userFind.get());            
        }
       return null;  
    }

    @Override
    public Boolean deleteUsers(Long iduser) {
        this.userRepository.deleteById(iduser);
        return true;
    }
    
    
}
