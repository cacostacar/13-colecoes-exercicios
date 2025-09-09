package exercicio03;

import java.util.*;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        // <key, values>
        Map<Character, Integer> contador = new HashMap<>();


        System.out.println("Frase --> ");
        frase = sc.nextLine();

        //vetor de character
        for (char c : frase.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                //int valor = contador.get(c);
                //System.out.println(valor);
                contador.put(c, contador.getOrDefault(c, 0) + 1);
            }
        }

        //impressão em ordem alfabética - cria uma arvore rubro negra
        Set<Character> chave = contador.keySet();
        TreeSet<Character> arvore = new TreeSet(chave);
        for (char c : arvore) {
            System.out.println(c + " --> " + contador.get(c));
        }

    }

}
