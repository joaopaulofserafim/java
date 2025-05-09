import java.util.Scanner;
public class treinando_funcoes {
//  Criar um programa que receba um número do usuário e imprima a tabuada desse número de 1 a 10, utilizando uma função para gerar os resultados.

// entrada (solicitar um numero intero), ja tratar o erro de num negativo 

// processamento (numero escolhido, imprimir a tabuada ate o 10 )

// saida(imprimir tudo e opção sair )


public static int entrada(){
    Scanner input = new Scanner(System.in);

    System.out.println("Imprime tabuada");

    System.out.println("Digite um numero inteiro: ");
    int num = input.nextInt();

    if (num < 0) {
        System.out.println("Erro! Digite um valor positivo");
    }

    return num;
}

public static void imprimiTabuada(int num){
    Scanner input = new Scanner(System.in);

    System.out.println("\nNumero escolhido: " + num);
     
 
    int i = 0;

    for( i = 1; i < 11; i++){
       int calculo = num * i;

        System.out.println("\n" + num + " x " + i + " = " + calculo);

    }

}

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char resposta ; 

    do{
        int num = entrada();
        imprimiTabuada(num);
        
        System.out.println("\nDeseja fazer uma nova operação? (S) OU (N):  ");
        resposta = input.next().toUpperCase().charAt(0);

    }while(resposta == 'S');    

    System.out.println("FIM!");
   

 
}
}

