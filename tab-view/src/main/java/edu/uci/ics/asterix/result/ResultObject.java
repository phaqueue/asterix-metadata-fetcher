  /*
   * Licensed to the Apache Software Foundation (ASF) under one or more
   * contributor license agreements.  See the NOTICE file distributed with
   * this work for additional information regarding copyright ownership.
   * The ASF licenses this file to You under the Apache License, Version 2.0
   * (the "License"); you may not use this file except in compliance with
   * the License.  You may obtain a copy of the License at
   *
   *    http://www.apache.org/licenses/LICENSE-2.0
   *
   * Unless required by applicable law or agreed to in writing, software
   * distributed under the License is distributed on an "AS IS" BASIS,
   * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   * See the License for the specific language governing permissions and
   * limitations under the License.
   */
  package edu.uci.ics.asterix.result;

  import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
  import edu.uci.ics.asterix.result.metadata.IMetadataJson;

  import java.util.List;

  /**
   * Result object that will be returned from AsterixDB HTTP API.
   */
  @JsonIgnoreProperties(ignoreUnknown = true)
  public class ResultObject<T extends IMetadataJson> {

      private List<T> results;
      private String status;

      public List<T> getResults() {
          return results;
      }

      public void setResults(List<T> results) {
          this.results = results;
      }

      public String getStatus() {
          return status;
      }

      public void setStatus(String status) {
          this.status = status;
      }

      /*
      Bruh why can I not do it here :(
      public void init() {
          for (int i = 0; i < results.size(); i++)
              result.put(results.get(i).getDatatypeName(), results.get(i));
      }*/
  }