package ModuloDOIS;


import com.google.gson.Gson;

//↓ objetos↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
record Editora(String nome) {}
record informacoesLivro(String titulo, String autor, Editora editora) {}

