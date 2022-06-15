/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateMethod;

/**
 *
 * @author Agustin
 */
public class Principal {
    public static void main(String[] args) {
        Persona persona = new Cliente(121121);
        System.out.println("El cliente: ");
        System.out.println(persona.indentificate());
        
        System.out.println("El empleado: ");
        persona = new Empleado("Nro 112");
        System.out.println(persona.indentificate());
    }
}
