/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elmaximofloates2;

import java.util.Scanner;

/**
 *
 * @author fravega
 */
public class ElMaximoFloatEs2 {
/**
 *
 * @author fravega
 */
 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float numeroA;
        numeroA=0;
        float maximoNum;
        maximoNum=0;
        float minimoNumero;
        minimoNumero=0;
      Scanner tec = new Scanner(System.in);
      for(int i=0; i<=4; i++){
      System.out.println("Ingrese cinco 5 numeros.....;"+numeroA);
      numeroA =tec.nextFloat();
          if(numeroA>maximoNum){
          maximoNum=numeroA;
          System.out.println("El número máximo es....;"+maximoNum);
      }else{
          
            if(numeroA<minimoNum){ 
                minimoNum=numeroA;
                System.out.println("El número mínimo es..."+minimoNum);
            }else{
            }
          }
        }   
      }
    }
    
}

