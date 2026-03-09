package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metierImplissam2")
public class MetierImplissam2 implements IMetier {

    @Autowired
    @Qualifier("daoImplissam2")
    private IDao dao;

    @Override
    public double calcul() {
        return dao.getValue() * 3;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}