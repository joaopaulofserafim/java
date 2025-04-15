 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author joao.serafim
 */
public class EX4_SALAp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*****Cálculo kWh*****");
        
        System.out.println("Quantos kWh foram consumidos? ");
        double qtd = input.nextDouble();
       
        
        
        double valor;
        
        if (qtd < 150) {
            valor = 0.20;
        } else if (qtd >= 150 && qtd < 500) {
            valor = 0.25;
        } else {
            valor = 0.30;
        }
        
        double calculo = qtd * valor;
        
         if (qtd <= 11.89){
            System.out.print("Valor minimo da conta: R$: 11,90");
        }
         else{
            System.out.printf("Valor final: R$: %2f",calculo);
         }
        
       
    }
    
}
