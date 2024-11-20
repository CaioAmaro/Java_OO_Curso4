package br.com.alura.screenmatch.desafios.desafio02.exercicio02;

import com.google.gson.Gson;

public class TransformarJsonAninhadoEmObjeto {
    public static void main(String[] args) {
        String json = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";

        Gson gson = new Gson();

        Livro livro = gson.fromJson(json, Livro.class);

        System.out.println(livro);


    }
}
