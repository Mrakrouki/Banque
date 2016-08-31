package fr.afcepf.al28.seb.banque.business.api;

import fr.afcepf.al28.seb.banque.entity.Client;
import fr.afcepf.al28.seb.banque.entity.Compte;
import fr.afcepf.al28.seb.banque.entity.Credit;
import fr.afcepf.al28.seb.banque.entity.Debit;
import fr.afcepf.al28.seb.banque.entity.Operation;

public interface IBusinessUtilisateur {
    Client creerClient(Client client);
    Compte creerCompte(Compte compte);
    Boolean verifierMDP(String mdp);
    Client modifierMDP(String mdp);
    Debit debiter(Compte compte, Double montant);
    Credit crediter(Compte compte, Double montant);
    Operation virer(Compte debiteur, Compte Crediteur, Double Montant);
}
