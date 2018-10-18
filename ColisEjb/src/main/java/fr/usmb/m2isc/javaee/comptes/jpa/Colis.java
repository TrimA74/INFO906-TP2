package fr.usmb.m2isc.javaee.comptes.jpa;

import fr.usmb.m2isc.javaee.comptes.ColisState;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import java.io.Serializable;

@NamedQueries({
        @NamedQuery(name="allColis", query="SELECT c FROM Colis c"),
        @NamedQuery(name="findWithNum", query="SELECT c FROM Compte c WHERE c.numero LIKE :partialNum ORDER BY c.numero ASC")
})
@Entity
public class Colis implements Serializable {

    @Id
    private String identifiant;
    private double poid;
    private String name;
    private String origin;
    private String destination;

    private double latitude;
    private double longitude;
    private String emplacement;
    private ColisState state;

    public Colis() {

    }


    public Colis(String identifiant, double poid, String name, String origin, String destination, double lat, double lng) {
        super();
        this.identifiant = identifiant;
        this.poid = poid;
        this.name = name;
        this.origin = origin;
        this.destination = destination;
        this.state = ColisState.REGISTERED;
        this.latitude = lat;
        this.longitude = lng;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public double getPoid() {
        return poid;
    }

    public void setPoid(double poid) {
        this.poid = poid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public ColisState getState() {
        return state;
    }

    public void setState(ColisState state) {
        this.state = state;
    }
}
