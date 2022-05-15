package com.asaf.runtime.request;

import java.util.Set;
import javax.validation.constraints.Min;

/** Object Used to List Car */
public class CarFilter {

  @Min(value = 0)
  private Integer currentPage;

  private Set<String> description;

  private Set<String> id;

  private Set<String> name;

  @Min(value = 1)
  private Integer pageSize;

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
