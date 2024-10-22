package ma.akram.configserver.service;

import ma.akram.configserver.service.manager.IData;
import org.springframework.stereotype.Component;

@Component("data")
public class DataImpl implements IData {
    @Override
    public double getData() {
        System.out.println("Recuperation de la Base de donnes ");
        return 10;
    }
}
