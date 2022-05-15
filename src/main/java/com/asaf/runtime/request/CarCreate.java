package com.asaf.runtime.request;

/** Object Used to Create Car */
public class CarCreate {

  private String description;

  private String name;

  /** @return description */
  public String getDescription() {
    return this.description;
  }

  /**
   * @param description description to set
   * @return CarCreate
   */
  public <T extends CarCreate> T setDescription(String description) {
    this.description = description;
    return (T) this;
  }

  /** @return name */
  public String getName() {
    return this.name;
  }

  /**
   * @param name name to set
   * @return CarCreate
   */
  public <T extends CarCreate> T setName(String name) {
    this.name = name;
    return (T) this;
  }
}
