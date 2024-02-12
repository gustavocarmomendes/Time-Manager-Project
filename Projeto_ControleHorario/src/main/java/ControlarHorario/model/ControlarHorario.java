/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlarHorario.model;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Gustavo Mendes
 */
public class ControlarHorario {
    
    private int codigo;
    private String nomeProjeto;
    private String descricao;
    private Date dataInical;
    private Time horarioInical;
    private Date dataFinal;
    private Time horarioFinal;
    private Time horarioTotal;

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
    public Date getDataInical() {
        return dataInical;
    }

    /**
     * @param dataInical the dataInical to set
     */
    public void setDataInical(Date dataInical) {
        this.dataInical = dataInical;
    }

    /**
     * @return the horarioInical
     */
    public Time getHorarioInical() {
        return horarioInical;
    }

    /**
     * @param horarioInical the horarioInical to set
     */
    public void setHorarioInical(Time horarioInical) {
        this.horarioInical = horarioInical;
    }

    /**
     * @return the dataFinal
     */
    public Date getDataFinal() {
        return dataFinal;
    }

    /**
     * @param dataFinal the dataFinal to set
     */
    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    /**
     * @return the horarioFinal
     */
    public Time getHorarioFinal() {
        return horarioFinal;
    }

    /**
     * @param horarioFinal the horarioFinal to set
     */
    public void setHorarioFinal(Time horarioFinal) {
        this.horarioFinal = horarioFinal;
    }

    /**
     * @return the horarioTotal
     */
    public Time getHorarioTotal() {
        return horarioTotal;
    }

    /**
     * @param horarioTotal the horarioTotal to set
     */
    public void setHorarioTotal(Time horarioTotal) {
        this.horarioTotal = horarioTotal;
    }


}
