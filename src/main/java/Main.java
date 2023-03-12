import dio.desafio.dominio.Curso;
import dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("java");
        curso1.setDescricao("curso");
        curso1.setCargaHoraria(8);

        System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("java");
        mentoria1.setDescricao("mentoria");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);
    }
}
