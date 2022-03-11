package edu.uci.ics.asterix.result.metadata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Index implements IMetadataJson {
    //We need this to bind the capitalized field names to the member dataverseName
    @JsonProperty("DataverseName")
    private String dataverseName;

    @JsonProperty("DatasetName")
    private String datasetName;

    @JsonProperty("IndexName")
    private String IndexName;

    @JsonProperty("IndexStructure")
    private String IndexStructure;
    // BTREE: BTREE
    // RTREE: RTREE
    // LENGTH_PARTITIONED_WORD_INVIX: KEYWORD
    // SINGLE_PARTITION_WORD_INVIX: FULLTEXT -- yes without "ED" for some reason
    // LENGTH_PARTITIONED_NGRAM_INVIX: NGRAM()

    @JsonProperty("SearchKey")
    private List<List<String>> SearchKey;

    @JsonProperty("IsPrimary")
    private boolean IsPrimary;

    @JsonProperty("SearchKeyType")
    private List<String> SearchKeyType;

    @JsonProperty("GramLength")
    private int GramLength;

    @JsonProperty("IsEnforced")
    private String IsEnforced;

    public String getDataverseName() {
        return dataverseName;
    }

    public void setDataverseName(String dataverseName) {
        this.dataverseName = dataverseName;
    }

    public String getDatasetName() {
        return datasetName;
    }

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    public String getIndexName() {
        return IndexName;
    }

    public void setIndexName(String indexName) {
        IndexName = indexName;
    }

    public String getIndexStructure() {
        return IndexStructure;
    }

    public void setIndexStructure(String indexStructure) {
        IndexStructure = indexStructure;
    }

    public List<List<String>> getSearchKey() {
        return SearchKey;
    }

    public void setSearchKey(List<List<String>> searchKey) {
        SearchKey = searchKey;
    }

    public boolean getIsPrimary() {
        return IsPrimary;
    }

    public void setIsPrimary(boolean isPrimary) {
        IsPrimary = isPrimary;
    }

    public List<String> getSearchKeyType() {
        return SearchKeyType;
    }

    public void setSearchKeyType(List<String> searchKeyType) {
        SearchKeyType = searchKeyType;
    }

    public int getGramLength() {
        return GramLength;
    }

    public void setGramLength(int gramLength) {
        GramLength = gramLength;
    }

    public String getIsEnforced() {
        return IsEnforced;
    }

    public void setIsEnforced(String isEnforced) {
        IsEnforced = isEnforced;
    }
}
