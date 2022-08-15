package javaapplication1;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MANUEL RIVAS GAUNA
 */
public class Coche {
    private int puertas;
    
    public Coche(){
        puertas = 4;
    }
    
     public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    public int sumarPuertas(int a){
        return puertas + a;
    }
    
}

