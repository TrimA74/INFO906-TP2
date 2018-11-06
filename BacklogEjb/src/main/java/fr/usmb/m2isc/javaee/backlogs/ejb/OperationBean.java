package fr.usmb.m2isc.javaee.backlogs.ejb;

import java.util.List;

import javax.ejb.DependsOn;
import javax.ejb.EJBException;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.usmb.m2isc.javaee.backlogs.jpa.Agence;
import fr.usmb.m2isc.javaee.backlogs.jpa.Backlog;
import fr.usmb.m2isc.javaee.backlogs.jpa.Compte;

@Stateless
@Remote
@DependsOn("InitBean")
public class OperationBean implements Operation {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Agence getAgence(int agenceId) {
		return null;
	}

	@Override
	public Backlog getBacklog(Agence agence) {
		return null;
	}

	@Override
	public List<Agence> getAllAgence() {
		return null;
	}

	public OperationBean() {

	}
}
