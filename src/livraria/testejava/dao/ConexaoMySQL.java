/**
 * Classe para obtenção de conexão com o bando de dados
 * @author Paulo Sérgio Maia de Sousa
 * @version 1.0
 */
package livraria.testejava.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL
{
    private Connection con;
    
    private final String driver = "com.mysql.jdbc.Driver";  
    private final String url = "jdbc:mysql://localhost/livraria";       //Endereço do banco de dados
    private final String usuario = "root";                              //Usuário do Banco de dados
    private final String senha = "mydb";                                //senha de acesso ao Banco de Dados
    
    /**
     * Método para obter conexão com o Banco de Dados
     * @return Connection - Objeto referente à conexão estabelecida
     */
    public synchronized Connection getConnectionBD() {
        
        if(this.con != null) {
            return this.con;
        }
        else {
            try {
                Class.forName(this.driver);
                this.con = DriverManager.getConnection(this.url, this.usuario, this.senha);
            } 
            catch (SQLException e) {
                System.out.println("SQLException: " + e.getMessage());
                System.out.println("SQLState: " + e.getSQLState());
                System.out.println("VendorError: " + e.getErrorCode());
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            return this.con;
        }
    }    
}