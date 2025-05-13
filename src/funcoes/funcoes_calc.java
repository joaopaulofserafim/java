package funcoes;
import java.util.Scanner;
public class funcoes_calc {

    public static int menu(){
        Scanner input = new Scanner(System.in);
        int operacao; 

        do{
            System.out.println("-- Menu --");
            System.out.println("----------------------\n");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
    
            System.out.print("Escolha uma opçao: ");
    
    
           operacao = input.nextInt();

           if (operacao  <= 0 || operacao >= 5) {
            System.out.println("\n Opção invalida !!! \n Digite um valor de 1 a 4 !!! \n ");
            
           }    
        }while(operacao  <= 0 || operacao >= 5);
        
        return operacao;
    }


    public static float entradaDados(){
        Scanner input = new Scanner(System.in);

        System.out.println("-- Entrada de Dados --");
        System.out.println("----------------------\n");

        System.out.print("Digite um número: ");
        float num1 = input.nextFloat();



       
        return num1;
    }

    public static float adicao(float n1, float n2){
        System.out.println("-- Adição --");
        System.out.println("----------------------\n");
        float soma = n1 + n2;
        return soma;
    }

    public static float subtracao(float n1, float n2){
        System.out.println("- Subtração --");
        System.out.println("----------------------\n");
        float sub = n1 - n2;
        return sub;
    }

    public static float multiplicacao(float n1, float n2){
        System.out.println("-- Multiplicação --");
        System.out.println("----------------------\n");
        float multi = n1 * n2;
        return multi;
    }

    public static float divisao(float n1, float n2){
        System.out.println("-- Divisão --");
        System.out.println("----------------------\n");
        float divide = n1 / n2;
        return divide;
    }

    public static void imprimir(float resultado){
        System.out.println("-- Imprimir --");
        System.out.println("----------------------\n");
        System.out.print("resultado: " + resultado);
    }

    public static float controlador(float n1, float n2, int op){
        System.out.println("-- Controlador --");
        System.out.println("----------------------\n");
        float resultado = 0;
        switch (op) {
            case 1:

            resultado = adicao(n1, n2);
                break;
            
            case 2:

            resultado = subtracao(n1, n2);
                break;
            
            case 3:

            resultado = multiplicacao(n1, n2);
                break;

            case 4:
            resultado = divisao(n1, n2);
                break;
                
        }
                return resultado;

    }

    public static void main(String[] args) {
        System.out.println("-- Main -- ");
        System.out.println("----------------------\n");

        int operacao = menu();

        float n1 = entradaDados();

        float n2 = entradaDados();

        float result = controlador(n1, n2, operacao);

        imprimir(result);

        

        
    }
    
}
