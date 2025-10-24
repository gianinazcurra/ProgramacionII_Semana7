/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionii_semanavii;

/**
 *
 * @author Gianina
 */
public class Ejercicio2_Main {
    
    public static void main(String[] args) {
        
        Figura figura1 = new Circulo(2.5,"círculo");
        Figura figura2 = new Rectangulo (5.5,4,"rectángulo");
        
        figura1.calcularArea();
        figura2.calcularArea();
        
    }
}
