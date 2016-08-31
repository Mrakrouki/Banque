package fr.afcepf.al28.seb.banque.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * 
 */
@Entity
public class Client extends Utilisateur {

    /**
     * Default constructor
     */
    public Client() {
    }

    /**
     * 
     */
    private Boolean isFirstConnexion;

    /**
     * 
     */
    @OneToMany(mappedBy="client")
    private Set<Compte> comptes;

	public Boolean getIsFirstConnexion() {
		return isFirstConnexion;
	}

	public void setIsFirstConnexion(Boolean isFirstConnexion) {
		this.isFirstConnexion = isFirstConnexion;
	}

	public Set<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(Set<Compte> comptes) {
		this.comptes = comptes;
	}
    
    

}