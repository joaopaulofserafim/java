/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author joao.pfserafim1
 */
public class question {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*****Questão*****");
        
        System.out.println("Responda a Questão abaixo:");
        System.out.println("Em uma sala, há cinco pessoas: Ana, Beatriz, Carlos, Daniel e Eduardo. Cada uma dessas pessoas está usando uma camisa de cor diferente: \n vermelha, azul, verde, amarela e preta. Sabemos que Ana não está usando a camisa vermelha nem a azul, Beatriz está usando a camisa verde, \n Carlos está usando a camisa preta, e Daniel não está usando a camisa amarela. Com base nessas informações, qual cor de camisa Eduardo está usando? \n");
    
        System.out.println("Escolha uma alternativa abaixo: \n ");
        System.out.println("A) Vermelha");
        System.out.println("B) Azul CORRETA");
        System.out.println("C) Verde");
        System.out.println("D) Amarela");
        System.out.println("E) Preta \n ");
        
        System.out.println("Insira a letra correta: ");
        String resposta = input.next();
        
        char RespostaFinal = resposta.charAt(0);
        char grade = ' ';
       
        
        if (RespostaFinal == 'A' || RespostaFinal == 'a'){
           grade = 'A';
        }else if (RespostaFinal == 'B' || RespostaFinal == 'b'){
            grade = 'B';
        }else if (RespostaFinal == 'C' || RespostaFinal == 'c'){
            grade = 'C';
        }else if (RespostaFinal == 'D' || RespostaFinal == 'd'){
             grade = 'D';
        }else if (RespostaFinal == 'E' || RespostaFinal == 'e'){
            grade = 'E';
        }
        
        switch (grade){ 
            
            case 'A':
                System.out.println("Resposta incorreta!!");
                break;
            
            case 'B':
                System.out.println("Resposta correta!!");
                break;
            
            case 'C':
                System.out.println("Resposta incorreta!!");
                break;
                
            case 'D':
                System.out.println("Resposta incorreta!!");
                break;
                
            case 'E':
                System.out.println("Resposta incorreta!!");
                break;
                
             default:
                 System.out.println("Opção Invalida, tente novamente!!");
        }       
        
        
        
    }
    
}
