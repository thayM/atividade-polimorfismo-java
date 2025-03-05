/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio8;

/**
 *
 * @author Samung
 */
public class Transportadora implements TipoEntrega{
    @Override
    public void entrega(double frete) {
        System.out.println("Entrega tipo transportadora. Frete é R$" + frete);
    }
}
