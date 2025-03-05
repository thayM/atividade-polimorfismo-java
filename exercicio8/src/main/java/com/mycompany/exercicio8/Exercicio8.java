/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio8;

/**
 *
 * @author Samung
 */
public class Exercicio8 {

    public static void main(String[] args) {
        Envio envio = new Envio();
        
        Correios correios = new Correios();
        RetiradaLoja retiradaLoja = new RetiradaLoja();
        Transportadora transportadora = new Transportadora();
        
        envio.enviar(correios, 20);
        envio.enviar(retiradaLoja, 0);
        envio.enviar(transportadora, 15);
    }
}
