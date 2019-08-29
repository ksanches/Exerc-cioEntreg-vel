package br.digitalhouse.entregavel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso  {

    //1. Criar um diagrama de classes que modele a classe Curso. A princípio, umcurso possui um nome (String) e um código de curso (Integer).
    //2. Implementar a classe criando os atributos necessários.
    //3. Criar os getters e setters para os atributos anteriores.
    //4. Um curso será igual a outro se seus códigos de curso forem iguais
    //Além de ter um nome e código de curso, um curso possui um professor titular (ProfessorTitular), um professor adjunto (ProfessorAdjunto),
    // uma quantidade máxima de alunos (Integer) e uma lista de alunos matriculados (List<Aluno>).

    private String nomeCurso;
    private Integer codCurso;
    private Titular professorTitular;
    private Adjunto professorAdjunto;
    private Integer maxAlunos;
    private List <Aluno> alunos = new ArrayList<>();


// Criar um método na classe Curso que permita adicionar um aluno à lista. O método retornará true se o aluno puder ser adicionado ou false caso não
//haja vagas disponíveis

     public Boolean adicionarUmAluno (Aluno umAluno) {
         if (alunos.size() < maxAlunos) {
             alunos.add(umAluno);
             return true;
         } else {
             System.out.println("Não foi possível adicionar o aluno " + umAluno.toString() + "ao curso pois a turma já atingiu a sua capacidade máxima de alunos");
             return false;
         }
     }


 //Criar um método na classe Curso que permita excluir um aluno da lista de alunos do curso.
    public void excluirAluno(Aluno umAluno){
         try {alunos.remove(umAluno);
             System.out.println("O aluno" + umAluno + "foi removido da lista de alunos");
         } catch (Exception e ) {
             System.out.println("Não foi possível remover o aluno : " + umAluno + " do curso.");
         }
    }


    @Override
    public String toString() {
        return "Curso" + nomeCurso ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return codCurso.equals(curso.codCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codCurso);
    }

    public Professor getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(Titular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public Professor getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(Adjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public Integer getMaxAlunos() {
        return maxAlunos;
    }

    public void setMaxAlunos(Integer maxAlunos) {
        this.maxAlunos = maxAlunos;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Integer getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(Integer codCurso) {
        this.codCurso = codCurso;
    }
}
