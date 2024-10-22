package ma.akram.configserver.service;

import ma.akram.configserver.service.manager.IData;
import org.springframework.stereotype.Component;

@Component
public class DataImpl2 implements IData {
    @Override
    public double getData() {
        System.out.println("Recuperation de la Base de donnes 2 ");
        return 20;
    }
}
