package ge.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Jaxws {
  private Long id;
  private String name;
  private String lastname;
  private String cardNumber;

  @Id
  @Column(name = "ID")
  @SequenceGenerator(name="seqGen",sequenceName="jaxws_seq", allocationSize=1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seqGen")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Basic
  @Column(name = "NAME")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Basic
  @Column(name = "LASTNAME")
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  @Basic
  @Column(name = "CARD_NUMBER")
  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Jaxws jaxws = (Jaxws) o;
    return Objects.equals(id, jaxws.id) &&
            Objects.equals(name, jaxws.name) &&
            Objects.equals(lastname, jaxws.lastname) &&
            Objects.equals(cardNumber, jaxws.cardNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, lastname, cardNumber);
  }
}
