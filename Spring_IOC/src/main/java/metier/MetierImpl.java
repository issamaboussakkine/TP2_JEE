package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metierImpl")
public class MetierImpl implements IMetier {

    @Autowired
    @Qualifier("daoImpl")
    private IDao dao;

    @Override
    public double calcul() {
        return dao.getValue() * 2;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}