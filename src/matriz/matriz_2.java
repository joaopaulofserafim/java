package matriz;


import java.util.Scanner;
public class matriz_2 {
    

    public static int [][] criarMatriz(int lin, int col){

        Scanner input = new Scanner(System.in);

        System.out.println("---Criando matriz---");

        // instanciando

        int [][] matriz = new int [lin][col];

        for (int i = 0 ; i < matriz.length ; i++ ){
            for(int j = 0 ; j < matriz[i].length; j++){
                System.out.printf("Matriz [%d][%d]: ", i, j);  //rever dps, praticar
                matriz[i][j] = input.nextInt();
            }
        }
        return matriz;
    }

    public static void imprimir(int [][] matriz){
        System.out.println("---imprimindo a matriz---");

        for (int i = 0 ; i < matriz.length ; i++ ){
            for(int j = 0 ; j < matriz[i].length; j++){
                System.out.printf("Matriz [%d][%d]: %d\n", i, j, matriz[i][j]);
            }

        }

    }

    public static int somatorio(int [][] matriz){
        System.out.println("---somatorio---");

        int soma = 0;

        for (int i = 0 ; i < matriz.length ; i++ ){
            for(int j = 0 ; j < matriz[i].length; j++){

                soma = soma + matriz[i][j];

            }

        }
        return soma;
    }

    public static int qntdNegativos(int [][]matriz){
        System.out.println("---Quantidade negativos---");

        int contador = 0;

        for (int i = 0 ; i < matriz.length ; i++ ){
            for(int j = 0 ; j < matriz[i].length; j++){
                if (matriz[i][j] < 0) {

                   contador ++;
                    
                }
            }

        }
        return contador;

    }

    public static int[] definirTamanho(){
        System.out.println("---Definindo tamanho---");
        Scanner input = new Scanner(System.in);

        int [] vetor = new int[2];

        System.out.println("Linhas: ");
        vetor[0] = input.nextInt();                 // usuario defeine tamanho do array

        System.out.println("Coluna: ");
        vetor[1] = input.nextInt();

        return vetor;
    }



    public static void main(String[] args) {

        int [] v = definirTamanho(); // nessa função só define o tamanho do array, e coloca nos indices 0 e 1 e aloca na variavel "V"

        int [][] matriz = criarMatriz(v[0], v[1]);  /*  aqui que vai ser criada a matriz,  na função " criar matriz" e passado  
                                                    2 parametros que foram pegos na função "definir tamanho" e da variavel "v" e aloca na linha 1 da coluna 1 da matrizz
                                                    */
         

        imprimir(matriz);
        
        System.out.println("Somando: "+ somatorio(matriz));

        //OU    // DA NA MESMA 

        int negativos = qntdNegativos(matriz);

        System.out.print("Negativos: " + negativos);
       

    }
}
