package laços;
import java.util.Scanner;
import java.util.Random;

public class random{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Entrada do usuário
        System.out.print("Digite o valor mínimo (min): ");
        int min = scanner.nextInt();
        System.out.print("Digite o valor máximo (max): ");
        int max = scanner.nextInt();

        // Garante que o valor de 'a' não seja zero
        int a;
        do {
            a = random.nextInt((max - min) + 1) + min;
        } while (a == 0); // a ≠ 0

        // Gera b aleatoriamente no intervalo
        int b = random.nextInt((max - min) + 1) + min;

        // Exibe a equação
        System.out.println("Equação gerada: " + a + "x + " + b + " = 0");

        // Calcula a solução
        double x = - (double) b / a;
        System.out.printf("Solução: x = %.2f%n", x);

        scanner.close();
    }
}
