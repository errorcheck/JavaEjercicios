/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elmaxyminsueldo;

import java.util.Scanner;

/**
 *
 * @author fravega
 */
public class ElMaxYMinSueldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float sueldo;
        sueldo=0;
        float maximoSueldo;
        maximoSueldo=0;
        float minimoSueldo=0;
        minimoSueldo=0;
      Scanner tec = new Scanner(System.in);
      for(int i=0; i<=4; i++){
      System.out.println("Ingrese cinco 5 sueldos.....:");
      
      sueldo =tec.nextInt();
      
      if(sueldo>maximoSueldo){
          maximoSueldo=sueldo;
          
      }else{
      if(sueldo<minimoSueldo) {
          minimoSueldo=sueldo;
          }
        }
      }
   System.out.println("El sueldo máximo es....;"+maximoSueldo);
   System.out.println("El sueldo mínimo es....;"+minimoSueldo);
    }
 }

