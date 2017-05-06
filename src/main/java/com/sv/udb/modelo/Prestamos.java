/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.modelo;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Estudiante
 */
public class Prestamos implements Serializable {
    private int codi;
    private int codiLibr;
    private String nombLibr;
    private int codiUsua;
    private String nombUsua;
    private Date fechaPres;
    private Date fechaDevo;

    public Prestamos(int codi, int codiLibr, String nombLibr, int codiUsua, String nombUsua, Date fechaPres, Date fechaDevo) {
        this.codi = codi;
        this.codiLibr = codiLibr;
        this.nombLibr = nombLibr;
        this.codiUsua = codiUsua;
        this.nombUsua = nombUsua;
        this.fechaPres = fechaPres;
        this.fechaDevo = fechaDevo;
    }


    @Override
    public String toString() {
        return this.nombLibr;
    }

    public String getNombLibr() {
        return nombLibr;
    }

    public void setNombLibr(String nombLibr) {
        this.nombLibr = nombLibr;
    }

    public String getNombUsua() {
        return nombUsua;
    }

    public void setNombUsua(String nombUsua) {
        this.nombUsua = nombUsua;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public int getCodiLibr() {
        return codiLibr;
    }

    public void setCodiLibr(int codiLibr) {
        this.codiLibr = codiLibr;
    }

    public int getCodiUsua() {
        return codiUsua;
    }

    public void setCodiUsua(int codiUsua) {
        this.codiUsua = codiUsua;
    }

    public Date getFechaPres() {
        return fechaPres;
    }

    public void setFechaPres(Date fechaPres) {
        this.fechaPres = fechaPres;
    }

    public Date getFechaDevo() {
        return fechaDevo;
    }

    public void setFechaDevo(Date fechaDevo) {
        this.fechaDevo = fechaDevo;
    }

    public Prestamos(int codi, int codiLibr, int codiUsua, Date fechaPres, Date fechaDevo) {
        this.codi = codi;
        this.codiLibr = codiLibr;
        this.codiUsua = codiUsua;
        this.fechaPres = fechaPres;
        this.fechaDevo = fechaDevo;
    }

    public Prestamos() {
    }
}
