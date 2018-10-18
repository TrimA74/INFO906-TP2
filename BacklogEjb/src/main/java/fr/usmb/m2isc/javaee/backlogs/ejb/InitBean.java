package fr.usmb.m2isc.javaee.backlogs.ejb;

import fr.usmb.m2isc.javaee.backlogs.jpa.Agence;
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
        Agence annecy = new Agence("Agence Annecy");
        Agence chambery = new Agence("Agence Chambery");
        em.persist(annecy);
        em.persist(chambery);
    }
}
