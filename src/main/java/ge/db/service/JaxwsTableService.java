package ge.db.service;

import ge.dao.JaxwsTableDAO;
import ge.model.Jaxws;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JaxwsTableService {
  @Autowired
  private JaxwsTableDAO jaxwsTableDAO;

  public List<Jaxws> getJaxwsObjects() {
    List<Jaxws> list = jaxwsTableDAO.getAll(Jaxws.class);
    return list;
  }

  public Jaxws getJaxwsObjectById(Long recordId) {
    return (Jaxws) jaxwsTableDAO.find(Jaxws.class, recordId);
  }
}
