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
public class EX3_SALA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("*****IMC*****");
        
        System.out.print("Inisira sua altura: ");
        double altura = input.nextFloat();
        
        System.out.print("Insira seu peso: ");
        double peso = input.nextFloat();
        
        double massa = peso / (altura * altura);
        
        if (massa < 26){
            System.out.println("Seu IMC está normal");
        } else if ( massa >= 26 && massa < 30){
            System.out.println("Seu IMC está acima do normal: Obeso");
        } else {
            System.out.println("Seu IMC está muito acimo do normal: Obesidade Mórbida");
        }
    }
    
}
