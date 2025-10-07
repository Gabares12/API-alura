package ModuloUM;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
//Andrés D'Alessandro
public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner buscarLivro = new Scanner(System.in);

        System.out.println("Digite um livro para a busca: ");

        String buscador = buscarLivro.nextLine();

        String livrosUrl = "https://www.googleapis.com/books/v1/volumes?q=" + buscador + "&key=AIzaSyCw-iANKbioXomaSAYktR9oBd1C7Fd7poc";


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(livrosUrl))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());




    }
}
