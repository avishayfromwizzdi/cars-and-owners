package com.asaf.runtime.request;

import com.asaf.runtime.model.AppUser;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** Object Used to Create Car */
@com.asaf.model.validation.IdValid.List({
  @com.asaf.model.validation.IdValid(
      targetField = "creator",
      field = "creatorId",
      fieldType = com.asaf.runtime.model.AppUser.class,
      groups = {com.asaf.runtime.validation.Create.class, com.asaf.runtime.validation.Update.class})
})
public class CarCreate {

  @JsonIgnore private AppUser creator;

  private String creatorId;

  private String description;

  private String name;

  /** @return creator */
  @JsonIgnore
  public AppUser getCreator() {
    return this.creator;
  }

  /**
   * @param creator creator to set
   * @return CarCreate
   */
  public <T extends CarCreate> T setCreator(AppUser creator) {
    this.creator = creator;
    return (T) this;
  }

  /** @return creatorId */
  public String getCreatorId() {
    return this.creatorId;
  }

  /**
   * @param creatorId creatorId to set
   * @return CarCreate
   */
  public <T extends CarCreate> T setCreatorId(String creatorId) {
    this.creatorId = creatorId;
    return (T) this;
  }

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
