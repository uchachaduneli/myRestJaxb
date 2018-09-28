package ge.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Roles {
  private Long id;
  private String roleName;
  private String roleDesc;
  private Time updateDate;

  @Id
  @Column(name = "ID")
  @SequenceGenerator(name = "seqGen", sequenceName = "role_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqGen")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Basic
  @Column(name = "ROLE_NAME")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  @Basic
  @Column(name = "ROLE_DESC")
  public String getRoleDesc() {
    return roleDesc;
  }

  public void setRoleDesc(String roleDesc) {
    this.roleDesc = roleDesc;
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
    Roles roles = (Roles) o;
    return Objects.equals(id, roles.id) &&
            Objects.equals(roleName, roles.roleName) &&
            Objects.equals(roleDesc, roles.roleDesc) &&
            Objects.equals(updateDate, roles.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, roleName, roleDesc, updateDate);
  }
}
