package blackjack;

import java.io.*;
import java.util.Scanner;

public class ManipuladorArquivo {
    public static void leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null) {
                System.out.println(linha);

            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }

    public static void escritor(String path, String conteudo) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        String linha = conteudo;
        buffWrite.append(linha + "\n");
        buffWrite.close();
    }
}
