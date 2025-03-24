package com.example.aula04;

public class Aluno {
   private String nome;
   private String matricula;
   private String status;


    public Aluno(String nome, String matricula, String status) {
        this.nome = nome;
        this.matricula = matricula;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getStatus() {
        return status;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
