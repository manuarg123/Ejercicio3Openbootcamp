/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author MANUEL RIVAS GAUNA
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    //Ejercicios tema 3 en OpenBootCamp 15/08/22
    public static void main(String[] args) {
        int suma;
        suma = sumar(5,8,9);
        System.out.println(suma);
        //Ejercicio 2
        Coche miCoche;
        miCoche = new Coche();
        
        System.out.println(miCoche.getPuertas()); //Cantidad de puertaas actual del vehiculo
        System.out.println(miCoche.sumarPuertas(2));// Suma y  Muestra las puertas
    }
    
    //Función primer ejercicio
    public static int sumar(int a, int b, int c){
        return a + b + c;
    }
    
}
