package fr.afcepf.al28.seb.banque.data.test;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.afcepf.al28.seb.banque.data.api.IDaoUtilisateur;
import fr.afcepf.al28.seb.banque.entity.Utilisateur;

public class TestCreaBase {
    private static Logger log = Logger.getLogger(TestCreaBase.class);
    public static void main(String[] args) {
        BeanFactory bf = new ClassPathXmlApplicationContext("classpath:spring.xml");
        IDaoUtilisateur dao = bf.getBean(IDaoUtilisateur.class);
        Utilisateur util = new Utilisateur();
        util.setNom("caca");
        dao.addUtilisateur(util);
    }
}
