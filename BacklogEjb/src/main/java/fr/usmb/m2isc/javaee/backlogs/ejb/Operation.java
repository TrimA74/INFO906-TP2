package fr.usmb.m2isc.javaee.backlogs.ejb;

import java.util.List;

import fr.usmb.m2isc.javaee.backlogs.jpa.*;

public interface Operation {

    List<Agence> getAllAgence();

    Agence getAgence(String number);

    Backlog getBacklog(Agence agence);

    User signIn(String username, String password);

    Backlog getBacklogById(Long id);

    Backlog addEntryToBacklog(Entry entry, Long backlog_id);

    Entry getEntry(Long id);

    void deleteEntry(Long id, Long backlog_id);
}