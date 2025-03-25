import java.util.Scanner;

public class sala {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inicio = input.nextInt();
        System.out.println("Inicio:");

        int fim = input.nextInt();
        System.out.println("Fim:");

        while (inicio < fim ) {
            if(inicio%2 == 0){
                System.out.printf("%d é PAR!", inicio);
            }
            inicio++;
            
        }


    }

    
}