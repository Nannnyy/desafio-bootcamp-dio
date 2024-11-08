import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao Curso Java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("descricao curso Javascript");
        curso2.setCargaHoraria(10);

        // Tudo que tem em conteúdo tem em curso, mas nem tudo que tem em curso tem em conteudo.
        Conteudo conteudo = new Curso();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descricao mentoria java");
        mentoria1.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria1);
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCarol = new Dev();
        devCarol.setNome("Carol");
        devCarol.inscreverBootcamp(bootcamp);


        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos Carol: " + devCarol.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());

        devCarol.progredir();
        devJoao.progredir();
        
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Conteúdos Concluídos Carol: " + devCarol.getConteudosConcluidos());
        System.out.println("Conteúdos Concluídos João: " + devCarol.getConteudosConcluidos());
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Conteúdos Inscritos Carol: " + devCarol.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
    }
}