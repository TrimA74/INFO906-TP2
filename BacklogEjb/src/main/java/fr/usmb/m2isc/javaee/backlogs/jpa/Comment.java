package fr.usmb.m2isc.javaee.backlogs.jpa;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Comment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Entry entry;

    private String content;

    @ManyToOne
    private User author;

    public Comment (){

    }


}
