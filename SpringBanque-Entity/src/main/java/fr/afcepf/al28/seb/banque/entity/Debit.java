package fr.afcepf.al28.seb.banque.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
	@JoinColumn(name="numero", insertable=false, updatable=false)
    private Compte compte;
    
    @ManyToOne
    @JoinColumn(name="numero", insertable=false, updatable=false)
    private Compte compteDestinataire;
    
	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

    /**
     * @return the compteDestinataire
     */
    public Compte getCompteDestinataire() {
        return compteDestinataire;
    }

    /**
     * @param paramCompteDestinataire the compteDestinataire to set
     */
    public void setCompteDestinataire(Compte paramCompteDestinataire) {
        compteDestinataire = paramCompteDestinataire;
    }
}