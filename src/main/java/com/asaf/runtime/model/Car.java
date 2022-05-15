package com.asaf.runtime.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Car {

  @Id private String id;

  private String name;

  private String description;

  @ManyToOne(targetEntity = AppUser.class)
  private AppUser creator;

  /** @return id */
  @Id
  public String getId() {
    return this.id;
  }

  /**
   * @param id id to set
   * @return Car
   */
  public <T extends Car> T setId(String id) {
    this.id = id;
    return (T) this;
  }

  /** @return name */
  public String getName() {
    return this.name;
  }

  /**
   * @param name name to set
   * @return Car
   */
  public <T extends Car> T setName(String name) {
    this.name = name;
    return (T) this;
  }

  /** @return description */
  public String getDescription() {
    return this.description;
  }

  /**
   * @param description description to set
   * @return Car
   */
  public <T extends Car> T setDescription(String description) {
    this.description = description;
    return (T) this;
  }

  /** @return creator */
  @ManyToOne(targetEntity = AppUser.class)
  public AppUser getCreator() {
    return this.creator;
  }

  /**
   * @param creator creator to set
   * @return Car
   */
  public <T extends Car> T setCreator(AppUser creator) {
    this.creator = creator;
    return (T) this;
  }
}
