/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade8;

import java.util.Scanner;

/**
 *
 * Faça a um programa que compute quantos sao os multiplos de 2, de 3 e de 5 entre ´
1 e 1000.

 */
public class Atividade8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
       
      
        for (int i = 1; i < 1000; i=i + 1) {      
       
            if ((i % 2)==0)
            System.out.println("de 2: "+i);
      
           }
        
         for (int j = 1; j < 1000; j=j + 1) {      
       
        
           
            if ((j % 3)==0)
            System.out.println("de 3: "+j);
      
                 
           }
          for (int x = 1; x < 1000; x=x+1 ) {      
       
        
           if ((x % 5)==0)
            System.out.println("de 5: "+x);
      
           }
      
           }
        
        
    }
    
}
