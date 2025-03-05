/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio5;

/**
 *
 * @author Samung
 */
public class Forno {
    public void fabricar(Pizza pizza){
    // pizza é uma referência POLIMÓRFICA
    // objeto variável e dinâmico 
    pizza.preparar();
    pizza.assar();
    pizza.cobrar();
    }
}
