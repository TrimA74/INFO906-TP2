package fr.usmb.m2isc.javaee.backlogs.ejb;

import java.util.List;

import fr.usmb.m2isc.javaee.backlogs.jpa.Agence;
import fr.usmb.m2isc.javaee.backlogs.jpa.Backlog;
import fr.usmb.m2isc.javaee.backlogs.jpa.Compte;
import fr.usmb.m2isc.javaee.backlogs.jpa.User;

public interface Operation {

    List<Agence> getAllAgence();

    Agence getAgence(String number);

    Backlog getBacklog(Agence agence);

    User signIn(String username, String password);

}