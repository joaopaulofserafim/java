/*Um jogo bem simples consiste em tentar adivinhar um valor inteiro aleatório
escolhido entre 1 e 100 por um computador. O usuário/jogador terá apenas 5
chances para tentar adivinhar o valor. A cada tentativa do jogador, caso ele não
acerte, o programa deve informar se o valor digitado é maior ou menor que o
valor escolhido pelo computador. E caso o valor digitado pelo jogador tenha
diferença em módulo igual a 1 com o valor correto deverá ser impresso “TÁ
QUENTE!” (por exemplo, o computador escolheu 42 e o jogador digitou 41
ou 43). No final, deverá ser impresso “Parabéns, você ganhou o jogo!”, se o
jogador conseguiu acertar o valor escolhido pelo computador, ou “Game
Over!”, caso contrário.

*/

import java.util.Scanner;
import java.util.Random;

public class ADO_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random numAleato = new Random();

        int escolhaMaquina = numAleato.nextInt(1,100); // de 1 a 100
        boolean certo = false;

        for(int tentativas = 1 ; tentativas <= 5 ; tentativas++){
            System.out.printf(" %d/5 tentativas: (Escolha de 1 a 100)\n",tentativas);  // 1/5 tentantivas 
            int usuarioTentativas = input.nextInt();

            if (usuarioTentativas == escolhaMaquina) {
                System.out.println("\nVocê acertou!!, Parabéns!!!");
                certo = true;
                return; // pula fora
                
            } else if (usuarioTentativas == escolhaMaquina - 1 || usuarioTentativas == escolhaMaquina + 1) {
                System.out.println("TÁ QUENTE");

            }  else if (usuarioTentativas < escolhaMaquina){
                System.out.println("É maior que este número!\n");

            } else if (usuarioTentativas > escolhaMaquina){
                System.out.println("É menor que este número!\n");

            }
        }
        
        if ( certo == false) {
            System.out.printf("Game Over\nSuas tentativas acabaram\nNúmero correto: %d\n",escolhaMaquina);
                        
            }

    }

    
}