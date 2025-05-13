package array;
public class array_exemplos {
    public static void main(String[] args) {
        // criando vetor
        int [] vetor = new int[5];



        // preenchendo / populando 

        vetor [0] = 5;
        vetor [1] = 7;
        vetor [2] = -3;
        vetor [3] = 10;
        vetor [4] = -1;
        


        // percorrendo 
        for (int i = 0; i < 5; i ++){
            if (vetor[i] < 0) {
                
                System.out.printf("Vetor[%d]: %d\n", i , vetor[i]);
            }
        }

        // alterando elmento vetor

        vetor[4] = 1000;
        System.out.println(vetor[4]);

    }









}
