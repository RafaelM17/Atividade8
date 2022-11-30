/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativi2;

import java.util.Scanner;

/**
 *
 * Voce está programando um novo Tinder. . . (hhuummm)... e voc  ́ e tem tres quesitos que voce
pode dar notas de 0 a 10: Altura, Beleza e Carisma. Daı voce, por estar um tempinho sem...

“amor”, colocou a sua lógica da seguinte forma:  ́

• Se a pessoa tiver mais de 7 em todos os quesitos, imprima: “Booooraa”;

• Se a pessoa tiver mais de 7 em pelo menos 2 quesitos, imprima: “so vai. . . ”  ́

• Se a pessoa tiver mais de 7 em so 1 quesito, imprima: “F  ́ e em Deus. . . ”  ́

• Seeeee num atender a nenhum. . . , imprima:”Misericordia”  ́

Teste TODAS as possibilidades
 */
public class Ativi2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner ( System.in);
        
        int altura;
        int beleza;
        int carisma;
        
        System.out.println("Qual nota voce dar em beleza");
        beleza = sc.nextInt();
        System.out.println("Qual nota voce dar em altura");
        altura = sc.nextInt();
        System.out.println("Qual nota voce dar em carisma");
        carisma = sc.nextInt();
        
        if(beleza >= 7 && beleza <= 10 &&  altura >= 7 && altura <=10 &&  carisma >= 7 && carisma <=10 ) {
            
            System.out.println("Boooraa");
        
    }
        // beleza 1
        else if (beleza >= 7 && altura >=7 && altura <=10 && carisma < 7 )
         {

                    System.out.println(" carisma 1 -so vai");
                    
                 
        
         }
        else if(beleza >= 7 && beleza <= 10 && altura <7 && carisma >= 7 && carisma <= 10)
         {
                System.out.println(" 2");
           
                    System.out.println("altura 2 - so vai");
                    
                 
        
         }
         else if( beleza <7 &&  altura >= 7 && altura <= 10 && carisma >= 7 && carisma <=10){
                System.out.println(" 3");
         
           
                    System.out.println("beleza 3 - so vai");
                    
                 
        
         }
          else if( beleza <7 &&  altura < 7 && carisma >= 7 && carisma <=10)
         {
                     System.out.println(" 4");
            
                    
                    System.out.println(" beleza e altura - Fe em Deus");
                    
                 
        
         }
           else if( beleza >=7 && beleza <=10  && altura < 7 && carisma < 7)
         {
                     System.out.println(" 5");
            
                    
                    System.out.println(" belez - Fe em Deus");
                    
                 
        
         }
            else if( beleza <7 &&  altura >=7  && altura <=10 && carisma < 7)
         {
                     System.out.println(" ");
            
                    
                    System.out.println(" beleza e altura - Fe em Deus");
                    
                 
        
         }
         
           else if( beleza <7 && altura <7 && carisma < 7)
         {
                     System.out.println("9 ");
            
                    
                    System.out.println("Misericordia");
                    
                 
        
         }
    
         
        
    
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
