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
public class Principal {
   public static void main(String[] args) {
       Covertidor convertidor = new Covertidor();
       
       convertidor.ingresoPesetas(1000);
       convertidor.ingresoPesetas(2000);
       convertidor.ingresoPesetas(5000);
     
       
       System.out.println("Total en dolares :"+convertidor.getDolares());
   }
 
}
