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
import fr.usmb.m2isc.javaee.backlogs.jpa.User;

@Stateless
@Remote
@DependsOn("InitBean")
public class OperationBean implements Operation {
	
	@PersistenceContext
	private EntityManager em;


	public OperationBean() {

	}

    @Override
    public List<Agence> getAllAgence() {
        return em.createQuery("select object(o) from Agence as o").getResultList();
    }


    @Override
    public User signIn(String username, String password) {
        Query req = em.createNamedQuery("signIn");
        req.setParameter("username", username);
        req.setParameter("password", password);
        return (User) req.getSingleResult();

    }

    @Override
    public Backlog getBacklogById(Long id) {
        return em.find(Backlog.class,id);
    }

    @Override
    public Agence getAgence(String number) {
        return em.find(Agence.class, Long.parseLong(number));
    }


    @Override
    public Backlog getBacklog(Agence agence) {
        return em.find(Backlog.class, agence.getId());
    }
}
