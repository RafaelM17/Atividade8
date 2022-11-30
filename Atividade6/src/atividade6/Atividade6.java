/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade6;

import java.util.Scanner;

/**
 *
 * Como você pode ver, o problema do par é o seguinte:
• A cada novo modo colocado pelo garçom, eles pedem mais uma dose.
• A cada dose o valor da conta aumenta e consequentemente aumenta também os 10%´
referente a taxa de serviço. 
Ajude Maiara e Maraisa a sacar o valor total da conta. Crie um programa que:
1. Receba o valor inicial da conta e o valor da dose.
2. Pergunte ao usuário se ele quer “ouvir mais um mod”. O usuário deve digitar 1 para
sim e 2 para não. 
3. Cada vez que o usuário digitar "sim", seu programa deve adicionar mais uma dose
ao valor da conta já calculado e adicionar os 10% da taxa de serviço sobre o valor
total.
4. Mostre ao usuário o novo valor de sua conta e também qual valor é igual a 10%. 
5. Encerre o programa quando o usuário digitar “não” (opção 2). Ao digitar 1, repita o ˜
cálculos e reexibir o valor da conta e os 10%
 */
public class Atividade6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int SimOuNao;
        double valorConta;
        double valorDose;
        double receberConta;
        
        int cont=1;
        
        while (3 >= cont){
            System.out.println("digite valor de conta");
            valorConta = sc.nextDouble();
            System.out.println("informe valor de dose");
            valorDose = sc.nextDouble();
            
            System.out.println("Deseja ouvir mais um moda");
            SimOuNao = sc.nextInt();
            
            
            if (SimOuNao == 1){
                
                valorConta += valorDose;
                receberConta =  valorConta * 0.1;
                System.out.println("conta e "+receberConta);
               
                
            }
            else if (SimOuNao ==2 ){
                valorConta  += valorDose;
                System.out.println("conta e "+valorConta); 
                break;
            }
             cont++;
        }
        
        
    }
    
}
