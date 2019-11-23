/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administraciondeempresa;

import java.util.Scanner;

/**
 *
 * @author fravega
 */
public class AdministracionDeEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Puesto p1 = new Puesto(1),"Operario");
        Puesto p2 = new Puesto(2,"Tecnico");
        Puesto p3 = new Puesto(3,"Direccion");
        
        Scanner s = new Scanner (System.in);
        System.out.println("Ingrese una calle");
        String calle = s;
        
        
            
        Direccion d1= new Direccion ("Florencio Varela", 1900, "La Matanza", "Buenos Aires");
        
        Empleado //
        
        Sector miSector = new Sector (1,"mantenimiento");
        
        miSector.agregarEmpleado(capo);
        miSector.agregarempleado(e2);
        miSector.agregarEmpleado(e3);
        
        
        
        
        
        
        
        
        
    }
    
}
