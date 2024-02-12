package ControlarHorario.dao;

import ControlarHorario.conn.ConnectionMySql;
import ControlarHorario.model.ControlarHorario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;


public class GenericDAO {
    
    private Connection connection;
    ArrayList<ControlarHorario> lista = new ArrayList<>();
           
    
    public GenericDAO() {
        this.connection = ConnectionMySql.getConnection();
    }
    
    protected Connection getConnection() {
        return connection;
    }
    
    protected void save (String insertSql, Object... parametros) // Método responsável por fazer a conexão com o banco, juntas as informações
            throws SQLException {                                // e fazer a execução da query no Banco
        PreparedStatement pstmt = getConnection()
                .prepareStatement(insertSql);

        for (int i = 0; i < parametros.length; i++) {
            pstmt.setObject(i+1, parametros[i]);
        }

        pstmt.execute();
        pstmt.close();
        connection.close();
    }
    
    protected void update(String updateSql, Object id, Object... parametros) throws 
    SQLException {
        PreparedStatement pstmt = getConnection().prepareStatement(updateSql);
    
        for (int i = 0; i < parametros.length; i++) {
            pstmt.setObject(i + 1, parametros[i]);
        }
        
        pstmt.setObject(parametros.length + 1, id);
        pstmt.execute();
        pstmt.close();
        connection.close();
    
    }
    
    protected void delete(String deleteSql, Object id,Object... parametros) throws SQLException {
        PreparedStatement pstmt = getConnection().prepareStatement(deleteSql);
        
        for(int i = 0; i < parametros.length; i++) {
            pstmt.setObject(i + 1, parametros[i]);
        }
        
        pstmt.setObject(parametros.length + 1, id);
        pstmt.execute();
        pstmt.close();
        connection.close();
        
    }
    
}
