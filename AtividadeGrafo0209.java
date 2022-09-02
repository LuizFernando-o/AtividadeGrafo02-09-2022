/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package br.unicap.grafo.atividadegrafo0209;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class AtividadeGrafo0209 {
    
    static LinkedList<String> adj1 = new LinkedList<String>();
    static int cont = 0;
    static int ordem = 0, tamanho = 0;
    
    public static void leitor(String path) throws IOException {
        
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";

        //capturar ordem (nº de vértices)
        linha = buffRead.readLine();
        ordem = Integer.parseInt(linha);

        //capturar ordem (nº de arestas)
        linha = buffRead.readLine();
        tamanho = Integer.parseInt(linha);
        
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
        leitor("C:/Users/Aluno/Documents/NetBeansProjects/AtividadeGrafo0209/src/main/java/br/unicap/grafo/atividadegrafo0209/grafo.txt");
        System.out.println("Lendo o arquivo...\n");
        System.out.println("ORDEM: " + ordem);
        System.out.println("TAMANHO: " + tamanho);
        System.out.println("===================");
        
//        System.out.println(adj1.toString());
//         LinkedList<String> adj2 = new LinkedList<String>();
        
        for (int i = 0; i < adj1.size(); i++) {
            System.out.println(adj1.get(i));
        }
        
    }
    
}
