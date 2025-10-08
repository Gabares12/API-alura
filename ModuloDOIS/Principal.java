package ModuloDOIS;

import com.google.gson.Gson;

public class Principal {
    public static void main(String[] args) {

        String jsonPessoa = "{\"nome\":\"Joao\",\"idade\":15,\"cidade\":\"Natal\"}";

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto pessoa: " + pessoa);
    }
}


