/*Escreva um programa em Java que implemente o jogo conhecido como pedra, papel, tesoura. Neste jogo, o usuário e o computador escolhem entre pedra, papel ou tesoura. Sabendo que pedra ganha de tesoura, papel ganha de pedra e tesoura ganha de papel, exiba na tela o ganhador: usuário ou computador. Para essa implementação, assuma que o número 0 representa pedra, 1 representa papel e 2 representa tesoura. Para sortear a jogada do computador, adicione a seguinte função ao seu programa:
java.util.Random; 
public static int randInt(int min, int max) {
        rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
}
A função randInt gera aleaoriamente um número entre min e max. Por exemplo, para sortear um número entre 0 e 2, a seguinte chamada deve ser realizada: x = randInt(0, 2) /* A variavel x recebe um numero entre 0 e 2

entrada (pedir 0, 1 ou 2 para usuario )
processamento (transformaros numeros (0, 1,2 ) em texto)
procesamento (analise as condições para vitoria oou não )

*/ 

import java.util.Scanner;
import java.util.Random;

public class parte_dois {

  /*   A função randInt gera aleaoriamente um número entre min e max. Por exemplo, para sortear um número entre 0 e 2, a seguinte chamada deve ser realizada: x(no caso maquina la em baixo) = randInt(0, 2) A variavel x recebe um numero entre 0 e 2 */
    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public static int entrada(){
        Scanner input = new Scanner (System.in);

        System.out.println("Pedra, Papel, Tesoura\n");
        System.out.println("Sabendo que: \n(0)Pedra\n(1)Papel\n(2)Tesoura\nEscolha uma opção para enfrentar a maquina");

        int escolha = input.nextInt();

        return escolha;

    }

    public static String transformaTexto (int numDeEscolha){
        switch (numDeEscolha) {
            case 0:
                return "Pedra";    // se eu tiver o "return" no case, não preciso do "break"
               
            case 1 :
                return "Papel";  // se eu tiver o "return" no case, não preciso do "break"
            
            case 2 :
                return "Tesoura";

            default:
                return "Inválido!!";
        }
    }

    public static String processamento(int usuario, int maquina){

        if (usuario ==  0 && maquina == 2 ) {
            return "Usuario vencedor\n";
        }
        else if (usuario == 1  && maquina == 0 ){
            return "Usuario vencedor\n";
        }
        else if (usuario == 2 && maquina == 1){
            return "Usuario vencedor\n";
        }
        else if (usuario == maquina) {
            return "Empate\n";
        }
        else{
            return "Maquina vencedora\n";
        }
    }


     public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

            
            int usuario = entrada();
    
            if (usuario < 0 ) {  // eu sei que podia colocar no msm if essas condiçoes, mas meu teclado tá quebrado a barra reta 
                System.out.println("Escolha uma opção valida !!!");
                return;
                
            }else if (usuario > 2) {    // eu sei que podia colocar no msm if essas condiçoes, mas meu teclado tá quebrado a barra reta 
                System.out.println("Escolha uma opção valida !!!");
                return;
            }
    
            int maquina = randInt(0,2);   // metodo random, maquina embaralha e escolhe uma
    
            System.out.println("Você escolheu: " + transformaTexto(usuario));
            System.out.println("Maquina escolheu: " + transformaTexto(maquina));
    
            String resultado = processamento(usuario, maquina);
            System.out.println(resultado);
            
        }

        
    }

    
