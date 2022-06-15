/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Agustin
 */
public final class Singleton {
    private static Singleton INSTANCE = null;
    private int hora, minuto, segundo, dia;
    private Singleton(){
        Calendar calendario = new GregorianCalendar();
        dia= calendario.get(Calendar.DAY_OF_MONTH);
        hora= calendario.get(Calendar.HOUR_OF_DAY);
        minuto = calendario.get(Calendar.MINUTE);
        segundo = calendario.get(Calendar.SECOND);
        
    }
    
    public static Singleton getSingleton(){
        if(INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    @Override
    public String toString() {
        return "Dia: "+dia+ " Hora: "+hora+" Minuto: "+minuto+" Segundos: "+segundo;
    }
    
 }
