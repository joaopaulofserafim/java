import java.util.Scanner;

public class sala_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contador = 1;

        while (contador <= 1 ) {
            System.out.printf("Insira o %dº número: ", contador);
            float num = input.nextFloat();

            contador++;
        }
        
    }
    
}
