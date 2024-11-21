/*
* Crie um programa em Java que escreva a seguinte mensagem em um arquivo chamado "arquivo.txt":
* "Conteúdo a ser gravado no arquivo." Utilize as classes do pacote java.io.
*
* */

package br.com.alura.screenmatch.desafios.desafio04.exercicio01;

import java.io.FileWriter;
import java.io.IOException;

public class EscreverArquivo {
    public static void main(String[] args) throws IOException {
        FileWriter escrita = new FileWriter("arquivo.txt");
        escrita.write("Conteúdo a ser gravado no arquivo.");
        escrita.close();
    }
}
