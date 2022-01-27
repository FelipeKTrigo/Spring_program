package com.program.Spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Livro implements AutorLivro{
    private String nome;
    private String codigo;

    @Autowired
    AutorLivro autorLivro;


    public void exibir(){
        System.out.println(this.nome + " - " + this.codigo);
    }

    public String getNome() {
        return nome;
    }

    public AutorLivro getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(AutorLivro autorLivro) {
        this.autorLivro = autorLivro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public void ExibirAutor() {
        System.out.println();
    }

}
