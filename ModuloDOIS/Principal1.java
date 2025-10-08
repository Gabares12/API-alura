package ModuloUM.ModuloDOIS;

public class Principal1 {
        public static void main(String[] args) {

            String jsonPessoa = "{\"nome\":\"Joao\",\"idade\":15,\"cidade\":\"Natal\"}";

          //  Gson gson = new Gson();
            Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

            System.out.println("Objeto pessoa: " + pessoa);
        }
    }




