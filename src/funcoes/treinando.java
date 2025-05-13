import java.util.Scanner;
public class treinando {

    public static int numeroUm(){
        Scanner input = new Scanner (System.in);

        System.out.println("Digite um numero inteiro: ");
        int n1 = input.nextInt();
        return n1;
    }

    public static int numeroDois(){
        Scanner input = new Scanner (System.in);

        System.out.println("Digite um numero inteiro: ");
        int n2 = input.nextInt();
        return n2;
    }

    public static int processamento (int n1, int n2){
    Scanner input = new Scanner (System.in);

    if (n1 > n2) {
        System.out.println("Maior numero: ");
        return n1;

    }else if (n1 == n2){
        System.out.println("Numero são iguais");
        return n1;
    }else {
        System.out.println("Maior numero: ");
        return n2;
    }
    }

    public static void main(String[] args) {
        int n1 = numeroUm();
        int n2 = numeroDois();

        int processa = processamento(n1, n2);
        System.out.println(processa);
    }



}