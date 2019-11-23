/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elmaximofloates2;

import java.util.Scanner;

/**
 *
 * @author Sonia
 */
public class ElAcumSueldoEs {
/**
 *
 * @author Sonia
 */
 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float sueldo;
        sueldo=0;
        float totSueldo;
        totSueldo=0;
        float minSueldo;
        minSueldo=0;
        Scanner tec = new Scanner(System.in);
      for(int i=0; i<=4; i++){
        System.out.println("Ingrese cinco 5 sueldos.....;"+sueldo);
        sueldo =tec.nextFloat();
          if(sueldo>10000){
          totSueldo=totSueldo+sueldo;
          System.out.println("El sueldo acumulado es....;"+totSueldo);
      }else{
          
            if(sueldo<totSueldo){ 
                sueldo=minSueldo;
                System.out.println("El número mínimo es..."+minSueldo);
            }else{
            }
          }
        }   
      }
    }
    


