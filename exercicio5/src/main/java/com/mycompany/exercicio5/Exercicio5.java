/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio5;

/**
 *
 * @author Samung
 */
public class Exercicio5 {

    public static void main(String[] args) {
        Forno forno = new Forno();
        
        Calabresa calabresa = new Calabresa();
        Napolitana napolitana = new Napolitana();
        
        forno.fabricar(calabresa);
        forno.fabricar(napolitana);
    }
}
