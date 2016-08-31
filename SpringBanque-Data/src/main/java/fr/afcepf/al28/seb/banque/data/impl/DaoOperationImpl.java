package fr.afcepf.al28.seb.banque.data.impl;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.afcepf.al28.seb.banque.data.api.IDaoOperation;
import fr.afcepf.al28.seb.banque.entity.Compte;
import fr.afcepf.al28.seb.banque.entity.Credit;
import fr.afcepf.al28.seb.banque.entity.Debit;
@Service
@Transactional
public class DaoOperationImpl implements IDaoOperation {
    
    private SessionFactory sf;
    @Autowired
    public void setSf(SessionFactory sf) {
        this.sf = sf;
    }
    @Override
    public Boolean virer(Compte paramDebiteur, Compte paramCrediteur,
            Double paramMontant) {
        Debit debit = debiterCompte(paramDebiteur, paramMontant);
        debit.setCompteDestinataire(paramCrediteur);
        crediterCompte(paramCrediteur, paramMontant);
        return true;
    }

    @Override
    public Debit debiterCompte(Compte paramCompte, Double paramMontant) {
        Debit debit = new Debit();
        debit.setMontant(paramMontant);
        debit.setDate(new Date());
        debit.setCompte(paramCompte);
        sf.getCurrentSession().save(debit);
        return null;
    }

    @Override
    public Credit crediterCompte(Compte paramCompte, Double paramMontant) {
        Credit credit = new Credit();
        credit.setMontant(paramMontant);
        credit.setDate(new Date());
        credit.setCompte(paramCompte);
        sf.getCurrentSession().save(credit);
        return null;
    }
    
}
