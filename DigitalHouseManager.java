package br.digitalhouse.entregavel;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DigitalHouseManager {

    private Map<Integer, Aluno> alunos = new HashMap<>();
    private Map<Integer, Professor> professores = new HashMap<>();
    private Map<Integer, Curso> cursos = new HashMap<>();
    private Map<Integer, Matricula> matriculas = new HashMap<>();


    //Criar um método na classe DigitalHouseManager que permita registrar um
    //curso. O método recebe como parâmetros o nome do curso, o código e a
    //quantidade máxima de alunos admitidos. O método deve criar um curso com
    //os dados correspondentes e adicioná-lo à lista de cursos.

    public void registrarCurso(String nomeCurso, Integer codCurso,Integer maxAlunos){
        Curso novoCurso = new Curso();
        novoCurso.setNomeCurso(nomeCurso);
        novoCurso.setCodCurso(codCurso);
        novoCurso.setMaxAlunos(maxAlunos);
        cursos.put(novoCurso.getCodCurso(), novoCurso);


        System.out.println("****************************** REGISTRO DE CURSO *********************************"
                + "\n" + "O Novo curso " + nomeCurso + " foi adicionado aos cursos da Digital House com sucesso" +
                "\n");
    }


    //Criar um método na classe DigitalHouseManager que permita excluir um
    //curso. O método recebe como parâmetro o código do curso. O método deve
    //utilizar o código do curso para encontrá-lo na lista de cursos e excluí-lo da
    //lista.
    public void excluirCurso(Integer codCurso){
        cursos.remove(cursos.get(codCurso));
        System.out.println("****************************** REMOVER DE CURSO *********************************"
                + "\n" + "O curso" + codCurso + " foi excluído d lista de cursos" + "\n");
    }

    //Criar um método na classe DigitalHouseManager que permita registrar um
    //professor adjunto. O método recebe como parâmetros o nome do professor,
    //o sobrenome, o código e a quantidade de horas disponíveis para monitoria. O
    //tempo de casa inicial do professor será zero. O método deve criar um
    //professor adjunto com os dados correspondentes e adicioná-lo à lista de
    //professores.
    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codProfessor, Integer horasDeMonitoria){
        Adjunto novoProfAdjunto = new Adjunto();
        novoProfAdjunto.setNome(nome);
        novoProfAdjunto.setSobrenome(sobrenome);
        novoProfAdjunto.setCodProfessor(codProfessor);
        novoProfAdjunto.setHorasMonitoria(horasDeMonitoria);
        novoProfAdjunto.setHorasMonitoria(0);

        professores.put(novoProfAdjunto.getCodProfessor(), novoProfAdjunto);

        System.out.println("****************************** REGISTRAR PROFESSOR ADJUNTO *********************************"
                + "\n" + "O professor Adjunto " + nome + " foi adicionado à lista de professores com sucesso" + "\n");
    }

    //Criar um método na classe DigitalHouseManager que permita registrar um
    //professor titular. O método recebe como parâmetros o nome do professor, o
    //sobrenome, o código e a especialidade. O tempo de casa inicial do professor
    //será zero. O método deve criar um professor titular com os dados
    //correspondentes e adicioná-lo à lista de professores.

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codProfessor, String especialidade){
        Titular novoProfTitular = new Titular();
        novoProfTitular.setNome(nome);
        novoProfTitular.setSobrenome(sobrenome);
        novoProfTitular.setCodProfessor(codProfessor);
        novoProfTitular.setEspecialidade(especialidade);
        novoProfTitular.setTempoDeCasa(0);

        professores.put(novoProfTitular.getCodProfessor(), novoProfTitular);

        System.out.println("****************************** REGISTRAR PROFESSOR TITULAR *********************************"
                + "\n" + "O professor Titular " + nome + " foi adicionado à lista de professores com sucesso" + "\n");
    }

    //Criar um método na classe DigitalHouseManager que permita excluir um
    //professor. O método recebe como parâmetro o código do professor. O
    //método deve utilizar o código do professor para encontrá-lo na lista de
    //professores e eliminá-lo da lista.

    public void excluirProfessor(Integer codProfessor){
        professores.remove(codProfessor);
        System.out.println("******************************REMOVER PROFESSOR *********************************"
                + "\n" + "O professor Titular " + codProfessor + " foi removido da lista de professores" + "\n");
    }

    //Criar um método na classe DigitalHouseManager que permita registrar um
    //aluno. O método recebe como parâmetros o nome, o sobrenome e o código
    //do aluno. O método deve criar um aluno com os dados correspondentes e
    //adicioná-lo à lista de alunos.
    public void registrarAluno(String nome, String sobrenome, Integer codAluno) {
        Aluno novoAluno = new Aluno();
        novoAluno.setNome(nome);
        novoAluno.setSobrenome(sobrenome);
        novoAluno.setCodAluno(codAluno);

        alunos.put(novoAluno.getCodAluno(),novoAluno);

        System.out.println("****************************** REGISTRO DE ALUNO *********************************"
                + "\n" + "O aluno " + nome + " foi matriculado com sucesso" + "\n");


    }

    //Criar um método na classe DigitalHouseManager que permita matricular um
    //aluno em um curso. O método recebe como parâmetros o código do aluno e
    //o código do curso em que ele está se matriculando.
    public void matricularAluno (Integer codAluno, Integer codCurso){
        Curso curso = cursos.get(codCurso);
        Aluno aluno = alunos.get(codAluno);
        Date data = new Date();

        if (curso.adicionarUmAluno(aluno)){
            Matricula novaMatricula = new Matricula(aluno, curso, data);
            matriculas.put(aluno.getCodAluno(), novaMatricula);
            System.out.println("O Aluno " + aluno.getNome() + " " + aluno.getSobrenome() +" foi matriculado no curso " + curso.getNomeCurso());
        }else {
            System.out.println("****************************** MATRICULAR ALUNO *********************************"
                    + "\n" + "Matricula não pode ser realizada, curso já está com as vagas esgotadas." + "\n");
        }

    }

    //Criar um método na classe DigitalHouseManager que permita alocar
    //professores a um curso. O método recebe como parâmetros o código do
    //curso, o código do professor titular e o código do professor adjunto

    public void alocarProfessor (Integer codCurso, Integer codProfessorTit, Integer codProfessorAdj){
        Curso curso = cursos.get(codCurso);
        Titular novoProfTitular = (Titular) getProfessores().get(codProfessorTit);
        Adjunto novoProfAdjunto = (Adjunto) getProfessores().get(codProfessorAdj);

        curso.setProfessorTitular(novoProfTitular);
        curso.setProfessorAdjunto(novoProfAdjunto);

        System.out.println("****************************** ALOCAR PROFESSOR *********************************"
                + "\n" +"Professor Titular "+novoProfTitular.getNome()+" e Professor Adjunto "+novoProfAdjunto.getNome() +" foram alocados no "+curso.toString()+" com sucesso." + "\n");
    }

    //Método de consulta de alunos
    public void consultarAluno (Integer codAluno){
        try {Matricula alunoMatriculado = getMatriculas().get(codAluno);
            System.out.println("****************************** CONSULTAR ALUNO MATRICULADO *********************************"
                    + "\n" + " O aluno " + alunoMatriculado.getAluno()+" está matriculado no curso  "+alunoMatriculado.getCurso());
            System.out.println("\n");

        } catch (Exception e){
            System.out.println("****************************** REGISTRO DE CURSO *********************************"
                    + "\n" + "Aluno não matriculado.");
            System.out.println("\n");
        }

    }


    public Map<Integer, Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Map<Integer, Aluno> alunos) {
        this.alunos = alunos;
    }

    public Map<Integer, Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(Map<Integer, Professor> professores) {
        this.professores = professores;
    }

    public Map<Integer, Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Map<Integer, Curso> cursos) {
        this.cursos = cursos;
    }

    public Map<Integer, Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(Map<Integer, Matricula> matriculas) {
        this.matriculas = matriculas;
    }
}
