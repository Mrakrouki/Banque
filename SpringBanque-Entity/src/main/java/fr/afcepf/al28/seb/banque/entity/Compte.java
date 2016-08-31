package fr.afcepf.al28.seb.banque.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table(name="compte")
public class Compte {

    /**
     * Default constructor
     */
    public Compte() {
    }

    /**
     * 
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer numero;

    /**
     * 
     */
    private String libelle;

    /**
     * 
     */
    @ManyToOne
	@JoinColumn(name="id")
    private Client client;

    /**
     * 
     */
    @OneToMany(mappedBy="compte")
    private Set<Operation> operations;

    /**
     * 
     */
    @OneToMany(mappedBy="compte")
    private Set<Debit> virement;

    /**
     * @return
     */
    public double getSolde() {
        // TODO implement here
        return 0.0d;
    }

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Set<Operation> getOperations() {
		return operations;
	}

	public void setOperations(Set<Operation> operations) {
		this.operations = operations;
	}

	public Set<Debit> getVirement() {
		return virement;
	}

	public void setVirement(Set<Debit> virement) {
		this.virement = virement;
	}

    
}