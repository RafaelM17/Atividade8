/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade5;

import java.util.Scanner;

/**
 *
 * Em um campeonato de LOL, enquanto nao h ˜ a a tomada de territorio, o contador implementado deve contar (que e contabilizado pelo jogo), o n ´ umero de kills, deaths e assists. Se o ´
numero de kills for menor ou igual a 5, ele mostra a mensagem “noob”, se chegar a 20 ou mais “master”. Se o numero de deaths chegar a 20 ou mais, ele mostra a mensagem “Houston, ´
we have a problem”. Se o numero de assists chegar a 20 ou mais, e mostrada a mensagem: ´
“team work”. Lembre-se, e uma rotina que continua enquanto nao houver um vencedor. 
1. ha kills, deaths e assists total e da rodada ´
2. medite na frase: enquanto nao ha um vencedor, faca. . . ´
3. pergunte a cada loop o numero de cada medida comentada.
4. voce deve perguntar se h ˆ a um vencedor a cada loop. . .
 */
public class Atividade5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
         Scanner ler = new Scanner(System.in);
        int kill;
        int death;
        int assit;
        int rodada=1;
       
          
          
           
        
       while ( 3 >= rodada)
      {
          
                
        System.out.println("Rodada " + rodada);
        
         System.out.println("quantos kill");
            kill = ler.nextInt();
            System.out.println("quantos death");
            death = ler.nextInt();
            System.out.println("quantos assit");
            assit = ler.nextInt();
          
       
        if (kill <= 5 )
        {
          System.out.println("noob");
         
        }
            
        if(kill >=20 ) {    
          System.out.println("master");
        
         
         
        }
        
       if(death >= 20)
        {
            System.out.println("Houston,we have a problem");
        }
        
        if(assit >= 20)
        {
            System.out.println("team work");
        }
      
    
       if(kill >= 20 && assit >= 20)
        {
            System.out.println("Temos vencedor!");
            
        }
       
       if(kill <= 20 && assit <= 20)
        {
            System.out.println("nao ha vencedor!");
            
        }
         
          rodada++;
      
      }
        
    }
    
}
