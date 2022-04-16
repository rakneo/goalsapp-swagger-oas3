package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GoalModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-16T11:31:32.847Z[GMT]")


public class GoalModel   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("goalName")
  private String goalName = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("dueDateTime")
  private String dueDateTime = null;

  @JsonProperty("createdDateTime")
  private String createdDateTime = null;

  @JsonProperty("lastModifiedDateTime")
  private String lastModifiedDateTime = null;

  public GoalModel id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GoalModel goalName(String goalName) {
    this.goalName = goalName;
    return this;
  }

  /**
   * Get goalName
   * @return goalName
   **/
  @Schema(description = "")
  
    public String getGoalName() {
    return goalName;
  }

  public void setGoalName(String goalName) {
    this.goalName = goalName;
  }

  public GoalModel description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @Schema(description = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GoalModel dueDateTime(String dueDateTime) {
    this.dueDateTime = dueDateTime;
    return this;
  }

  /**
   * Get dueDateTime
   * @return dueDateTime
   **/
  @Schema(description = "")
  
    public String getDueDateTime() {
    return dueDateTime;
  }

  public void setDueDateTime(String dueDateTime) {
    this.dueDateTime = dueDateTime;
  }

  public GoalModel createdDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

  /**
   * Get createdDateTime
   * @return createdDateTime
   **/
  @Schema(description = "")
  
    public String getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  public GoalModel lastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
    return this;
  }

  /**
   * Get lastModifiedDateTime
   * @return lastModifiedDateTime
   **/
  @Schema(description = "")
  
    public String getLastModifiedDateTime() {
    return lastModifiedDateTime;
  }

  public void setLastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoalModel goalModel = (GoalModel) o;
    return Objects.equals(this.id, goalModel.id) &&
        Objects.equals(this.goalName, goalModel.goalName) &&
        Objects.equals(this.description, goalModel.description) &&
        Objects.equals(this.dueDateTime, goalModel.dueDateTime) &&
        Objects.equals(this.createdDateTime, goalModel.createdDateTime) &&
        Objects.equals(this.lastModifiedDateTime, goalModel.lastModifiedDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, goalName, description, dueDateTime, createdDateTime, lastModifiedDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    goalName: ").append(toIndentedString(goalName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dueDateTime: ").append(toIndentedString(dueDateTime)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
