package br.com.danielcompany.desafiocursolistascolecoesdados.principal;

import br.com.danielcompany.desafiocursolistascolecoesdados.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//1.Crie uma lista de números inteiros e utilize o
//  método Collections.sort para ordená-la em ordem crescente.
//  Em seguida, imprima a lista ordenada.

//2.Crie uma classe Titulo com um atributo nome do tipo String.
//  Implemente a interface Comparable na classe para que seja possível
//  ordenar uma lista de objetos Titulo.

//3.No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a
//  uma lista. Utilize o método Collections.sort para ordenar a lista e,
//  em seguida, imprima os títulos ordenados.

//4.Crie uma lista utilizando a interface List e instancie-a tanto como
//  ArrayList quanto como LinkedList. Adicione elementos e imprima a lista,
//  mostrando que é possível trocar facilmente a implementação.

//5.Modifique o Exercício 4 para declarar a variável de lista como a
//  interface List, demonstrando o uso de polimorfismo.

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(33);
        numeros.add(12);
        numeros.add(57);
        numeros.add(45);
        numeros.add(999);

        Collections.sort(numeros);
        System.out.println(numeros);

        Titulo livro1 = new Titulo("Crônicas de Artur");
        Titulo livro2 = new Titulo("Fundação");
        Titulo livro3 = new Titulo("O mundo perdido");
        Titulo livro4 = new Titulo("Duna");

        List<Titulo> livros = new ArrayList<>();
        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);
        livros.add(livro4);

        Collections.sort(livros);

        //List<String> nomes = new ArrayList<>(); Ex 4 e 5 trocando...
        List<String> nomes = new LinkedList<>();
        nomes.add("Roger");
        nomes.add("Rodolfo");
        nomes.add("Rodrigo");
        nomes.add("Renato");
        nomes.add("Reginaldo");

        System.out.println(nomes);
    }
}