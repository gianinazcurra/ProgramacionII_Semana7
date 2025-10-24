
package programacionii_semanavii;

import java.util.ArrayList;

/**
 *
 * @author Gianina
 */
public class Ejercicio2_Main {
    
    public static void main(String[] args) {
        
        //Array vacío de figuras
        ArrayList<Figura> figuras = new ArrayList<>();
        
        //Crep e instancio figuras distinas
        Rectangulo rectangulo1 = new Rectangulo (5.5,4,"rectángulo");
        Rectangulo rectangulo2 = new Rectangulo (3.6,6,"rectángulo");
        Circulo circulo1 = new Circulo (5.5,"círculo");
        Circulo circulo2 = new Circulo (2,"círculo");
        
        //Las agrego al array
        figuras.add(rectangulo1);
        figuras.add(rectangulo2);
        figuras.add(circulo1);
        figuras.add(circulo2);
        
        //recorro la colección para calcular el área de cada una de ellas
        for(Figura f : figuras){
        f.calcularArea();
}
}
    }
