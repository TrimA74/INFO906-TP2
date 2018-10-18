package fr.usmb.m2isc.javaee.backlogs.ejb;

import java.util.List;

import javax.ejb.DependsOn;
import javax.ejb.EJBException;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.usmb.m2isc.javaee.backlogs.jpa.Compte;

@Stateless
@Remote
@DependsOn("InitBean")
public class OperationBean implements Operation {
	
	@PersistenceContext
	private EntityManager em;
	
	public OperationBean() {

	}
}
