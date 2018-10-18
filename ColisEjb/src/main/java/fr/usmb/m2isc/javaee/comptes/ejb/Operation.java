package fr.usmb.m2isc.javaee.comptes.ejb;

import java.util.List;

import fr.usmb.m2isc.javaee.comptes.ColisState;
import fr.usmb.m2isc.javaee.comptes.jpa.Colis;
import fr.usmb.m2isc.javaee.comptes.jpa.Compte;

public interface Operation {

	Compte creerCompte(String number, double depot);

	Compte getCompte(String number);

	Colis getColis(String number);

	Compte crediter(String number, double val);

	Compte debiter(String number, double val);

	void transferer(String numCpt1, double val, String numCpt2);

	List<Compte> findComptes(String partialNumber);

	List<Compte> findAllComptes();

	List<Colis> findAllColis();

	Colis registerColis(String identifiant, double poid, String name, String origin, String destination, double lat, double lng);

	Colis editColis(String identifiant, double latitude, double longitude, String emplacement, ColisState state);
}