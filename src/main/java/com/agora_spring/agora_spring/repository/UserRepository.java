package com.agora_spring.agora_spring.repository;

import com.agora_spring.agora_spring.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author HEINER - YULY - SERGIO
 */
public interface UserRepository extends JpaRepository<Users, Long> {
    
}
