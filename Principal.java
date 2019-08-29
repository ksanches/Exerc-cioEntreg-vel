package br.digitalhouse.entregavel;

public class Principal {
    public static void main(String[] args) {

        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();

        digitalHouseManager.registrarProfessorTitular("Ana Carolina","Carvalho",124,"Android");
        digitalHouseManager.registrarProfessorTitular("Roberto","Pereira",150,"Analytics");

        digitalHouseManager.registrarProfessorAdjunto("Tamara", "Andrade",675,30);
        digitalHouseManager.registrarProfessorAdjunto("Amanda","Gomes",988,35);

        digitalHouseManager.registrarCurso("Data Analytics",4098,8);
        digitalHouseManager.registrarCurso("Mobile Android",7764,2);

        digitalHouseManager.alocarProfessor(4098,150,988);
        digitalHouseManager.alocarProfessor(7764,124,675);

        digitalHouseManager.registrarAluno("Katheryne","Ferreira",8789);
        digitalHouseManager.registrarAluno("Andrezza","Bragança",5887);
        digitalHouseManager.registrarAluno("Antinio","Silva",7901);
        digitalHouseManager.registrarAluno("Leandro","Souza",5677);
        digitalHouseManager.registrarAluno("Nathalia","Branco",6712);


        digitalHouseManager.matricularAluno(8789,7764);
        digitalHouseManager.matricularAluno(5887,4098);

        digitalHouseManager.matricularAluno(7901,7764);
        digitalHouseManager.matricularAluno(5677,7764);
        digitalHouseManager.matricularAluno(6712,4098);

        digitalHouseManager.consultarAluno(8789);
        digitalHouseManager.consultarAluno(6712);


    }
}
