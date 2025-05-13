package laços;
import java.util.Random;  
public class dado {
    public static void main(String[] args) {
        int numLancamentos = 1000000;

          
        int[] contagemFaces = new int[6];  // array para contagem de vezes que aparece um lado 

     
        Random random = new Random();

        for (int i = 0; i < numLancamentos; i++) {
           
            int face = random.nextInt(6) + 1; // sem o incremento: 0, 1, 2, 3, 4 ,5 / com incremento: 1, 2, 3, 4, 5, 6

            contagemFaces[face - 1]++; // alinha os indice com os numero , antes: 1[0], agora:  1[1]
        }

   
        for (int i = 0; i < contagemFaces.length; i++) {  // percorrer o array 
            double porcentagem = (contagemFaces[i] / (double) numLancamentos) * 100; // pega um indice e divide 

            // Imprimimos a porcentagem de cada face com 2 casas decimais
            System.out.printf("Face %d: %.2f \n", i + 1, porcentagem); // +1 usado para o indice ser igual a 1 não a 0 / ex: face 1 / diferente de face 0
        }
    }
}
