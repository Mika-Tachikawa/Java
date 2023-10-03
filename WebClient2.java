package test55;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebClient2 {

    public static void main(String[] args) throws IOException {
        URL url = new URL("http://example.com/");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            int lineCount = 0;

            while ((inputLine = in.readLine()) != null && lineCount < 5) {
                System.out.println(inputLine);
                lineCount++;
            }
            in.close();
        } else {
            System.out.println("HTTP Request Failed with response code: " + responseCode);
        }
    }
}