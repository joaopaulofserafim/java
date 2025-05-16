
// Exercício: Matriz de Notas de Alunos
// Você deve criar um programa em Java que:

// Permita ao usuário definir o número de alunos (linhas) e o número de notas por aluno (colunas).

// Leia as notas para cada aluno.

// Imprima todas as notas.

// Calcule a média geral das notas.

// Conte quantas notas estão acima da média geral.


package matriz;
import java.util.Scanner;

public class treinando_matriz {
   

    public static int [] definirTamanho (){
        Scanner input = new Scanner(System.in);

        int [] vetor = new int [2];

        System.out.println("Números de alunos: ");
        vetor[0] = input.nextInt();

        System.out.println("Número de notas por aluno: "); 
        vetor[1] = input.nextInt();

        return vetor;

    }

    public static int [][] criarMatriz(int linha , int coluna){
        Scanner input = new Scanner(System.in);

       int [][] matriz = new int[linha][coluna];

       for(int i = 0 ; i < matriz.length ; i ++){
            for(int j = 0 ; j < matriz[i].length ; j++){
                System.out.printf("Notas: (Aluno)%d (Nota)%d: ", i,j);
                matriz[i][j] = input.nextInt();
            }
       }
        return matriz;

    }

    public static void imprimir (int [][] matriz){
        for(int i = 0 ; i < matriz.length ; i ++){
            System.out.print("Aluno " + (i + 1) + ": ");
            for(int j = 0 ; j < matriz[i].length ; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
         }
    
    }

    public static int soma (int [][] matriz){

        int soma = 0;


        for(int i = 0 ; i < matriz.length ; i ++){
            for(int j = 0 ; j < matriz[i].length ; j++){

                soma = soma + matriz[i][j] ;

            }
            
        }   
        return soma;
    }

    public static double media(int[][] matriz) {
        double soma = 0;
        double total = 0;
    
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma = soma + matriz[i][j];
                total++; 
            }
        }
    
        return soma / total;
    }

    public static int acimaMedia(int [][] matriz, double media){
        int contador = 0; 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] > media) {
                    contador ++;
                    
                }
            }

         
    }
    return contador;
    }

    public static double[] mediaPorAluno(int[][] matriz) {
        double[] medias = new double[matriz.length]; // uma media a cada aluno
    
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) { // percorre a matriz 
                soma = soma + matriz[i][j];
            }
            medias[i] = (double) soma / matriz[i].length;  // media [i] recebe (conta para fazer a media), 
                                                            //ou seja variavel soma (que ja esta somando td) divido pela quantidade de indices na matriz 
        }
    
        return medias;
    }
    


    public static void main(String[] args) {
        int [] tamanho = definirTamanho();
        int [][] notas = criarMatriz(tamanho[0], tamanho[1]);

        imprimir(notas);

        int total = soma(notas);
        double mediaGeral = media(notas);

        System.out.printf("\nMédia geral das notas: %.2f\n", mediaGeral);

        int acimaMedia = acimaMedia(notas, mediaGeral);
        System.out.println("Notas acima da média: " + acimaMedia);

        double[] mediasAlunos = mediaPorAluno(notas);
            for (int i = 0; i < mediasAlunos.length; i++) {
               System.out.printf("Média do aluno %d: %.2f\n", i + 1, mediasAlunos[i]);
            }


    }
}