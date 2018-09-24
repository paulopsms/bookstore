package livraria.testejava.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import livraria.testejava.model.Livro;

/**
 * Classe para inserção, atualização e exclusão de livros no Banco de Dados
 * @version 1.0
 * @author Paulo S
 */

public class LivroDAO extends DAO {
    
    /**
     * Método para inserção (INSERT) de um novo livro no banco de dados
     * @param livro - objeto livro contendo dados a serem inseridos na tabela
     * @throws SQLException 
     */
    public void cadastrarLivroDAO(Livro livro) throws SQLException {

        String sql = "INSERT INTO livro(nome, autor, imagem, ano, nota, resenha, cadastro) VALUES (?,?,?,?,?,?,?)";
        salvar(sql, livro.getNome(), livro.getAutor(), livro.getImagem(), livro.getAno(), livro.getNota(), livro.getResenha(), livro.getDataCadastro());
    }
    
    /**
     * Método para atualização (UPDATE) de dados de um novo livro no banco de dados
     * @param livro - Objeto livro com dados alterados
     * @throws SQLException 
     */
    public void atualizarLivroDAO(Livro livro) throws SQLException {
        String sql = "UPDATE livro SET nome = ?, autor = ?, imagem = ?, ano = ?, nota = ?, resenha = ? "
                    + "WHERE id = ?";
        alterar(sql, livro.getId(), livro.getNome(), livro.getAutor(), livro.getImagem(), livro.getAno(), livro.getNota(), livro.getResenha());
    }
    
    /**
     * Método para exclusão (DELETE) de um novo livro no banco de dados
     * @param id  - ID do livro que será excluído
     * @throws SQLException 
     */
    public void excluirLivroDAO(int id) throws SQLException {
        String sql = "DELETE FROM livro WHERE id = ?";
        excluir(sql, id);
    }
    
    /**
     * Método para buscar (SELECT) todos os livros cadastrados no Bando de Dados
     * @return List - lista de livros cadastrados
     * @throws SQLException 
     */
    public List listarLivros() throws SQLException {
        List livros = new ArrayList();

        String sql = "SELECT * FROM livro order by nome asc";
        PreparedStatement stmt = getConexao().prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next()) {
            Livro livro = new Livro();
            livro.setId(rs.getInt("id"));
            livro.setNome(rs.getString("nome"));
            livro.setAutor(rs.getString("autor"));
            livro.setImagem(rs.getString("imagem"));
            livro.setAno(rs.getString("ano"));
            livro.setNota(rs.getInt("nota"));
            livro.setResenha(rs.getString("resenha"));
            livro.setDataCadastro(rs.getString("cadastro"));
            livros.add(livro);
        }
        
        stmt.close();
        rs.close();
        getConexao().close();
        
        return livros;
    }
}
