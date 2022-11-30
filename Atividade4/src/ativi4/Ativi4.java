/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativi4;

import java.util.Scanner;

/**
 *
 * Desenvolva um algoritmo capaz de calcular o resultado da seguinte expressao aritm ˜ etica, ´
sendo n um valor informado pelo usuario: ´
Sn = 11 + 22 + 33
... + n
n
 */
public class Ativi4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner sc = new Scanner (System.in);
         
         int n=0,z=1;
         int tota3=0;
         int receber;

         
         System.out.println("Digite n");
         n =sc.nextInt();
 
          while(z <= n){ 
        
           tota3 =(int) (Math.pow(z,z));
           
         receber =+ tota3;
           
           z++;

         
          System.out.println("n = "+z+" + " +z+ "= "+ receber );
         
        }


 
    }
    
}
