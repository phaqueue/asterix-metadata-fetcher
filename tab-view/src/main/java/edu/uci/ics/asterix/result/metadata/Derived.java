package edu.uci.ics.asterix.result.metadata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
Derived": {
 * "Tag": "RECORD",
 * "IsAnonymous": false,
 * "Record": {
 * "IsOpen": true,
 * "Fields": [
 * {
 * "FieldName": "id",
 * "FieldType": "int64",
 * "IsNullable": false,
 * "IsMissable": false
 * },
 * {
 * "FieldName": "a",
 * "FieldType": "NestedType_a",
 * "IsNullable": false,
 * "IsMissable": false
 * },
 * {
 * "FieldName": "p",
 * "FieldType": "NestedType_p",
 * "IsNullable": false,
 * "IsMissable": false
 * },
 * {
 * "FieldName": "z",
 * "FieldType": "date",
 * "IsNullable": false,
 * "IsMissable": false
 * }
 * ]
 * }
 * }
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Derived implements IMetadataJson {

    @JsonProperty("Tag")
    private String tag;

    @JsonProperty("Record")
    private Record record;

    @JsonProperty("OrderedList")
    private String orderedList;

    @JsonProperty("UnorderedList")
    private String unorderedList;

    @JsonProperty("IsAnonymous")
    private Boolean IsAnonymous;

    public Boolean getIsAnonymous() {
        return IsAnonymous;
    }

    public void setIsAnonymous(Boolean isAnonymous) {
        IsAnonymous = isAnonymous;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

    public String getOrderedList() {
        return orderedList;
    }

    public void setOrderedList(String orderedList) {
        this.orderedList = orderedList;
    }

    public String getUnorderedList() {
        return unorderedList;
    }

    public void setUnorderedList(String unorderedList) {
        this.unorderedList = unorderedList;
    }
}
