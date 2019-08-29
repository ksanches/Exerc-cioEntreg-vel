package br.digitalhouse.entregavel;

import java.util.Objects;

public class Aluno {

    //1. Criar um diagrama de classes que modele a classe Aluno. A princípio, um aluno possui um nome (String), um sobrenome (String) e um código de aluno (Integer).
    //2. Implementar a classe criando os atributos necessários.
    //3. Criar um construtor para o aluno que tome como parâmetro um nome, um sobrenome e um código de aluno.
    //4. Um aluno será igual a outro se seus códigos de aluno forem iguais.

    private String nome;
    private String sobrenome;
    private Integer codAluno;


    //Construtor da Classe Aluno
    public Aluno() {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codAluno = codAluno;
    }

    //Equals da classe Aluno
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return nome.equals(aluno.nome) &&
                sobrenome.equals(aluno.sobrenome) &&
                codAluno.equals(aluno.codAluno);
    }


    @Override
    public String toString() {
        return nome + " " + sobrenome ;
    }

    //Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(Integer codAluno) {
        this.codAluno = codAluno;
    }
}
