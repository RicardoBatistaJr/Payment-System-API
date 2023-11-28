package handler;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

public class AuthenticationHandler {
	public AuthenticationHandler() {}
	public String getAuthorization() {
        HttpClient httpClient = HttpClients.createDefault();
        String responseString = "";

        // Define the API endpoint URL
        String apiUrl = "https://run.mocky.io/v3/5794d450-d2e2-4412-8131-73d0293ac1cc";

        // Create an HTTP GET request
        HttpGet httpGet = new HttpGet(apiUrl);

        try {
            // Execute the request and get the response
            HttpResponse response = httpClient.execute(httpGet);

            // Process the response, e.g., read the content
            int statusCode = response.getStatusLine().getStatusCode();
            System.out.println("Status Code: " + statusCode);

            // Read the response content
            BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            String line;
            StringBuilder content = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                content.append(line);
            }

            // Print or process the response content
            System.out.println("Response Content: " + content.toString());
            
            responseString = content.toString();
            return content.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return responseString;

	};
}
