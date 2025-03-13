import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//1.Crie uma lista de números inteiros e utilize o
//  método Collections.sort para ordená-la em ordem crescente.
//  Em seguida, imprima a lista ordenada.

//2.Crie uma classe Titulo com um atributo nome do tipo String.
//  Implemente a interface Comparable na classe para que seja possível
//  ordenar uma lista de objetos Titulo.


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
    }
}