/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop_potencia;

import java.util.Scanner;
public class Loop_potencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int i;
       double n1 ,a;
       System.out.print("Digite um número para a potencia: ");
       n1 = input.nextInt();
       i = 1;
       while(i<=15){
          a = Math.pow(n1,i);
          System.out.println(a);
          i = i+1;
       }
        
        
        {
           
        }    
    }
    
}
