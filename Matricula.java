package br.digitalhouse.entregavel;

import java.util.Date;

public class Matricula {
    private Aluno aluno;
    private Curso curso;
    private Date dataMatricula = new Date();

    //Construtor da classe matrícula
    public Matricula(Aluno aluno, Curso curso, Date dataMatricula) {
        this.aluno = aluno;
        this.curso = curso;
        this.dataMatricula = dataMatricula;
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "aluno=" + aluno +
                ", curso=" + curso +
                ", dataMatricula=" + dataMatricula +
                '}';
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
}
