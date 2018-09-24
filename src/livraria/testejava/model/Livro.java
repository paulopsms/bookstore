/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livraria.testejava.model;

import java.util.Date;

/**
 *
 * @author Paulo S
 */
public class Livro {
    
    /**
     * Id do livro
     */
    private int id;
    
    /**
     * Autor do livro
     */
    private String autor;
    
    /**
     * Nome do livro
     */
    private String nome;
    
    /**
     * Diretório da imagem do livro
     */
    private String imagem;
    
    /**
     * Ano de edição
     */
    private String ano;
    
    /**
     * Nota dos usuários
     */
    private int nota;
    
    /**
     * Resenha do livro
     */
    private String resenha;
    
    /**
     * Data de cadastro do livro
     */
    private String dataCadastro;

    public int getId(){
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getResenha() {
        return resenha;
    }

    public void setResenha(String resenha) {
        this.resenha = resenha;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String cadastro) {
        this.dataCadastro = cadastro;
    }
    
}
