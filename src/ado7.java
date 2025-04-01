
import java.util.Scanner;
import java.util.Collections;
 

public class ado7 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        boolean certo = false;
    
        do {
        System.out.println("*****ADO_7*****");
    
        System.out.println("Qual é o principal objetivo do design de UX?");
        System.out.println("a) Criar interfaces visualmente atraentes");
        System.out.println("b) Melhorar a experiência do usuário com o produto");
        System.out.println("c) Focar apenas na estética do produto");
        System.out.println("d) Tornar o produto mais barato de ser produzido");
        System.out.println("e) Definir o layout de cada página do site");
    
        System.out.print("Escolha uma alternativa: ");
        String escolha = input.next();
    
        switch (escolha) {
            case "a" :
            case "A":
            case "b":
            case "B":
            case "d":
            case "D":
            case "e":
            case "E":
    
            System.out.println("Resposta incorreta!!!  Tente Novamente");
    
                break;
    
            case "c":
            case "C":
                System.out.println("Resposta correta!!!");
                break;
        
            default:
            System.out.println("Opção invalida!!!");
                break;
        }
    
       }while (!certo);
       
    
    }

    
}
