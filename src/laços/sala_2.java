import java.util.Scanner;

public class sala_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contador = 1;
        int limite = 10;
        int numMaior = 0;

        while (contador <= limite ) {
            System.out.printf("Insira o %dº número: ", contador);
            int num = input.nextInt();

            if (num > numMaior) {
                numMaior = num;
            }

            contador++;
        }
        System.out.printf("Maior número: %d ", numMaior);
        
    }
    
}
