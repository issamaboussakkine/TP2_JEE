package dao;

import org.springframework.stereotype.Component;

@Component("daoImplissam2")
public class DaoImplissam2 implements IDao {
    @Override
    public double getValue() {
        return 450.0;
    }
}