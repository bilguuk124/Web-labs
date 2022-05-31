package webapp.server.database;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class Connector {

    @PersistenceContext(unitName = "com.tuneit.namePU")
    private EntityManager entityManager;


    public EntityManager getEntityManager() {
        return entityManager;
    }
}
