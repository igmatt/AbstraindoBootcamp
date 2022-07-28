import desafioDominio.*;

import java.time.LocalDate;

public class Main {
    public static void main (String[]  args){

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcam Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIgor = new Dev();
        devIgor.setNome("Igor");
        devIgor.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Igor" + devIgor.getConteudosIncritos());
        devIgor.progredir();
        System.out.println("\n");
        System.out.println("Conteúdos Concluídos Igor" + devIgor.getConteudosConcluidos());
        System.out.println("\n");
        System.out.println("Conteúdos Inscritos Igor" + devIgor.getConteudosIncritos());
        devIgor.progredir();
        System.out.println("\n");
        System.out.println("Conteúdos Concluídos Igor" + devIgor.getConteudosConcluidos());
        System.out.println("\n");

        System.out.println("XP Adquirida: " + devIgor.calcularTotalXp());

        System.out.println("----------------------------------------------------------");

        Dev devGabriela = new Dev();
        devGabriela.setNome("Gabriela");
        devGabriela.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Gabriela" + devGabriela.getConteudosIncritos());
        devGabriela.progredir();
        System.out.println("\n");
        System.out.println("Conteúdos Concluídos Gabriela" + devGabriela.getConteudosConcluidos());
        System.out.println("\n");
        System.out.println("Conteúdos Inscritos Gabriela" + devGabriela.getConteudosIncritos());
        System.out.println("XP Adquirida: " + devGabriela.calcularTotalXp());
    }
}