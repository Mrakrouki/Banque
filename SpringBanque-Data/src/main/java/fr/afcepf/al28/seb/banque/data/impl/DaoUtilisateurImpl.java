package fr.afcepf.al28.seb.banque.data.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.afcepf.al28.seb.banque.data.api.IDaoUtilisateur;
import fr.afcepf.al28.seb.banque.entity.Client;
import fr.afcepf.al28.seb.banque.entity.Compte;
import fr.afcepf.al28.seb.banque.entity.Utilisateur;
@Service
@Transactional
public class DaoUtilisateurImpl implements IDaoUtilisateur{
    private SessionFactory sf;
    @Autowired
    public void setSf(SessionFactory sf){
        this.sf = sf;
    }
    @Override
    public Utilisateur addUtilisateur(Utilisateur paramUtilisateur) {
        sf.getCurrentSession().save(paramUtilisateur);
        return paramUtilisateur;
    }

    @Override
    public Boolean removeUtilisateur(Utilisateur paramUtilisateur) {
        sf.getCurrentSession().delete(paramUtilisateur);
        return true;
    }
    
    @Override
    public Utilisateur updateUtilisateur(Utilisateur paramUtilisateur) {
        sf.getCurrentSession().update(paramUtilisateur);
        return paramUtilisateur;
    }
    @Override
    public Utilisateur addCompte(Utilisateur paramUtilisateur,
            Compte paramCompte) {
        paramCompte.setClient((Client)paramUtilisateur);
        sf.getCurrentSession().save(paramCompte);
        return null;
    }
}
