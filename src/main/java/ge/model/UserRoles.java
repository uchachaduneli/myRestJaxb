package ge.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "USER_ROLES", schema = "UFC", catalog = "")
public class UserRoles {
  private Long id;
  private String applicationId;
  private String username;
  private Time updateDate;

  @Id
  @Column(name = "ID")
  @SequenceGenerator(name = "seqGen", sequenceName = "user_role_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqGen")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Basic
  @Column(name = "APPLICATION_ID")
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  @Basic
  @Column(name = "USERNAME")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Basic
  @Column(name = "UPDATE_DATE")
  public Time getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(Time updateDate) {
    this.updateDate = updateDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UserRoles userRoles = (UserRoles) o;
    return Objects.equals(id, userRoles.id) &&
            Objects.equals(applicationId, userRoles.applicationId) &&
            Objects.equals(username, userRoles.username) &&
            Objects.equals(updateDate, userRoles.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, applicationId, username, updateDate);
  }
}
