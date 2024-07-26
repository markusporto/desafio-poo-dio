import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("descricao curso jS");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descricao Java");
        mentoria.setData(LocalDate.now());

/*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }*/

        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMarkus = new Dev();
        devMarkus.setNome("Markus");
        devMarkus.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devMarkus.getConteudosInscritos());

        devMarkus.progredir();
        devMarkus.progredir();
        System.out.println("-");

        System.out.println("Conteudos Inscritos" + devMarkus.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devMarkus.getConteudosConcluidos());
        System.out.println("XP: "+ devMarkus.calcularXp());


        System.out.println("------------");

        Dev devVinicius = new Dev();
        devVinicius.setNome("Vinicius");
        devVinicius.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devVinicius.getConteudosInscritos());

        devVinicius.progredir();
        devVinicius.progredir();
        devVinicius.progredir();
        System.out.println("-");

        System.out.println("Conteudos Inscritos" + devVinicius.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devVinicius.getConteudosConcluidos());
        System.out.println("XP: "+ devVinicius.calcularXp());
    }
}