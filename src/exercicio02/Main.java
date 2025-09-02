package exercicio02;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Aluno> turmaBD = new HashSet<>();
        turmaBD.add(new Aluno(10, "A", "A"));
        turmaBD.add(new Aluno(20, "B", "B"));
        turmaBD.add(new Aluno(10, "C", "C"));
        turmaBD.add(new Aluno(30, "D", "D"));


        Set<Aluno> turmaED = new HashSet<>();
        turmaED.add(new Aluno(20, "B", "B"));
        turmaED.add(new Aluno(30, "D", "D"));
        turmaED.add(new Aluno(40, "E", "E"));


        turmaBD.forEach(aluno -> System.out.println(aluno));


    }
}
