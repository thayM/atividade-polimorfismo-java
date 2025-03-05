/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio7;

/**
 *
 * @author Samung
 */
public class Dinheiro implements TipoPagamento{
    public void pagar(double valor){
        System.out.println("Pagamento em dinheiro. Não tem taxa!");
    }
}
