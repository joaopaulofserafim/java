import java.util.Scanner;
import java.util.Random;

public class equacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random alea = new Random();

        System.out.println("Digite um valor mínimo: ");
        int minimo = input.nextInt();
        System.out.println("Digite o maximo:");
        int maximo = input.nextInt();

        int um;
        do {
            um = random.nextInt((maximo - minimo) + 1) + minimo;
        } while (um == 0);

    }
}