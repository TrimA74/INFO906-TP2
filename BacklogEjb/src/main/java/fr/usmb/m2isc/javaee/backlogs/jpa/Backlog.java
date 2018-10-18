package fr.usmb.m2isc.javaee.backlogs.jpa;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Backlog implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne( mappedBy = "backlog")
    private Agence agence;

    @OneToMany
    private List<Entry> entries;
}
