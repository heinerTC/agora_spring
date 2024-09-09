package com.agora_spring.agora_spring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


/**
 *
 * @author HEINER TINOCO - YULY MUNOZ - SERGIO 
 * Clase para elaborar la entidad de la aplicacion
 */

@Entity
@Table(name = "users")
@Data
public class Users {
    @Id
    @Column
    private Long iduser;
    @Column
    private String nomuser;
    @Column
    private String apellido;
    @Column
    private String email;
}
