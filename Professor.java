package br.digitalhouse.entregavel;

import java.util.Objects;

    //1. Criar um diagrama de classes que modele a classe Professor. A princípio,um professor possui um nome (String), um sobrenome (String), um tempo de casa (Integer) e um código de professor (Integer).
    //2. Implementar a classe criando os atributos necessários.
    //3. Criar os getters e setters para os atributos anteriores.
    //4. Um professor será igual a outro se seus códigos de professor forem iguais

    public class Professor {
        private String nome;
        private String sobrenome;
        private Integer tempoDeCasa;
        private Integer codProfessor;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Professor professor = (Professor) o;
            return codProfessor.equals(professor.codProfessor);
        }

        @Override
        public int hashCode() {
            return Objects.hash(codProfessor);
        }

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

        public Integer getTempoDeCasa() {
            return tempoDeCasa;
        }

        public void setTempoDeCasa(Integer tempoDeCasa) {
            this.tempoDeCasa = tempoDeCasa;
        }

        public Integer getCodProfessor() {
            return codProfessor;
        }

        public void setCodProfessor(Integer codProfessor) {
            this.codProfessor = codProfessor;
        }
    }

