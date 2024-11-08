package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHorario;

    public Curso(){}

    public int getCargaHoraria(){return cargaHorario;}

    public void setCargaHoraria(int cargaHorario){this.cargaHorario = cargaHorario;}

    @Override
    public double calcularXP(){
        return XP_PADRAO * cargaHorario;
    }

    @Override
    public String toString(){
        return "{titulo = " + getTitulo() +
        ", descricao = "  + getDescricao() +
        ", cargaHoraria = " + cargaHorario + "}";
    }

}
