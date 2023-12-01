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

        String apiUrl = "https://run.mocky.io/v3/5794d450-d2e2-4412-8131-73d0293ac1cc";
        HttpGet httpGet = new HttpGet(apiUrl);

        try {
            HttpResponse response = httpClient.execute(httpGet);

            int statusCode = response.getStatusLine().getStatusCode();
            System.out.println("Status Code: " + statusCode);

            BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            String line;
            StringBuilder content = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                content.append(line);
            }

            System.out.println("Response Content: " + content.toString());
            
            responseString = content.toString();
            return content.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return responseString;

	};
}
