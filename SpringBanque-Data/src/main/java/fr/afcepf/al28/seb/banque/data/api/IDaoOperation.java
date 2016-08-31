package fr.afcepf.al28.seb.banque.data.api;

import fr.afcepf.al28.seb.banque.entity.Compte;
import fr.afcepf.al28.seb.banque.entity.Credit;
import fr.afcepf.al28.seb.banque.entity.Debit;

public interface IDaoOperation {
    Boolean virer(Compte debiteur, Compte crediteur, Double montant);
    Debit debiterCompte(Compte compte, Double montant);
    Credit crediterCompte(Compte compte, Double montant);
}
