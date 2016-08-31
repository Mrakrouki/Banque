package fr.afcepf.al28.seb.banque.business.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AspectBusiness {
	
	private static Logger log = Logger.getLogger(AspectBusiness.class);
	
	@Around("execution (* fr.afcepf.al28.seb.banque.business.impl.BusinessUtilisateur.modifierMDP(..))")
	public Object verifierMdpIsChanged(ProceedingJoinPoint pjp) throws Throwable{
		Object o = null;
	String mdp = pjp.getArgs()[0].toString();
	if(mdp.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$&+,:_;=?@#|'<>.-^*()%!]).{8,}$")) {
		o = pjp.proceed();
	} else{
		log.info("oups petit probleme de mot de passe");
		throw new Exception("Mot de passe non valide");
	}
	return o;
	}
	
	
}
