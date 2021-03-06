package org.jboss.errai.jpa.test.entity.inherit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(
        name="parentConcreteEntity",
        query="SELECT pce FROM ParentConcreteEntity pce WHERE pce.protectedParentField >= :protectedFieldAtLeast AND pce.protectedParentField <= :protectedFieldAtMost")
public class ParentConcreteEntity {
  @Id @GeneratedValue protected long id;

  // some fields with a variety of access modifiers (all should be persistent and inherited by the parent)
  private int privateParentField;
  protected int protectedParentField;
  int packagePrivateParentField;
  public int publicParentField;
  public long getId() {
    return id;
  }
  public void setId(long id) {
    this.id = id;
  }
  public int getPrivateParentField() {
    return privateParentField;
  }
  public void setPrivateParentField(int privateParentField) {
    this.privateParentField = privateParentField;
  }
  public int getProtectedParentField() {
    return protectedParentField;
  }
  public void setProtectedParentField(int protectedParentField) {
    this.protectedParentField = protectedParentField;
  }
  public int getPackagePrivateParentField() {
    return packagePrivateParentField;
  }
  public void setPackagePrivateParentField(int packagePrivateParentField) {
    this.packagePrivateParentField = packagePrivateParentField;
  }
  public int getPublicParentField() {
    return publicParentField;
  }
  public void setPublicParentField(int publicParentField) {
    this.publicParentField = publicParentField;
  }
  @Override
  public String toString() {
    return "ParentConcreteEntity [id=" + id + ", privateParentField=" + privateParentField + ", protectedParentField="
            + protectedParentField + ", packagePrivateParentField=" + packagePrivateParentField
            + ", publicParentField=" + publicParentField + "]";
  }
}
