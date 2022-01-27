package com.program.Spring;

public class autor implements AutorLivro{
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public void ExibirAutor(){
        System.out.println(this.nome);
    }

}
