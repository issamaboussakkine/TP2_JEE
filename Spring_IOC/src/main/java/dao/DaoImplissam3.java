package dao;

import org.springframework.stereotype.Component;

@Component("daoImplissam3")
public class DaoImplissam3 implements IDao {
    @Override
    public double getValue() {
        return 999.0;
    }
}