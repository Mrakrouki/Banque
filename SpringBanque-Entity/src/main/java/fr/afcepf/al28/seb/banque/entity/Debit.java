package fr.afcepf.al28.seb.banque.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * 
 */
@Entity

public class Debit extends Operation {

    /**
     * Default constructor
     */
    public Debit() {
    }

    /**
     * 
     */
    @ManyToOne
	@JoinColumn(name="numero")
    private Compte compte;

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

    
}