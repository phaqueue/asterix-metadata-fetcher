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

package edu.uci.ics.asterix.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.node.ObjectNode;
import edu.uci.ics.asterix.result.ResultObject;
import edu.uci.ics.asterix.result.metadata.Dataset;
import edu.uci.ics.asterix.result.metadata.Datatype;
import edu.uci.ics.asterix.result.metadata.Index;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

import static edu.uci.ics.asterix.AsterixUtil.OBJECT_MAPPER;

/**
 * AsterixDB HTTP API client
 */
public class HttpAPIClient {
    private static final Logger LOGGER = Logger.getLogger(HttpAPIClient.class.getName());
    private static final String QUERY_SERVICE_PATH = "/query/service";
    private final String uri;

    public HttpAPIClient(String host, String port) {
        this("http", host, port);
    }

    public HttpAPIClient(String protocol, String host, String port) {
        uri = protocol + "://" + host + ":" + port;
    }

    public ResultObject<Dataset> getDatasets(String query) throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost apiHttpPost = new HttpPost(uri + QUERY_SERVICE_PATH);
        ObjectNode jsonRequest = OBJECT_MAPPER.createObjectNode();
        jsonRequest.put("statement", query);
        apiHttpPost.setEntity(new StringEntity(jsonRequest.toString(), ContentType.APPLICATION_JSON));
        InputStream inputStream = httpclient.execute(apiHttpPost).getEntity().getContent();
        return OBJECT_MAPPER.readValue(inputStream, new TypeReference<ResultObject<Dataset>>() {
        });
    }

    public ResultObject<Datatype> getDatatypes(String query) throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost apiHttpPost = new HttpPost(uri + QUERY_SERVICE_PATH);
        ObjectNode jsonRequest = OBJECT_MAPPER.createObjectNode();
        jsonRequest.put("statement", query);
        apiHttpPost.setEntity(new StringEntity(jsonRequest.toString(), ContentType.APPLICATION_JSON));
        InputStream inputStream = httpclient.execute(apiHttpPost).getEntity().getContent();
        return OBJECT_MAPPER.readValue(inputStream, new TypeReference<ResultObject<Datatype>>() {
        });
    }

    public ResultObject<Index> getIndexes(String query) throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost apiHttpPost = new HttpPost(uri + QUERY_SERVICE_PATH);
        ObjectNode jsonRequest = OBJECT_MAPPER.createObjectNode();
        jsonRequest.put("statement", query);
        apiHttpPost.setEntity(new StringEntity(jsonRequest.toString(), ContentType.APPLICATION_JSON));
        InputStream inputStream = httpclient.execute(apiHttpPost).getEntity().getContent();
        return OBJECT_MAPPER.readValue(inputStream, new TypeReference<ResultObject<Index>>() {
        });
    }
}
