// entrada (nome e salario atual  ou FIM)
// processamento (calcular o reajuste)
// processamento (diferença entre os salarios atual e novo)
// tratamentos de erros 
// Saida (diferença entre os salarios atual e novo)

// Exercício 1 - Desenvolva um programa em Java que solicite o nome e o salário atual de um funcionário. O programa deverá calcular e exibir o novo salário reajustado de acordo com as seguintes regras:

/* Salários inferiores a R$ 150,00 recebem um reajuste de 25%.
Salários entre R$ 150,00 e R$ 300,00 (inclusive) recebem um reajuste de 20%.
Salários entre R$ 300,01 e R$ 600,00 (inclusive) recebem um reajuste de 15%.
Salários superiores a R$ 600,00 recebem um reajuste de 10%.
Além de exibir o novo salário, o programa também deve mostrar a diferença entre o salário reajustado e o salário atual. O programa deve continuar solicitando dados de funcionários até que o usuário digite "FIM" ao ser perguntado pelo nome, momento em que o programa deve ser encerrado. Em caso de informações de salário inválidas (não positivas), o programa deve informar ao usuário. */

import java.util.Scanner;

public class parte_um {


    public static String entradaNome(){
    Scanner input = new Scanner (System.in);

    System.out.println("Digite o nome do funcionário:\nOU\nDigite 'FIM' para encerrar: ");
    String nome = input.nextLine();

    return nome; // função sem ser void temq retornar 
    }

    public static float entradaSalario(){

        Scanner input = new Scanner (System.in);

        System.out.println("Digite seu salario atual: ");
        float salarioAtual = input.nextFloat();

        return salarioAtual; // função sem ser void temq retornar
    }

    public static float processamento(float salarioAtual){
        float reajuste = 0; // necessario ter um valor msm que "0"

        if (salarioAtual <= 0 ){
            System.out.println("Valor Invalido !!");
            reajuste = 0;

        }else if (salarioAtual < 150){
            reajuste = 0.25f; // "f" no final para o java enteder que é um float não um doule

        } else if (salarioAtual <= 300){
            reajuste = 0.20f; // não esquecer do "f" 

        } else if (salarioAtual <= 600){
            reajuste = 0.15f; 

        }
        float novoSalario = salarioAtual + (salarioAtual * reajuste);

        return novoSalario; // função sem ser void temq retornar
            
    }

        public static float diferença(float salarioAtual, float novoSalario){

            return novoSalario - salarioAtual;  // função sem ser void temq retornar

        }

        public static void resultado (String nome, float salarioAtual, float novoSalario, float diferença){

            System.out.printf("Funcionario: %s\n", nome);
            System.out.println("------------");
            System.out.printf("Salario Atual: R$ %.2f\n", salarioAtual);
            System.out.println("------------");
            System.out.printf("Novo Salario: R$ %.2f\n", novoSalario);
            System.out.println("------------");
            System.out.printf("Diferença:  R$ %.2f\n", diferença);
            System.out.println("------------");
        }
    
       
        public static void main(String[] args) {
          
            boolean continuar = true;

                while (continuar) { // enquanto "continuar" for true vai rodar 
                    
                    String nome = entradaNome();  
                    if (nome.equalsIgnoreCase("FIM")) {   //equalsIgnoreCase\ podia usar switch case tbm
                        System.out.println("Programa encerrado.");
                        break; 
                    }
    
    
                    float salarioAtual = entradaSalario();
                    
                   
                    if (salarioAtual <= 0) {  // tratamento de erro para que o salario não seja 0
                        System.out.println("Salário inválido! Digite um valor positivo.");
                        continue; 
                        /*
                        Exibe a mensagem de erro.
                        pula os cálculos e a função resultado().
                        Recomeça o while com o próximo nome.

                        ou seja, se o if é execultado o continue retorna para cima novamente e roda o while 
                        */  
                    }
                    
                    float novoSalario = processamento(salarioAtual); 
                    
                    
                    if (novoSalario == 0) {  // tratamento de erro para que o novo salario não seja 0
                        continue;  
                        /*
                        Exibe a mensagem de erro.
                        Usa continue; para pular os cálculos e a função resultado().
                        Recomeça o while com o próximo nome.

                         ou seja, se o if é execultado o continue retorna para cima novamente e roda o while
                        */  
                    }
                    
                    float diferenca = diferença(salarioAtual, novoSalario);

                    resultado(nome, salarioAtual, novoSalario, diferenca); 
                }
            }

              
    }

