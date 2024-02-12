/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlarHorario.controller;

import ControlarHorario.dao.ProjetoDAO;
import ControlarHorario.model.ControlarHorario;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Gustavo Mendes
 */
public class ControlarHorarioController {
    
    private int codigo;
    private String nomeProjeto;
    private String descricao;
    private String dataInical;
    private String horarioInical;
    private String dataFinal;
    private String horarioFinal;
    private String horarioTotal;
    
    private Date formatarData(String data) throws ParseException { // Método responsável por modificar a nosa data "dd/MM/yyyy" para a data americana
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); // que é aceita nos Bancos de Dados, "yyyy/MM/dd"
        return new Date(formatter.parse(data).getTime());
    }
    
    private Time formatarTime(String time) throws ParseException { // Método responsável por formatar o tempo de String para Time
        return java.sql.Time.valueOf(time);    
    }
    
    public void salvar( // Método responsável por pegar as informações, criar um objeto modelo e modificar as informações de acordo com o necessário
            String nomeProjeto,
            String descricao,
            String dataInicial,
            String horarioInicial,
            String dataFinal,
            String horarioFinal,
            String horarioTotal)
            throws SQLException, ParseException {
        ControlarHorario horario = new ControlarHorario();
        horario.setNomeProjeto(nomeProjeto);
        horario.setDescricao(descricao);
        horario.setDataInical(formatarData(dataInicial));
        horario.setHorarioInical(formatarTime(horarioInicial));
        horario.setDataFinal(formatarData(dataFinal));
        horario.setHorarioFinal(formatarTime(horarioFinal));
        horario.setHorarioTotal(formatarTime(horarioTotal));
        new ProjetoDAO().salvar(horario); // Passando o objeto para o método no qual armazena o código sql
    }
    
    
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nomeProjeto
     */
    public String getNomeProjeto() {
        return nomeProjeto;
    }

    /**
     * @param nomeProjeto the nomeProjeto to set
     */
    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the dataInical
     */
    public String getDataInical() {
        return dataInical;
    }

    /**
     * @param dataInical the dataInical to set
     */
    public void setDataInical(String dataInical) {
        this.dataInical = dataInical;
    }

    /**
     * @return the horarioInical
     */
    public String getHorarioInical() {
        return horarioInical;
    }

    /**
     * @param horarioInical the horarioInical to set
     */
    public void setHorarioInical(String horarioInical) {
        this.horarioInical = horarioInical;
    }

    /**
     * @return the dataFinal
     */
    public String getDataFinal() {
        return dataFinal;
    }

    /**
     * @param dataFinal the dataFinal to set
     */
    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    /**
     * @return the horarioFinal
     */
    public String getHorarioFinal() {
        return horarioFinal;
    }

    /**
     * @param horarioFinal the horarioFinal to set
     */
    public void setHorarioFinal(String horarioFinal) {
        this.horarioFinal = horarioFinal;
    }

    /**
     * @return the horarioTotal
     */
    public String getHorarioTotal() {
        return horarioTotal;
    }

    /**
     * @param horarioTotal the horarioTotal to set
     */
    public void setHorarioTotal(String horarioTotal) {
        this.horarioTotal = horarioTotal;
    }
    
    
    
}
