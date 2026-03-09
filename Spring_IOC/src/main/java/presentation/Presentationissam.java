package presentation;

import dao.IDao;
import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"dao", "metier"})
public class Presentationissam {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Presentationissam.class);

        IDao dao1 = context.getBean("daoImpl", IDao.class);
        IDao dao2 = context.getBean("daoImplissam2", IDao.class);
        IDao dao3 = context.getBean("daoImplissam3", IDao.class);

        IMetier metier1 = context.getBean("metierImpl", IMetier.class);
        IMetier metier2 = context.getBean("metierImplissam2", IMetier.class);
        IMetier metier3 = context.getBean("metierImplissam3", IMetier.class);

        System.out.println("DaoImpl + MetierImpl = " + metier1.calcul());
        System.out.println("DaoImplissam2 + MetierImplissam2 = " + metier2.calcul());
        System.out.println("DaoImplissam3 + MetierImplissam3 = " + metier3.calcul());
    }
}