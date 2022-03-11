/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package edu.uci.ics.asterix.result.metadata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TODO add what you need here
 * <p>
 * {
 * DataverseName: “Test”,
 * DatatypeName: “TestType_children”,
 * Derived: {
 * Tag: “ORDEREDLIST”,
 * IsAnonymous: true,
 * OrderedList: “TestType_children_Item”
 * },
 * Timestamp: “Fri Feb 04 13:50:45 PST 2022”
 * }
 *
 * @see Dataset for an example
 */


@JsonIgnoreProperties(ignoreUnknown = true)
public class Datatype implements IMetadataJson {


    @JsonProperty("DataverseName")
    private String dataverseName;

    @JsonProperty("DatatypeName")
    private String datatypeName;

    @JsonProperty("Derived")
    private Derived derived;


    public String getDataverseName() {
        return dataverseName;
    }

    public void setDataverseName(String dataverseName) {
        this.dataverseName = dataverseName;
    }

    public String getDatatypeName() {
        return datatypeName;
    }

    public void setDatatypeName(String datatypeName) {
        this.datatypeName = datatypeName;
    }

    public Derived getDerived() {
        return derived;
    }

    public void setDerived(Derived derived) {
        this.derived = derived;
    }
    
}

