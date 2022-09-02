package br.unicap.grafo.atividadegrafo0209;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class AtividadeGrafo0209 {
    
    //criando lista de adjacência
    static LinkedList<String> adj1 = new LinkedList<String>();
    static int cont = 0; //contador para cálculo interno
    static int ordem = 0, tamanho = 0; //atributos para armazenar ordem e tamanho
    
    public static void leitor(String path) throws IOException {
        
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";

        //capturar ordem (nº de vértices)
        linha = buffRead.readLine();
        ordem = Integer.parseInt(linha);

        //capturar ordem (nº de arestas)
        linha = buffRead.readLine();
        tamanho = Integer.parseInt(linha);
        
        //capturando e separando txt
        linha = buffRead.readLine();
        while (true) {
            if (linha != null) {
                linha = linha.replace(" ", " -> ");
                adj1.add(linha);
                cont++;
            } else {
                break;
            }
            linha = buffRead.readLine();
        }
        buffRead.close();
    }
    
    public static void main(String[] args) throws IOException {
        //lendo arquivo txt no diretório local
        leitor("C:/Users/Aluno/Documents/NetBeansProjects/AtividadeGrafo0209/src/main/java/br/unicap/grafo/atividadegrafo0209/grafo.txt");
        System.out.println("Lendo o arquivo...\n");
        System.out.println("ORDEM: " + ordem);
        System.out.println("TAMANHO: " + tamanho);
        System.out.println("=== GRAFO ===");
        
        //imprimindo grafo
        for (int i = 0; i < adj1.size(); i++) {
            System.out.println(adj1.get(i));
        }    
    }  
}
