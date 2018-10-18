package fr.usmb.m2isc.javaee.backlogs.jpa;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Agence implements Serializable {
    public Agence(){

    }
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(mappedBy = "agence")
    private Backlog backlog;


}
