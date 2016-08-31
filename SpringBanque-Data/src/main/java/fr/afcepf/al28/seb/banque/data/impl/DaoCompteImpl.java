package fr.afcepf.al28.seb.banque.data.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.afcepf.al28.seb.banque.data.api.IDaoCompte;
import fr.afcepf.al28.seb.banque.entity.Client;
import fr.afcepf.al28.seb.banque.entity.Compte;
@Service
@Transactional
public class DaoCompteImpl implements IDaoCompte{
    private SessionFactory sf;
    @Autowired
    public void setSf(SessionFactory sf) {
        this.sf = sf;
    }
    @SuppressWarnings("unchecked")
    @Override
    public List<Compte> getListeComptes(Client paramClient) {
        List<Compte> listeComptes = null;
        String reqSQL = "SELECT distinct (c) FROM Compte c LEFT JOIN FETCH c.client WHERE c.client.id = :paramClientId ";
        Query query = sf.getCurrentSession().createQuery(reqSQL);
        query.setParameter("paramClientId", paramClient.getId());
        listeComptes= query.list();
        return listeComptes;
    }

    @Override
    public Compte makeCompte(Compte paramCompte) {
        sf.getCurrentSession().save(paramCompte);
        return paramCompte;
    }

    @Override
    public Compte updateCompte(Compte paramCompte) {
        sf.getCurrentSession().update(paramCompte);
        return paramCompte;
    }
}
