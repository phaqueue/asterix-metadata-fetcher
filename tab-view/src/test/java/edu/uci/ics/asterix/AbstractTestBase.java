package edu.uci.ics.asterix;/*
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

import edu.uci.ics.asterix.api.HttpAPIClient;

import java.util.logging.Logger;

public class AbstractTestBase {
    private static final Logger LOGGER = Logger.getLogger(AbstractTestBase.class.getName());
    private static final String HOST_DEFAULT = "localhost";
    private static final String PORT_DEFAULT = "19002";
    protected final HttpAPIClient client;

    AbstractTestBase() {
        this(HOST_DEFAULT, PORT_DEFAULT);
    }

    AbstractTestBase(String host, String port) {
        client = new HttpAPIClient(host, port);
    }
}
