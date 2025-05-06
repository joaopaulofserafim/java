import java.util.Scanner;

// - obter qunatos funcionarios 
// - criar e popular o vetor com os salarios 
// calcular a media
// imprimir a media
// imprimir salarios abaixo da media 
// main para teste 




public class mediaSalarial {


    public static int qntdeFuncionarios() {
        System.out.println("---qntdeFuncionario---");

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de funcionarios: ");
        int funcionarios = input.nextInt();
        
        return funcionarios;
    }

    public static float[] vetores (int funcionarios){

        System.out.println("---vetores---");

        Scanner input = new Scanner(System.in);

        float [] salario = new float[funcionarios];

        for( int i = 0; i < funcionarios ; i++){
            System.out.print("\nSalario: R$");
            salario[i] = input.nextFloat();
            

        }

        return salario;
    }

    
    public static float calculo (float [] salario, int funcionarios){

        System.out.println("---calculo---");

        float soma = 0;
       
        for(int i = 0; i< funcionarios; i++)
        soma = soma + salario[i];

        return soma;
    }

    public static float mediaCalc(float soma, float funcionarios){

        float mediaa = soma/ funcionarios;

        return mediaa;
    }
    
    public static void imprimiMedia(float mediaa){

        System.out.println("---imprimirMedia---");
        
        System.out.printf("Media: %.2f", mediaa);

    }

    public static void abaixoMedia(float mediaa, float [] salario, int funcionarios){

        for( int i = 0; i < funcionarios ; i++){

            if(salario[i] < mediaa){
    
                System.out.printf("\nAbaixo da média: %.2f\n", salario[i]);
    
            }
        }

    

        
        
    }
    
    public static void main(String[] args){

        int qntd = qntdeFuncionarios();

        vetores(qntd);

        float [] salarios = vetores(qntd);

        float media = mediaCalc(qntd, qntd);

        imprimiMedia(media);
        abaixoMedia(media, salarios, qntd);

       
        
    }
    
    


}

// public static void main(String[] args) {
//     Scanner input = new Scanner(System.in);
    
//     float [] salarios = new float[5];

//     float soma = 0;

//     for( int i = 0; i < 5 ; i++){
//         System.out.print("Salario: ");
//         salarios[i] = input.nextFloat();
//         soma = soma + salarios[i];
//     }

//     float media = soma / 5;
//     System.out.printf("\nMédia salarial: %.2f\n", media);

//     for( int i = 0; i < 5 ; i++){

//         if (salarios[i] < media) {
            
//             System.out.printf("\nAbaixo da média: %.2f\n", salarios[i]);
//         }
//     }

// }