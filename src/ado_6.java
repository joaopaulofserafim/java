/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author joao.pfserafim1
 */
public class ado_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int Ntentativas = 1;
        char alternativa;
        boolean certo = false;
        
        do{
            System.out.println("Qual linguagem é usada para consulta e manipular banco de dados relacionados ?:");
            System.out.println("A) Python ");
            System.out.println("B) Java ");
            System.out.println("C) SQL ");
            System.out.println("D) C++ ");
            System.out.println("E) HTML");
            
            
            alternativa = input.next().charAt(0);
            
            switch (alternativa) {
                case 'a': case 'A': case 'b': case 'B': case 'd': case 'D': case 'e': case 'E':
                    System.out.println("Alternativa incorreta!!");
                    
                    if(Ntentativas < 3){
                        System.out.println("Tente Novamente!");
                    }
                    Ntentativas++;  /* adicionando um a tentativas */
                    break;
                  
                case 'c': case 'C':
                    System.out.println("Resposta Correta!!");
                    certo = true;
                    break;
                default:
                    System.out.println("Opção inválida !!!");
            }
        }while (!certo && Ntentativas <=3 ); /* 0, 1, 2 (3 tentativas) 0 conta*/
        
        if(!certo){
            System.out.println("Você errou as 3 tentativas!!");
        }
                
        
        
        

    }
    
}
