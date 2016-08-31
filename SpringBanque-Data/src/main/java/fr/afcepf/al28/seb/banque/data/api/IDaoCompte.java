package fr.afcepf.al28.seb.banque.data.api;

import java.util.List;

import fr.afcepf.al28.seb.banque.entity.Client;
import fr.afcepf.al28.seb.banque.entity.Compte;

public interface IDaoCompte {
    List<Compte> getListeComptes(Client client);
    Compte makeCompte(Compte compte);
	Compte updateCompte(Compte compte);
}
