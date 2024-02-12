package ControlarHorario.dao;

import ControlarHorario.conn.ConnectionMySql;
import ControlarHorario.model.ControlarHorario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ProjetoDAO extends GenericDAO {

    Connection conn;
    
    public void salvar(ControlarHorario horario) throws SQLException { // Método que armazena o código sql e passa as informações para a classe Generica
        String insert = "INSERT INTO controledetempo.projeto "
                + "(nomeProjeto, descricao, dataInicial, "
                + "horarioInicial, dataFinal, horarioFinal, "
                + "horarioTotal)"
                + " VALUES (?,?,?,?,?,?,?);";
        save(insert,
                horario.getNomeProjeto(),
                horario.getDescricao(),
                horario.getDataInical(),
                horario.getHorarioInical(),
                horario.getDataFinal(),
                horario.getHorarioFinal(),
                horario.getHorarioTotal());
    }
    
    public ArrayList<ControlarHorario> listarTodos() {
        String sql = "SELECT * FROM projeto";
        ResultSet resultado;
        
        try {
            
            conn = ConnectionMySql.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            resultado = pstmt.executeQuery();
            
            while(resultado.next()) {
                ControlarHorario horario = new ControlarHorario();
                horario.setCodigo(resultado.getInt("codigo"));
                horario.setNomeProjeto(resultado.getString("nomeProjeto"));
                horario.setDescricao(resultado.getString("descricao"));
                horario.setDataInical(resultado.getDate("dataInicial"));
                horario.setHorarioInical(resultado.getTime("horarioInicial"));
                horario.setDataFinal(resultado.getDate("dataFinal"));
                horario.setHorarioFinal(resultado.getTime("horarioFinal"));
                horario.setHorarioTotal(resultado.getTime("horarioTotal"));
                
                lista.add(horario);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no select do Banco de Dados " + e);
        }
        
        return lista;
        
    }
    
    public ArrayList<ControlarHorario> listarTodosPesquisa(String pesquisa) { 
        String sql = "SELECT * FROM projeto WHERE nomeProjeto LIKE '%" + pesquisa + "%' ORDER BY codigo;";
        ResultSet resultado;
        
        try {
            
            conn = ConnectionMySql.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            resultado = pstmt.executeQuery();
            
            while(resultado.next()) {
                ControlarHorario horario = new ControlarHorario();
                horario.setCodigo(resultado.getInt("codigo"));
                horario.setNomeProjeto(resultado.getString("nomeProjeto"));
                horario.setDescricao(resultado.getString("descricao"));
                horario.setDataInical(resultado.getDate("dataInicial"));
                horario.setHorarioInical(resultado.getTime("horarioInicial"));
                horario.setDataFinal(resultado.getDate("dataFinal"));
                horario.setHorarioFinal(resultado.getTime("horarioFinal"));
                horario.setHorarioTotal(resultado.getTime("horarioTotal"));
                
                lista.add(horario);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no select do Banco de Dados " + e);
        }
        
        return lista;
        
    }
    
}
