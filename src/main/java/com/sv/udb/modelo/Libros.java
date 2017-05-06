/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.modelo;

/**
 *
 * @author Estudiante
 */
public class Libros {
    private int cddiLibr;
    private String nombLibr;
    private String autoLibr;
    private String geneLibr;
    private int anioLibr;
    private int estaLibr;

    @Override
    public String toString() {
        return this.nombLibr ;
    }

    public int getCddiLibr() {
        return cddiLibr;
    }

    public void setCddiLibr(int cddiLibr) {
        this.cddiLibr = cddiLibr;
    }

    public String getNombLibr() {
        return nombLibr;
    }

    public void setNombLibr(String nombLibr) {
        this.nombLibr = nombLibr;
    }

    public String getAutoLibr() {
        return autoLibr;
    }

    public void setAutoLibr(String autoLibr) {
        this.autoLibr = autoLibr;
    }

    public String getGeneLibr() {
        return geneLibr;
    }

    public void setGeneLibr(String geneLibr) {
        this.geneLibr = geneLibr;
    }

    public int getAnioLibr() {
        return anioLibr;
    }

    public void setAnioLibr(int anioLibr) {
        this.anioLibr = anioLibr;
    }

    public int getEstaLibr() {
        return estaLibr;
    }

    public void setEstaLibr(int estaLibr) {
        this.estaLibr = estaLibr;
    }

    public Libros(int cddiLibr, String nombLibr, String autoLibr, String geneLibr, int anioLibr, int estaLibr) {
        this.cddiLibr = cddiLibr;
        this.nombLibr = nombLibr;
        this.autoLibr = autoLibr;
        this.geneLibr = geneLibr;
        this.anioLibr = anioLibr;
        this.estaLibr = estaLibr;
    }

    public Libros() {
    }
}
