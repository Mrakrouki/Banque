package fr.afcepf.al28.seb.banque.data.test;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCreaBase {
    private static Logger log = Logger.getLogger(TestCreaBase.class);
    public static void main(String[] args) {
        BeanFactory bf = new ClassPathXmlApplicationContext("classpath:spring.xml");
    }
}
