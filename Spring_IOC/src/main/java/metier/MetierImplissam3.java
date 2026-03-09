package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metierImplissam3")
public class MetierImplissam3 implements IMetier {

    @Autowired
    @Qualifier("daoImplissam3")
    private IDao dao;

    @Override
    public double calcul() {
        return dao.getValue() * 10;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}