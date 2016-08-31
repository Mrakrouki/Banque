package fr.afcepf.al28.seb.banque.data.api;

import fr.afcepf.al28.seb.banque.entity.Compte;
import fr.afcepf.al28.seb.banque.entity.Utilisateur;

public interface IDaoUtilisateur {
	public Utilisateur addUtilisateur(Utilisateur utilisateur);
    public Boolean removeUtilisateur(Utilisateur utilisateur);
    public Utilisateur updateUtilisateur(Utilisateur utilisateur);
    public Utilisateur addCompte(Utilisateur utilisateur, Compte compte);
}
