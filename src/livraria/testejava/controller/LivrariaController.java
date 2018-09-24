package livraria.testejava.controller;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import livraria.testejava.dao.LivroDAO;
import livraria.testejava.model.Livro;

/**
 * Classe intermediária para controlar o acesso à base de dados
 * @author Paulo S
 * @version 1.0
 */
public class LivrariaController {
    
    /**
     * Método de controle para cadastro de livros
     * @param nome - nome do livro
     * @param autor - autor do livro
     * @param img - diretório da imagem do livro
     * @param ano - ano de lançamento do livro
     * @param nota - nota dos usuários
     * @param resenha - resenha do livro
     * @param dataCad - data de cadastro do livro
     * @throws SQLException 
     */
    public void salvar(String nome, String autor, String img, String ano, int nota, String resenha, String dataCad) throws SQLException {
        Livro livro = new Livro();
        livro.setNome(nome);
        livro.setAutor(autor);
        livro.setImagem(img);
        livro.setAno(ano);
        livro.setNota(nota);
        livro.setResenha(resenha);
        livro.setDataCadastro(dataCad);
        
        new LivroDAO().cadastrarLivroDAO(livro);
    }
    
    /**
     * Método de controle para alteração dos dados de um livros
     * @param id - identificador do livro
     * @param nome - nome do livro
     * @param autor - autor do livro
     * @param img - diretório da imagem do livro
     * @param ano - ano de lançamento do livro
     * @param nota - nota dos usuários
     * @param resenha - resenha do livro
     * @param dataCad - data de cadastro do livro
     * @throws SQLException 
     */
    public void alterar(int id, String nome, String autor, String img, String ano, int nota, String resenha, String dataCad) throws SQLException {
        Livro livro = new Livro();
        livro.setId(id);
        livro.setNome(nome);
        livro.setAutor(autor);
        livro.setImagem(img);
        livro.setAno(ano);
        livro.setNota(nota);
        livro.setResenha(resenha);
        livro.setDataCadastro(dataCad);
        
        new LivroDAO().atualizarLivroDAO(livro);
    }
    
    /**
     * Método de controle para buscar a lista dos livros cadastrados
     * @return List - Lista de livros cadastrados
     */
    public List listarLivros() {
        LivroDAO livdao = new LivroDAO();
        try {
            return livdao.listarLivros();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    /**
     * Método de controle para exclusão de um livro
     * @param id - Identificador do livro
     * @throws SQLException 
     */
    public void excluirLivro(int id) throws SQLException {
        new LivroDAO().excluirLivroDAO(id);
    }
}
