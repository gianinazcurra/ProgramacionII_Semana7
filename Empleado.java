/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionii_semanavii;

/**
 *
 * @author Gianina
 */
public abstract class Empleado {
    
    public double calcularSueldo(Empleado e){
        if(e instanceof EmpleadoPlanta){
        return 100000;
        }else if(e instanceof EmpleadoTemporal){
        return 50000;
        }else{
                return 0;
    }
    }
}
