/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio4;

/**
 *
 * @author Samung
 */
public class Forno {
    public void fabricar(PizzaCalabresa calabresa){
        calabresa.preparar();
        calabresa.assar();
        calabresa.cobrar();
    }
    
    public void fabricar(PizzaNapolitana napolitana){
        napolitana.preparacao();
        napolitana.assamento();
        napolitana.valor();
    }
}
