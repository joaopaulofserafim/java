/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class IMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("*****IMC*****");
        
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();
        
        System.out.print("Digite o seu peso: ");
        float peso = input.nextFloat();
        
        System.out.print("Digite sua altura: ");
        float altura = input.nextFloat();
        
        
        float calculo = peso / (altura * altura);
        
         if (idade >= 20 && idade <= 60) {
            if (calculo < 18.5) {
                System.out.println("Abaixo do peso.");
            }else if (calculo >= 18.5 && calculo < 24.9) {
                System.out.println("Peso normal.");
            }else if (calculo >= 25 && calculo < 29.9) {
                System.out.println("Sobrepeso.");
            }else {
                System.out.println("Obesidade.");
            }
        } else if (idade > 60) {
            System.out.printf("IMC: %.2f", calculo);
            if (calculo < 22) {
                System.out.println("Abaixo do peso.");
            }else if (calculo >= 22 && calculo < 27) {
                System.out.println("Peso normal.");
            }else if (calculo >= 27 && calculo <29.9){
                System.out.println("Sobrepeso.");
            }else {
                System.out.println("Obesidade.");
            }
        } else {
            System.out.println("Idade fora da faixa permitida.");
        }
    }
    
}
