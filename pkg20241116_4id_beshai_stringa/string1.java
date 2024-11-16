/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.minastring1;

import java.util.Scanner;

/**
 *
 * @author Mina
 */
public class string1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
     // TODO code application logic here
             //questa e la parte in cui si scannerizza la frase
         Scanner scan = new Scanner(System.in);
         System.out.println("inserire la frase ");
         String frase = scan.nextLine();
         
         //qui si inizializzo il conteggio di A a 0
         int conteggio = 0;
         
         //questo for serve a far prendere ogni lettera della frase e appena fatto controllo dentro al ciclo if viene incrementato e passa alla lettera succesiva
         for(int i = 0; i < frase.length(); i++){
             
             //questo ciclo if serve a vedere se la lettera presa é uguale ad A se sì, si incrementa il conteggio di 1 il conteggio
             if(frase.charAt(i) == 'a' || frase.charAt(i) == 'A'){
                 
                 conteggio++;
             }
             
         }
         //qua stampiamo il numero di presenze di A
         System.out.println("numero di volte di comparsa lettera a: " +conteggio);
          
         for(int j = 0; j < conteggio; j++){
             
             System.out.println("A");
             
         }
         
    }
    
}
