package laços;
import java.util.Scanner;
import java.util.Random;

public class equação{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random aleatorio = new Random();
         int a, b , minimo, maximo;
         double x;

         // entrada 
         System.out.println("Digite o valor minímo: ");
          minimo = input.nextInt();
         System.out.println("Digite o valor máximo: ");
          maximo = input.nextInt();

          if (minimo > maximo) {
            System.out.println("O valor mínimo não pode ser maior que o máximo.");
            return; 
        }
        

         do {
            a = aleatorio.nextInt(maximo - minimo + 1) + minimo;
         }while(a == 0);

         b = aleatorio.nextInt((maximo - minimo) + 1) + minimo;

         System.out.println("Equação: "+ a + "x + " + b + " = 0");


         x = - 1.0 * b  / a;
        System.out.println("Final: " + x);
         


    }
}