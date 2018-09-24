package livraria.testejava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Classe DAO genérica
 * @author Paulo S
 * @version 1.0
 */
public abstract class DAO extends ConexaoMySQL {
    private Connection conexao;
    
    protected DAO() {
        this.conexao = getConnectionBD();
    }
    
    protected Connection getConexao() {
        return this.conexao;
    }
    /**
     * Método genérico de 'INSERT' no Banco de Dados
     * @param sql - string de comando SQL
     * @param parametros - Lista de parametros para execução do SQL
     * @throws SQLException 
     */
    protected void salvar(String sql, Object... parametros) throws SQLException {
        PreparedStatement stmt = getConexao().prepareStatement(sql);
        
        for (int i = 0; i < parametros.length; i++) {
            stmt.setObject(i+1, parametros[i]);
        }
        
        stmt.execute();
        stmt.close();
        conexao.close();
    }
    
    /**
     * Método genérico de 'UPDATE' no Banco de Dados
     * @param sql - String SQL a ser executada
     * @param id - ID do livro que será alterado
     * @param parametros - Lista de parametros para execução do SQL
     * @throws SQLException 
     */
    protected void alterar(String sql, int id, Object... parametros) throws SQLException {
        PreparedStatement stmt = getConexao().prepareStatement(sql);
        
        for (int i = 0; i < parametros.length; i++) {
            stmt.setObject(i+1, parametros[i]);
        }
        
        stmt.setObject(parametros.length + 1, id);
        
        stmt.execute();
        stmt.close();
        conexao.close();
    }
    
    /**
     * Método genérico de 'DELETE' no Banco de Dados
     * @param sql - String SQL a ser executada
     * @param parametros - Lista de parametros para execução do SQL
     * @throws SQLException 
     */
    protected void excluir(String sql, Object... parametros) throws SQLException {
        PreparedStatement stmt = getConexao().prepareStatement(sql);
        
        for (int i = 0; i < parametros.length; i++) {
            stmt.setObject(i+1, parametros[i]);
        }
        
        stmt.execute();
        stmt.close();
        conexao.close();
    }
}
