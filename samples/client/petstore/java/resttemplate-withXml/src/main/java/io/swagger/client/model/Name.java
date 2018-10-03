/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.dataformat.xml.annotation.*;
import javax.xml.bind.annotation.*;

/**
 * Model for testing model name same as property name
 */
@Schema(description = "Model for testing model name same as property name")
@XmlRootElement(name = "Name")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "Name")public class Name {

  @JsonProperty("name")
  @JacksonXmlProperty(localName = "name")
  @XmlElement(name="name")

  private Integer name = null;

  @JsonProperty("snake_case")
  @JacksonXmlProperty(localName = "snake_case")
  @XmlElement(name="snake_case")

  private Integer snakeCase = null;

  @JsonProperty("property")
  @JacksonXmlProperty(localName = "property")
  @XmlElement(name="property")

  private String property = null;

  @JsonProperty("123Number")
  @JacksonXmlProperty(localName = "123Number")
  @XmlElement(name="123Number")

  private Integer _123Number = null;
  public Name name(Integer name) {
    this.name = name;
    return this;
  }

  

  /**
  * Get name
  * @return name
  **/
  @Schema(required = true, description = "")
  public Integer getName() {
    return name;
  }
  public void setName(Integer name) {
    this.name = name;
  }
  /**
  * Get snakeCase
  * @return snakeCase
  **/
  @Schema(description = "")
  public Integer getSnakeCase() {
    return snakeCase;
  }
  public Name property(String property) {
    this.property = property;
    return this;
  }

  

  /**
  * Get property
  * @return property
  **/
  @Schema(description = "")
  public String getProperty() {
    return property;
  }
  public void setProperty(String property) {
    this.property = property;
  }
  /**
  * Get _123Number
  * @return _123Number
  **/
  @Schema(description = "")
  public Integer get123Number() {
    return _123Number;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Name name = (Name) o;
    return Objects.equals(this.name, name.name) &&
        Objects.equals(this.snakeCase, name.snakeCase) &&
        Objects.equals(this.property, name.property) &&
        Objects.equals(this._123Number, name._123Number);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(name, snakeCase, property, _123Number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Name {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    snakeCase: ").append(toIndentedString(snakeCase)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    _123Number: ").append(toIndentedString(_123Number)).append("\n");
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
