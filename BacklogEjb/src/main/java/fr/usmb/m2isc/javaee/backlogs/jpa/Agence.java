package fr.usmb.m2isc.javaee.backlogs.jpa;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Agence implements Serializable {
    public Agence(){

    }

    public Agence(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne()
    private Backlog backlog;

    private String name;


}
