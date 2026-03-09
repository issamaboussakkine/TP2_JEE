package dao;

import org.springframework.stereotype.Component;

@Component("daoImpl")
public class DaoImpl implements IDao {
    @Override
    public double getValue() {
        return 444.0;
    }
}