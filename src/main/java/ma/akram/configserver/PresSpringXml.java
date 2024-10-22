package ma.akram.configserver;

import ma.akram.configserver.service.manager.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXml {
    public static void main(String[] args) {
        /*
            // XML configuration File
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
            IMetier metier = (IMetier) applicationContext.getBean("metier");
            System.out.println(metier.calculate());
        */

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("ma.akram.configserver.service", "ma.akram.configserver.service.manager");
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println(metier.calculate());
    }
}
