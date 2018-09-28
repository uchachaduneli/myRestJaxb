package ge.xml.service;


import ge.db.service.JaxwsTableService;
import ge.xml.objects.Jaxws;
import ge.xml.objects.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Component
@Path("/user")
public class XMLService extends SpringBeanAutowiringSupport {

  @Autowired
  private JaxwsTableService jaxwsTableService;

  @GET
  @Path("/get/{name}/{lastname}")
  @Produces(MediaType.APPLICATION_XML)
  public User getUserInXML(@PathParam("name") String name, @PathParam("lastname") String lastname) {

    User user = new User();
    user.setUsername(name);
    user.setPassword(lastname);
    user.setPin(123456);

    return user;

  }

  @GET
  @Path("/getjaxwsrow/{id}")
  @Produces(MediaType.APPLICATION_XML)
  public Jaxws getUserInXML(@PathParam("id") Long id) {
    ge.model.Jaxws jaxwsDbObject = jaxwsTableService.getJaxwsObjectById(id);
    return new Jaxws(jaxwsDbObject.getId(), jaxwsDbObject.getName(), jaxwsDbObject.getLastname(), jaxwsDbObject.getCardNumber());
  }

}