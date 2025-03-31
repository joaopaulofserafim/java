

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author joao.pfserafim1
 */
public class condicao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("***Calculo***");
        
        float p1 = 0.2f , p2 = 0.3f, p3 = 0.5f;
        
        System.out.print("Nome: ");
        String nome = input.next();
       
        System.out.print("Nota 1: ");
        float n1 = input.nextFloat();
      
        System.out.print("Nota 2: ");
        float n2 = input.nextFloat();
       
        System.out.print("Nota 3: ");
        float n3 = input.nextFloat();
        
        System.out.print("Número de faltas: ");
        int faltas = input.nextInt();
    
        
        float media = ((n1 * p1) + (n2 * p2) + (n3 * p3));
        System.out.printf("%s, sua média foi de: %.1f \n" , nome, media);
        
        if (media >= 6 && faltas < 18 ){
            System.out.println("Aprovado");
            
        }else if ( media > 6 && faltas >=18 ){
            System.out.println("Reprovado \n Limite de faltas atingido");
            
        }else if (media < 6 && faltas <= 17){
            System.out.print("Insira a nota da prova de recuperação: ");
            float rec = input.nextFloat();
            float calc = (rec + media)/2;
            
              if (calc >= 6){
                  System.out.println("Aprovado na recuperação");
              } else {
                  System.out.println("Reprovado na recuperação");
              }
        }
        else{
            System.out.println("Reprovado");            
        }


        
    }
    
}
