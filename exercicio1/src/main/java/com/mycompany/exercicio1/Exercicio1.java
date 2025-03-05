/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio1;

/**
 *
 * @author Samung
 */
public class Exercicio1 {

    public static void main(String[] args) {
        
        // 1. Chamada do método normal
        Torcedor torcedor = new Torcedor();
        torcedor.torcer();
        
        // 2. Chamadas polimórficas
        torcedor = new Corinthians();
        torcedor.torcer();
        
        torcedor = new Palmeiras();
        torcedor.torcer();
        
        torcedor = new Santos();
        torcedor.torcer();
    }
}
