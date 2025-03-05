/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio4;

/**
 *
 * @author Samung
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Forno forno = new Forno();
        PizzaCalabresa calabresa = new PizzaCalabresa();
        
        forno.fabricar(calabresa);
        
        PizzaNapolitana napolitana = new PizzaNapolitana();
        forno.fabricar(napolitana);
    }
}
