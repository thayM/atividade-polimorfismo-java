/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio7;

/**
 *
 * @author Samung
 */
public class Exercicio7 {

    public static void main(String[] args) {
        Venda venda = new Venda();
        
        Dinheiro dinheiro = new Dinheiro();
        CartaoCredito cartaoCredito = new CartaoCredito();
        Boleto boleto = new Boleto();
        
        venda.vender(dinheiro, 100);
        venda.vender(cartaoCredito, 100);
        venda.vender(boleto, 100);
    }
}
