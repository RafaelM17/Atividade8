/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade7;

import java.util.Scanner;

/**
 *
 * Foi realizada uma pesquisa de algumas características físicas da população de uma certa
regiao, a qual coletou os seguintes dados referentes a cada habitante para serem analisados: 
• sexo (masculino e feminino)
• cor dos olhos (azuis, verdes ou castanhos)
• cor dos cabelos (louros, castanhos, pretos)
• idade
Faca um algoritmo que determine e escreva:
• a maior idade entre os habitantes
• a menor idade entre os habitantes
• a quantidade de indiv´ıduos do sexo feminino cuja idade esta entre 18 e 35 anos inclusive ´
e que tenham olhos verdes e cabelos louros.
O final do conjunto de habitantes e reconhecido pelo valor -1 entrada como idade.
 */
public class Atividade7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner ler = new Scanner(System.in);
        int quantidade=0;
        int idade,maiorIdade=0, menosIdade=100 , cont=0;
        String sexo,corOlhos,corCabelo;
       
        
        
        do { System.out.println("informe sexo");
            sexo = ler.next();
            System.out.println("informe cor de olho");
            corOlhos = ler.next();
            System.out.println("informe cor de cabelo");
            corCabelo = ler.next();
            System.out.println("informe idade");
            idade = ler.nextInt();
           
            
           if (idade > maiorIdade){
                maiorIdade = idade;
                
            }
            
             if (idade < menosIdade){
                menosIdade = idade;
               
            }
                
                
            if ("feminino".equals(sexo) && idade>=18 && idade<=35 && "verde".equals(corOlhos) && "louro".equals(corCabelo))
            {
                
               
                quantidade=quantidade +1;
                System.out.println(" quantos mulher de feminino,de verde e de louro : "+quantidade);
                
               
            }   
            System.out.println("maior idade :"+maiorIdade);
            System.out.println("menos idade :"+menosIdade);
            
           
        }
       while (idade != -1);
      {
                 
           
            System.out.println("cont:"+cont);
           
          System.out.println(" while - maior idade :"+maiorIdade);
          System.out.println("while -menos idade :"+ menosIdade);
           System.out.println("while + quantidade de olhos verde e louros" + quantidade);
           
           
       
        
     
      }
    }
    
}
