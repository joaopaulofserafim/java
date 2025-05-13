package matriz;
public class matriz_1 {
    
    public static void main(String[] args) {

        // instanciando uma matriz de forma direta  
        int[][] matriz =  {{1,-2,3},{4,-5,6},{-7,8,9}};// 0, 1, 2 - indices

        System.out.println("Item da matriz:" + matriz[1][2]); // 6 da matriz

     
        // alterando elemento [1],[2]

        // matriz[1][2] = 90;
        // System.out.println("Item da matriz:" + matriz[1][2]);

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0 ; j < matriz[i].length; j++){

                System.out.printf("matriz[%d][%d]: [%d]\n", i,j,matriz[i][j]);
            }

        }

        int soma = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0 ; j < matriz[i].length; j++){

                soma = soma + matriz[i][j];

            }
        }

        System.out.println(soma);

        int qnt = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0 ; j < matriz[i].length; j++){

                if (matriz[i][j] < 0) {
                    System.out.printf("Numeros negativos: %d\n", matriz[i][j]);
                
                    qnt ++;
                    
                }

            }

        }

        System.out.printf("quantidade: "+ qnt);

    }

}
