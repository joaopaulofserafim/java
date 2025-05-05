import java.util.Scanner;

public class mediaSalarial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float [] salarios = new float[5];

        float soma = 0;

        for( int i = 0; i < 5 ; i++){
            System.out.print("Salario: ");
            salarios[i] = input.nextFloat();
            soma = soma + salarios[i];
        }

        float media = soma / 5;
        System.out.printf("\nMédia salarial: %.2f\n", media);

        for( int i = 0; i < 5 ; i++){

            if (salarios[i] < media) {
                
                System.out.printf("\nAbaixo da média: %.2f\n", salarios[i]);
            }
        }










    }
    }
