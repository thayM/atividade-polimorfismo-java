/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio6;

/**
 *
 * @author Samung
 */
public class Exercicio6 {

    public static void main(String[] args) {
        Forno forno = new Forno();
        
        Calabresa calabresa = new Calabresa();
        Napolitana napolitana = new Napolitana();
        AlhoBacon alhoBacon = new AlhoBacon();
        
        forno.fabricar(calabresa);
        forno.fabricar(napolitana);
        forno.fabricar(alhoBacon);
    }
}
