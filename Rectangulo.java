
package programacionii_semanavii;

/**
 *
 * @author Gianina
 */
public class Rectangulo extends Figura {
    
    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    
    
    @Override
    public void calcularArea(){
        System.out.println("El área del " + nombre+ " es de: " + (base * altura));
    }
}
