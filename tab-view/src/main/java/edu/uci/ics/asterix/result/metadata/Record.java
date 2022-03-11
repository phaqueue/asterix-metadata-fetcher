package edu.uci.ics.asterix.result.metadata;

/*
"Record": {
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
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Record implements IMetadataJson {
    @JsonProperty("Fields")
    private List<Fields> fields;

    public List<Fields> getFields() {
        return fields;
    }

    public void setFields(List<Fields> fields) {
        this.fields = fields;
    }
}
