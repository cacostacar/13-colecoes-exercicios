package exercicio01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Candidato> lista = new ArrayList<>();
        lista.add(new Candidato("A", 6.5, 10));
        lista.add(new Candidato("B", 3, 2));
        lista.add(new Candidato("C", 9.7, 15));
        lista.add(new Candidato("D", 9.7, 23));

        //critério de ordenação :: = referencia (se quiser um reversed para os dois critérios, só colocar no final)
        Comparator<Candidato> criterio = Comparator.comparing(Candidato::getNotaTecnica)
                .thenComparing(Candidato::getAnosExperiencia).reversed()
                        .thenComparing(Candidato::getNome);

        //aplica o critério de ordenação na lista
        lista.sort(criterio);

        //impressão da lista
        lista.forEach(candidato -> System.out.println(candidato));
    }
}
