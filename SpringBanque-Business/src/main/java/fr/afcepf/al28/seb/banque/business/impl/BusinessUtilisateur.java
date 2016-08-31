package fr.afcepf.al28.seb.banque.business.impl;

import fr.afcepf.al28.idao.IDaoCompte;
import fr.afcepf.al28.idao.IDaoUtilisateur;
import fr.afcepf.al28.seb.banque.business.api.IBusinessUtilisateur;
import fr.afcepf.al28.seb.banque.entity.Client;
import fr.afcepf.al28.seb.banque.entity.Compte;
import fr.afcepf.al28.seb.banque.entity.Credit;
import fr.afcepf.al28.seb.banque.entity.Debit;
import fr.afcepf.al28.seb.banque.entity.Operation;

public class BusinessUtilisateur implements IBusinessUtilisateur {
    private IDaoCompte daoCompte;
    private IDaoUtilisateur daoUtilisateur;

    @Override
    public Client creerClient(Client paramClient) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Compte creerCompte(Compte paramCompte) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean verifierMDP(String paramMdp) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Client modifierMDP(String paramMdp) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Debit debiter(Compte paramCompte, Double paramMontant) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Credit crediter(Compte paramCompte, Double paramMontant) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Operation virer(Compte paramDebiteur, Compte Crediteur,
            Double Montant) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @return the daoCompte
     */
    public IDaoCompte getDaoCompte() {
        return daoCompte;
    }

    /**
     * @param paramDaoCompte the daoCompte to set
     */
    public void setDaoCompte(IDaoCompte paramDaoCompte) {
        daoCompte = paramDaoCompte;
    }

    /**
     * @return the daoUtilisateur
     */
    public IDaoUtilisateur getDaoUtilisateur() {
        return daoUtilisateur;
    }

    /**
     * @param paramDaoUtilisateur the daoUtilisateur to set
     */
    public void setDaoUtilisateur(IDaoUtilisateur paramDaoUtilisateur) {
        daoUtilisateur = paramDaoUtilisateur;
    }
}
