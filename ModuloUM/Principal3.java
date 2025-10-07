package ModuloUM;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal3 {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner receitas = new Scanner(System.in);
        System.out.println("Busque por uma receita: ");
        String buscarReceitas = receitas.nextLine();

        String receiUrl = "https://www.themealdb.com/api/json/v1/1/random.php?q=" + buscarReceitas + "&key=1";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(receiUrl))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());




    }
}
//www.themealdb.com/api/json/v1/1/random.php