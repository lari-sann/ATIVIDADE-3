package com.example.atividade3.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CanditatoVaga {
    private String nome;
    private String idioma;
    private LocalDate dataNascimento;
    private String[] habilidades;
    private DateTimeFormatter formatter;

    public CanditatoVaga(){
        //formatter
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        //validações do nome
        //o ideal seria colocar todas as validações em um lugar
        if (nome.equals("") || nome.length() < 2) {
            throw new RuntimeException("O campo nome não está devidademte preenchido.");
        }
        this.nome = nome;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        //this.dataNascimento = LocalDate.parse(dataNascimento, formatter);
    }
    public String[] getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
    }
}
