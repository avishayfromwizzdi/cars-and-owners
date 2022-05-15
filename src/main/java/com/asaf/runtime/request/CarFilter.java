package com.asaf.runtime.request;

import com.asaf.runtime.model.AppUser;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import java.util.Set;
import javax.validation.constraints.Min;

/** Object Used to List Car */
@com.asaf.model.validation.IdValid.List({
  @com.asaf.model.validation.IdValid(
      targetField = "creator",
      field = "creatorIds",
      fieldType = com.asaf.runtime.model.AppUser.class)
})
public class CarFilter {

  @JsonIgnore private List<AppUser> creator;

  private Set<String> creatorIds;

  @Min(value = 0)
  private Integer currentPage;

  private Set<String> description;

  private Set<String> id;

  private Set<String> name;

  @Min(value = 1)
  private Integer pageSize;

  /** @return creator */
  @JsonIgnore
  public List<AppUser> getCreator() {
    return this.creator;
  }

  /**
   * @param creator creator to set
   * @return CarFilter
   */
  public <T extends CarFilter> T setCreator(List<AppUser> creator) {
    this.creator = creator;
    return (T) this;
  }

  /** @return creatorIds */
  public Set<String> getCreatorIds() {
    return this.creatorIds;
  }

  /**
   * @param creatorIds creatorIds to set
   * @return CarFilter
   */
  public <T extends CarFilter> T setCreatorIds(Set<String> creatorIds) {
    this.creatorIds = creatorIds;
    return (T) this;
  }

  /** @return currentPage */
  public Integer getCurrentPage() {
    return this.currentPage;
  }

  /**
   * @param currentPage currentPage to set
   * @return CarFilter
   */
  public <T extends CarFilter> T setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
    return (T) this;
  }

  /** @return description */
  public Set<String> getDescription() {
    return this.description;
  }

  /**
   * @param description description to set
   * @return CarFilter
   */
  public <T extends CarFilter> T setDescription(Set<String> description) {
    this.description = description;
    return (T) this;
  }

  /** @return id */
  public Set<String> getId() {
    return this.id;
  }

  /**
   * @param id id to set
   * @return CarFilter
   */
  public <T extends CarFilter> T setId(Set<String> id) {
    this.id = id;
    return (T) this;
  }

  /** @return name */
  public Set<String> getName() {
    return this.name;
  }

  /**
   * @param name name to set
   * @return CarFilter
   */
  public <T extends CarFilter> T setName(Set<String> name) {
    this.name = name;
    return (T) this;
  }

  /** @return pageSize */
  public Integer getPageSize() {
    return this.pageSize;
  }

  /**
   * @param pageSize pageSize to set
   * @return CarFilter
   */
  public <T extends CarFilter> T setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return (T) this;
  }
}
