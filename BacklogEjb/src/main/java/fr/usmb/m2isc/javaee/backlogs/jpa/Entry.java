package fr.usmb.m2isc.javaee.backlogs.jpa;

import javax.persistence.*;
import java.io.Serializable;
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

}
