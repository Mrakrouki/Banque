package fr.afcepf.al28.seb.banque.data.api;

import fr.afcepf.al28.seb.banque.entity.Utilisateur;

public interface IDaoUtilisateur {

	public Utilisateur addUtil();
    public Boolean removeUtil();
    public Utilisateur updateUtil(Utilisateur util);
}
