import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ado7 {
public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    System.out.println("*****ADOO7*****\n ");

    System.out.println("Qual é o principal objetivo do design de UX? \n ");

    boolean certo = false;

    List<String> opcoes = Arrays.asList(
        "a) Criar interfaces visualmente atraentes\n",
        "b) Melhorar a experiência do usuário com o produto\n",
        "c) Focar apenas na estética do produto\n",
        "d) Tornar o produto mais barato de ser produzido\n",
        "e) Definir o layout de cada página do site \n"
        );
        
        System.out.println(opcoes);

        
    do {



    /*System.out.println("Qual é o principal objetivo do design de UX? \n ");
    System.out.println("a) Criar interfaces visualmente atraentes");
    System.out.println("b) Melhorar a experiência do usuário com o produto");
    System.out.println("c) Focar apenas na estética do produto");
    System.out.println("d) Tornar o produto mais barato de ser produzido");
    System.out.println("e) Definir o layout de cada página do site \n");
*/

    System.out.println("Escolha uma opção: \n");
    String resposta = input.next();

    switch (resposta) {
        case "a":
        case "A":
        case "b":
        case "B":
        case "d":
        case "D":
        case "e":
        case "E":

        System.out.println("\nResposta incorreta!!!\nTente Novamente \n ");
        Collections.shuffle(opcoes);
            
            break;

            case "c":
            case "C":
            System.out.println("Resposta correta!! \n Parabéns!!");
            certo = true;
            break;
    
        default:
        System.out.println("Opção Invalida");
            break;
    }

    }while (!certo);


}

}