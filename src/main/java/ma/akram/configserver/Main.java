package ma.akram.configserver;

import ma.akram.configserver.service.DataImpl;
import ma.akram.configserver.service.MetierImpl;
import ma.akram.configserver.service.manager.IData;
import ma.akram.configserver.service.manager.IMetier;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    IMetier metier = new MetierImpl();
    IData data = new DataImpl();





}