package ge.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Users {
  private String firstname;
  private String lastname;
  private Long id;

  @Id
  @Column(name = "ID")
  @SequenceGenerator(name = "seqGen", sequenceName = "user_seq", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqGen")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Basic
  @Column(name = "FIRSTNAME")
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  @Basic
  @Column(name = "LASTNAME")
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Users users = (Users) o;
    return Objects.equals(firstname, users.firstname) &&
            Objects.equals(lastname, users.lastname) &&
            Objects.equals(id, users.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstname, lastname, id);
  }
}
