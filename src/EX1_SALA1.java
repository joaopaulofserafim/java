/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


import java.util.Scanner;

/**
 *
 * @author joao.serafim
 */
public class EX1_SALA1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("*****Somando a 150*****");
        
        System.out.print("Insira um núemro: ");
        int num = input.nextInt();
        int soma = num + 150;
        
        System.out.println("Se o número inserido for maior que 100, irá ser somado a 150");
        
        if (num > 100){
           System.out.printf("O número %d é maior que 100, entâo valor final: %d",num, soma);
        }
        else {
            System.out.printf("O número %d é menor que 100, portanto o valor continua o mesmo: %d", num , num);
        }
            
    }   
}
