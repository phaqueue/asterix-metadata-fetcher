package edu.uci.ics.asterix.result.metadata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Fields implements IMetadataJson {
    @JsonProperty("FieldName")
    private String fieldName;

    @JsonProperty("FieldType")
    private String fieldType;

    @JsonProperty("IsNullable")
    private boolean isNullable;

    @JsonProperty("IsMissable")
    private boolean isMissable;

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public boolean isNullable() {
        return isNullable;
    }

    public void setNullable(boolean nullable) {
        isNullable = nullable;
    }

    public boolean isMissable() {
        return isMissable;
    }

    public void setMissable(boolean missable) {
        isMissable = missable;
    }

}
