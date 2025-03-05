/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio6;

/**
 *
 * @author Samung
 */
public class AlhoBacon implements Pizza{
    
    @Override
    public void preparar(){
        System.out.println("molho, queijo, alho e bacon");
    }

    @Override
    public void assar() {
        System.out.println("20 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("R$20,00");
    }
    
    @Override
    public void borda() {
        System.out.println("borda de catupiry!");
    }
}
