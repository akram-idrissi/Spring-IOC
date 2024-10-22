package ma.akram.configserver.service;

import ma.akram.configserver.service.manager.IData;
import ma.akram.configserver.service.manager.IMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class MetierImpl implements IMetier {

    @Autowired
    @Qualifier("data")
    private IData datacall;
    @Override
    public double calculate() {
        double data = datacall.getData();
        return data * 15.6;
    }
    public void setDatacall(DataImpl datacall) {
        this.datacall = datacall;
    }

    public void setDataCall(DataImpl dataCall) {
    }
}