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


        //listagem de todos os alunos mariculados
        System.out.println("Lista de todos os alunos matriculados");
        Set<Aluno> uniao = new HashSet<>(turmaBD);
        uniao.addAll(turmaED);
        //método, vai percorrer o vetor união(todos)
        uniao.forEach(aluno -> System.out.println(aluno));

        //listagem dos alunos matriculados somente em banco de dados
        System.out.println("\nLista dos alunos matriculados e banco de dados");
        Set<Aluno> soBD = new HashSet<>(turmaBD);
        soBD.removeAll(turmaED);
        soBD.forEach(aluno -> System.out.println(aluno));


        //listagem dos alunos que estão matriculados nas duas disciplinas
        System.out.println("\nLista dos alunos matriculados nas duas disciplinas");
        Set<Aluno> nasDuas = new HashSet<>(turmaBD);
        //mantem os alunos da outra turma
        nasDuas.retainAll(turmaED);
        //nasDuas.forEach(aluno -> System.out.println(aluno));
        nasDuas.forEach(System.out::println);

        //turmaBD.forEach(aluno -> System.out.println(aluno));


    }
}
