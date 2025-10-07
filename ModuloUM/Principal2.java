package ModuloUM;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner precobit = new Scanner(System.in);
        System.out.println("digite o nome da criptomoeda: ");

        String buscador = precobit.nextLine();

        String cripUrl = "https://api.coingecko.com/api/v3/simple/price?ids=" + buscador + "&vs_currencies=usd";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(cripUrl))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

    }
}
