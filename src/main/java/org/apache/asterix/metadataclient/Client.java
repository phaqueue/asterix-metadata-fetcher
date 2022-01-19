package org.apache.asterix.metadataclient;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.IOUtils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.concurrent.TimeUnit;

public class Client {
	private static final int MAX_CONNECTION_TIMEOUT_SECS = 15;
	private static final String QUERY_ENDPOINT = "query/service";

	private static final String HOSTPORT= "localhost:19002";
	private static final String QUERY = "{\"statement\":\"SELECT * FROM Metadata.`Dataset`;\"}";
	

    enum Method {
        GET,
        POST
    }

    public static void main(String[] args) throws IOException {
        HttpURLConnection conn;
		conn = openConnection(QUERY_ENDPOINT , Method.POST);
		if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
			String result = IOUtils.toString(conn.getInputStream(), StandardCharsets.UTF_8.name());
			ObjectMapper om = new ObjectMapper();
			JsonNode json = om.readTree(result);
			System.out.println(json.toPrettyString());
		}
	}

    private static HttpURLConnection openConnection(String path, Method method) throws IOException {
        URL url = new URL("http://" + HOSTPORT + "/" + path);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        final int timeoutMillis =
                (int) TimeUnit.SECONDS.toMillis(MAX_CONNECTION_TIMEOUT_SECS);
        conn.setConnectTimeout(timeoutMillis);
        conn.setReadTimeout(timeoutMillis);
        conn.setRequestMethod(method.name());
        conn.setRequestProperty("Connection", "close");
		conn.setRequestProperty("Accept", "application/json");
		conn.setRequestProperty("Content-Type", "application/json; utf-8");
		conn.setDoOutput(true);
		byte[] queryBytes = QUERY.getBytes("utf-8");
		conn.getOutputStream().write(queryBytes,0,queryBytes.length);
        return conn;
    }
}
