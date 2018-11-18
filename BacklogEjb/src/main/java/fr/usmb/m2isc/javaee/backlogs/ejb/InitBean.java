package fr.usmb.m2isc.javaee.backlogs.ejb;

import fr.usmb.m2isc.javaee.backlogs.jpa.Agence;
import fr.usmb.m2isc.javaee.backlogs.jpa.Backlog;
import fr.usmb.m2isc.javaee.backlogs.jpa.Entry;
import fr.usmb.m2isc.javaee.backlogs.jpa.User;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Startup
@Singleton
public class InitBean implements Init {

    @PersistenceContext
    private EntityManager em;

    @PostConstruct
    public void init() {
        User ludo = new User("ludo","asticot");
        User trima = new User("trima","asticot");
        em.persist(ludo);
        em.persist(trima);


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Backlog annecyBacklog = new Backlog();
            Backlog chamberyBacklog = new Backlog();
            Entry entry1 = new Entry(simpleDateFormat.parse("25/12/2010"),"Visualiser une carte",45,2,"Pourvoir visualiser la liste des boudins",annecyBacklog);
            Entry entry2 = new Entry(simpleDateFormat.parse("25/12/2012"),"Manger du boudin",45,2,"Avec des baguettes",annecyBacklog);
            Entry entry3 = new Entry(simpleDateFormat.parse("25/12/2019"),"Dévorer des asticots",45,2,"Avec tes canines",chamberyBacklog);
            em.persist(annecyBacklog);
            em.persist(chamberyBacklog);
            em.persist(entry1);
            em.persist(entry2);
            em.persist(entry3);
            Agence annecy = new Agence("Agence Annecy",annecyBacklog);
            Agence chambery = new Agence("Agence Chambery",chamberyBacklog);
            em.persist(annecy);
            em.persist(chambery);
        } catch (ParseException e) {
            e.printStackTrace();
        }









    }
}
