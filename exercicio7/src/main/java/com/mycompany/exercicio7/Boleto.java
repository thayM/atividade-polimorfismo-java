/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio7;

/**
 *
 * @author Samung
 */
public class Boleto implements TipoPagamento{
    public void pagar(double valor){
        System.out.println("Pagamento em boleto. Taxa fixa de R$0,80");
    }
}
