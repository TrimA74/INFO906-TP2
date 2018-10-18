package fr.usmb.m2isc.javaee.backlogs.ejb;

import java.util.List;

import javax.ejb.EJBException;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.usmb.m2isc.javaee.backlogs.ColisState;
import fr.usmb.m2isc.javaee.backlogs.jpa.Colis;
import fr.usmb.m2isc.javaee.backlogs.jpa.Compte;

@Stateless
@Remote
public class OperationBean implements Operation {
	
	@PersistenceContext
	private EntityManager em;
	
	public OperationBean() {
	}
	
	@Override
	public Compte creerCompte(String number, double depot) {
		Compte cpt = new Compte(number, depot);
		em.persist(cpt);
		return cpt;
	}
	
	@Override
	public Compte getCompte(String number) {
		return em.find(Compte.class, number);
	}

	@Override
	public Colis getColis(String number) {
		return em.find(Colis.class, number);
	}

	@Override
	public List<Compte> findAllComptes() {
		Query req = em.createNamedQuery("all");
		return req.getResultList();
	}

	@Override
	public List<Colis> findAllColis() {
		Query req = em.createNamedQuery("allColis");
		return req.getResultList();
	}

	@Override
	public List<Compte> findComptes(String partialNumber) {
		Query req = em.createNamedQuery("findWithNum");
		req.setParameter("partialNum", partialNumber);
		return req.getResultList();
	}

	@Override
	public Compte crediter(String number, double val) {
		Compte cpt = em.find(Compte.class, number);
		cpt.setSolde(cpt.getSolde() + val);
		if (val < 0 ) throw new EJBException("depot negatif");
		return cpt;
	}

	@Override
	public Compte debiter(String number, double val) {
		Compte cpt = em.find(Compte.class, number);
		cpt.setSolde(cpt.getSolde() - val);
		if (val < 0 ) throw new EJBException("retrait negatif");
		return cpt;
	}

	@Override
	public void transferer(String numCpt1, double val, String numCpt2) {
		crediter(numCpt2, val);
		debiter(numCpt1, val);
		if (val < 0 ) throw new EJBException("retrait negatif");
	}

	@Override
	public Colis registerColis(String identifiant, double poid, String name, String origin, String destination, double lat, double lng) {
		Colis colis = new Colis(identifiant,poid,name,origin,destination, lat, lng);
		em.persist(colis);
		return colis;
	}

    @Override
    public Colis editColis(String identifiant, double latitude, double longitude, String emplacement, ColisState state) {
        Colis colis = em.find(Colis.class,identifiant);
        colis.setLatitude(latitude);
        colis.setEmplacement(emplacement);
        colis.setLongitude(longitude);
        colis.setState(state);
        return colis;
    }
}
