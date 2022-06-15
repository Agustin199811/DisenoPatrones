/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author Agustin
 */
public class CajaDolares {

    private double dolares = 0;

    public CajaDolares() {
    }

    public double getDolares() {
        return dolares;
    }

    public void setDolares(double dolares) {
        this.dolares = dolares;
    }

    public void sacarDolares(double dolares) {
        this.dolares -= dolares;
    }
    public  void ingresoDolares(double dolares){
        this.dolares += dolares;
    }

    }
