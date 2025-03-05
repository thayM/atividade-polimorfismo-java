/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio8;

/**
 *
 * @author Samung
 */
public class RetiradaLoja implements TipoEntrega{
    @Override
    public void entrega(double frete) {
        System.out.println("Entrega tipo retirada na loja. Não tem frete!");
    }
}
