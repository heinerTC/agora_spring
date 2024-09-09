
package com.agora_spring.agora_spring.services;

import com.agora_spring.agora_spring.model.Users;

/**
 *
 * @author HEINER - YULY - SERGIO
 */
public interface UserService {
    Users newUsers (Users newUsers);
    Iterable<Users> getAll();
    Users modifyUsers (Users users);
    Boolean deleteUsers (Long iduser);
}
