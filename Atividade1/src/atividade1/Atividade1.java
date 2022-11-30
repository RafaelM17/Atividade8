/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade1;

import java.util.Scanner;

/**
 *
 * Faca um programa que receba a nota e a frequencia de um aluno e exiba o resultado deste ˆ
aluno. A frequencia e um numero decimal entre 0 e 1 (ex: 80% de frequencia equivale a 0.80). ˆ
• Aprovado: Nota mınima 7.0 e frequencia mınima de 0.75
• Em recuperacao:  Nota entre 4.0 e 7.0 e freqencia mınima de 0.75
• Reprovado: Nota inferior a 4.0 ou frequencia inferior a 0.75 ˆ
 */
public class Atividade1 {

  
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      
      double aluno;
      double frequencia;
      
      System.out.println("Nota");
      aluno = ler.nextDouble();
      System.out.println("informe frequencia");
      frequencia = ler.nextDouble();
      
      frequencia = frequencia -(frequencia * 0.80);
      
      if ( aluno >= 7 && frequencia >= 0.75) {
           System.out.println("Aprovado");
            System.out.println(aluno + " " + frequencia);
           
      }
      else if ( aluno <= 7 && aluno >=4 && frequencia > 0.75) {
           System.out.println("recuperacao");
           System.out.println(aluno + " " + frequencia);
      }
      else if ( aluno >= 4 && frequencia <= 0.75){
          System.out.println("Reprovado:");
          System.out.println(aluno + " " + frequencia);
      }
    }
    
}
