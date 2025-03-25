/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_sala_ALP;
import java.util.Scanner;

/**
 *
 * @author joao.serafim
 */
public class EX2_SALA {
    public static void main(String[] args) {
        System.out.println("*****Divindo*****");
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira um número: ");
        float num1 = input.nextFloat();
        
        System.out.print("Insira outro número: ");
        float num2 = input.nextFloat();
        
        float soma = num1/num2;
        
        if (num2 == 0){
            System.out.println("Insira um valor maior que 0");
        }
        else if (num1 % num2 == 0){
             System.out.println("A divisão não tem resto, ou seja é exata");
        }
        else{
            System.out.println("A divisão tem resto, ou seja não é exata");
        }
    }
    
}
