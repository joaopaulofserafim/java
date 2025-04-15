import java.util.Scanner;


public class funcoes {

    public static int entradaDados(){ // int retorna um valor para outra função por exemplo 
        System.out.println("--Entrada de Dados");
        Scanner inputDados = new Scanner(System.in);

        System.out.println( "Digite um número: ");  
        int num = inputDados.nextInt();

        return num;
    }

    public static int menor(int n1, int n2){ // int retorna um valor para outra função por exemplo 
        System.out.println("*--Menor--*");

        int numMenor;

        if (n1 <= n2) {
            numMenor = n1;
        }else{
            numMenor = n2;
        }

        return numMenor;

    }

    public static void Imprimir(int menorr){ // void nao retorna um valor  para outra função por exemplo 
        System.out.println("--Imprimir--");
        System.out.println("Menor número: " + menorr);

    }


    public static void main(String[] args) {// void nao retorna um valor para outra função por exemplo 
        Scanner input = new Scanner(System.in);

        int n1 = entradaDados(); // chama a função Entrada de Dados e roda
        int n2 = entradaDados();// chama a função Entrada de Dados e roda


        int resultado = menor(n1,n2); // pega as variaveis n1 e n2 e passa de parametro para a funcão "menor", função menor roda e aloca o resultado na variavel "resultado "
        Imprimir(resultado); // roda a função "imprimir" com o parametro resultado 

        
    }

    
}