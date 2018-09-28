package ge.dao;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class JaxwsTableDAO extends AbstractDAO {

  @PersistenceContext(unitName = "ufc")
  private EntityManager entityManager;

  @Override
  public EntityManager getEntityManager() {
    return entityManager;
  }

}
