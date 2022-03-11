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
 * Return A Dataset information
 */
//This annotation tells the Jackson parser we do not care about other fields from Dataset
@JsonIgnoreProperties(ignoreUnknown = true)
public class Dataset implements IMetadataJson {
    //We need this to bind the capitalized field names to the member dataverseName
    @JsonProperty("DataverseName")
    private String dataverseName;

    @JsonProperty("DatasetName")
    private String datasetName;

    @JsonProperty("DatatypeDataverseName")
    private String datatypeDataverseName;

    @JsonProperty("DatatypeName")
    private String datatypeName;

    @JsonProperty("DatasetId")
    private int datasetId;

    @JsonProperty("InternalDetails")
    private InternalDetails internalDetails;

    public String getDataverseName() {
        return dataverseName;
    }

    public void setDataverseName(String DataverseName) {
        this.dataverseName = DataverseName;
    }

    public String getDatasetName() {
        return datasetName;
    }

    public void setDatasetName(String DataverseName) {
        this.datasetName = DataverseName;
    }

    public String getDatatypeDataverseName() {
        return datatypeDataverseName;
    }

    public void setDatatypeDataverseName(String DatatypeDataverseName) {
        this.datatypeDataverseName = DatatypeDataverseName;
    }

    public String getDatatypeName() {
        return datatypeName;
    }

    public void setDatatypeName(String DatatypeName) {
        this.datatypeName = DatatypeName;
    }

    public int getDatasetId() {
        return datasetId;
    }

    public void setDatasetId(int DatasetId) {
        this.datasetId = DatasetId;
    }

    public InternalDetails getInternalDetails() {
        return internalDetails;
    }

    public void setInternalDetails(InternalDetails internalDetails) {
        this.internalDetails = internalDetails;
    }

    @Override
    public String toString() {
        return "Dataset{" + "dataverseName='" + dataverseName + '\'' + ", datasetName='" + datasetName + '\''
                + ", datatypeDataverseName='" + datatypeDataverseName + '\'' + ", datatypeName='" + datatypeName + '\''
                + ", datasetId=" + datasetId + '}';
    }
}
