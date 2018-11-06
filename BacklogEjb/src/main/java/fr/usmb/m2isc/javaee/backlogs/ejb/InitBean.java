package fr.usmb.m2isc.javaee.backlogs.ejb;

import fr.usmb.m2isc.javaee.backlogs.jpa.Agence;
import fr.usmb.m2isc.javaee.backlogs.jpa.Backlog;
import fr.usmb.m2isc.javaee.backlogs.jpa.User;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Startup
@Singleton
public class InitBean implements Init {

    @PersistenceContext
    private EntityManager em;

    @PostConstruct
    public void init() {
        User ludo = new User("ludo");
        User trima = new User("trima");
        em.persist(ludo);
        em.persist(trima);
        Backlog annecyBacklog = new Backlog();
        Backlog chamberyBacklog = new Backlog();
        em.persist(annecyBacklog);
        em.persist(chamberyBacklog);
        Agence annecy = new Agence("Agence Annecy",annecyBacklog);
        Agence chambery = new Agence("Agence Chambery",chamberyBacklog);
        em.persist(annecy);
        em.persist(chambery);
    }
}
