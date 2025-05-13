/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author joao.pfserafim1
 */
public class menuJogo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
         System.out.println("Bem Vindo ao XXX!!!");
         
         int escolha;
       
         
         do {
             
             System.out.println("Suas opções: ");
             System.out.println("1 - Instruções");
             System.out.println("2 - Jogar");
             System.out.println("3 - Créditos");
             System.out.println("4 - Sair");
             System.out.print("Escolha uma opção: ");
             escolha = input.nextInt();
             
          
             
             switch (escolha){
                 
                 case 1 :
                     System.out.println("Você escolheu as intruções: \n Instruções \n ************************");
                     break;
                
                 case 2 :
                     System.out.println("Você escolheu jogar: \n Jogando\n  **************");
                     break;
                
                 case 3:
                     System.out.println("Você escolheu créditos: \n Créditos \n *****************");
                     break;
                     
                 case 4:
                     System.out.println("Saindo");
                     break;
                     
                default:
                    System.out.println("Opção inválida");
                    
             }      
                    
      
             } while(!(escolha == 4));
                     
                
         
         
     }
}