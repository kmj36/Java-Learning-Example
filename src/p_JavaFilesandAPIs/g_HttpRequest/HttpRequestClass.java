package p_JavaFilesandAPIs.g_HttpRequest;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpRequestClass {
    static void main(String[] args) throws  java.io.IOException, InterruptedException {
        try(var client = HttpClient.newHttpClient()) {
            var request = HttpRequest.newBuilder(URI.create("https://www.google.com"))
                    .header("accept", "text/html")
                    .build();
            var response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.print(response.body());
        }
    }
}
