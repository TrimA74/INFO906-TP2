package fr.usmb.m2isc.javaee.backlogs.jpa;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Entry implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Backlog backlog;

    @OneToMany
    private List<Comment> comments;


    @Temporal(TemporalType.TIMESTAMP)
    private Date creation;

    private String name;

    private int priority;

    private int estimation;

    private String description;

    public Entry (){

    }

}
