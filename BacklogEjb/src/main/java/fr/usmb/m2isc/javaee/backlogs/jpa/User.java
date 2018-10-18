package fr.usmb.m2isc.javaee.backlogs.jpa;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;

    private List<Comment> comments;


}
