package fr.usmb.m2isc.javaee.backlogs.jpa;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity(name="Employee")
public class User implements Serializable {

    public User(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;

    private List<Comment> comments;

    public User(String username) {
        this.username = username;
    }


}
