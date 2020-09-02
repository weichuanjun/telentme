package com.example.talentme.telentme.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@Table(name="book")
public class Book {

    @Id
    private  long id;

    private  String name;

    private String author;

    private String description;

    private Date crete_at;

    @ManyToOne
    private User user;
}
