/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade3;

import java.util.Scanner;

/**
 *
 * João e casado e tem que realizar alguns pagamentos. O seu salario  bruto ́e desconhecido, 
então ele deve digita-lo. Ele tem um desconto de 12,5% em folha, ais ́ em outros 6% vale
refeitao, tudo sobre o valor do salario bruto. Do que resta, ele precisa pagar as contas. Ele ́
tem 4 boletos para pagar. Caso sobre algum salário, ele deve mandar para a poupança ̧a. Caso ́
não sobre. . . Ta de boas. . . . mas. . . Ficar no vermelho, o ‘software’ deve dizer. . . “Deu má”. ́ */
public class Atividade3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double boleto1;
        double boleto2;
        double boleto3;
        double boleto4;
 
        double liquido1;
        double liquido2;
        double liquido3;
        double liquido4;
   
        double somaDesconto;
        double bruto;
           
        
        System.out.println("Digite seu salaro burto");
         bruto = ler.nextDouble();
                      
       System.out.println("Digite boleto 1");
      boleto1 = ler.nextDouble();
      System.out.println("Digite boleto 2");
      boleto2 = ler.nextDouble();
     System.out.println("Digite boleto 3");
      boleto3 = ler.nextDouble();
      System.out.println("Digite boleto 4");
       boleto4 = ler.nextDouble();
       somaDesconto = 0.125 + 0.06;
       //   somaDesconto vai receber = 12,5 + 0,06
       liquido1 = bruto -(bruto*somaDesconto);
       
       boleto1 =  boleto1 + boleto2 + boleto3 + boleto4;

       if (liquido1 >= boleto1){
             System.out.println(liquido1);
           System.out.println("Deve mandar poupanca");
       }
       else{
           System.out.println("deu ruim");
       }
    }
    
}
