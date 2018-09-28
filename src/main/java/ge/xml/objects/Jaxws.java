package ge.xml.objects;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Jaxws {
  private Long id;
  private String name;
  private String lastname;
  private String cardNumber;

  public Jaxws(Long id, String name, String lastname, String cardNumber) {
    this.id = id;
    this.name = name;
    this.lastname = lastname;
    this.cardNumber = cardNumber;
  }

  public Jaxws() {
  }

  @XmlAttribute
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @XmlElement
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @XmlElement
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  @XmlElement
  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }
}
