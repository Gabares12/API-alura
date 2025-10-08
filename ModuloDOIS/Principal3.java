package ModuloDOIS;

import com.google.gson.Gson;

public class Principal3 {
    public static void main(String[] args) {
        String jsonLivro = "{\"titulo\":\"Aventuras do Java\", \"autor\":\"Akemi\", \"editora\":{\"nome\":\"TechBooks\"}}";
        String jsonEditora = "{\"nome\":\"TechBooks\"}";

        Gson gson = new Gson();

        informacoesLivro livro = gson.fromJson(jsonLivro, informacoesLivro.class);
        Editora editora = gson.fromJson(jsonEditora, Editora.class);

        System.out.println("Objeto Livro: " + livro);
        System.out.println("Objeto Editora: " + editora);

    }
}

