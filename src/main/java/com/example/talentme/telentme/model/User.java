package com.example.talentme.telentme.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="user")
@Data
@Entity
@NoArgsConstructor

public class User {

    @Id
    private  Long id;

    private String name;

    private  String password;

    private  int delete_flag;


}
