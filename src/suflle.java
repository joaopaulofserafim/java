import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class suflle{

 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    ArrayList<String> opcoes = new ArrayList();    // Adicionando tudo em uma lista 

    opcoes.add("Criar interfaces visualmente atraentes"); // APPEND NO ARRAY 
    opcoes.add("Melhorar a experiência do usuário com o produto");
    opcoes.add("Focar apenas na estética do produto");
    opcoes.add("Tornar o produto mais barato de ser produzido");
    opcoes.add("Definir o layout de cada página do site");

    String alternativaCorreta = "Melhorar a experiência do usuário com o produto"; // declaradno a correta

    String[] alternativas = { "A", "B", "C", "D", "E"}; // adicionadno as letras em uma lista 

    boolean certo = false;

    do {
        Collections.shuffle(opcoes);
        System.out.println("\n Qual é o principal objetivo do design de UX ? \n ");

            for (int i = 0; i < opcoes.size(); i++) { // size, percorre a lista enquato o indice for 0
                System.out.println("(" + alternativas[i] + ")" + " " + opcoes.get(i)); // pegando (get) uma letra (indice)
                };

                System.out.print("\n Escolha a alternativa correta: ");
                String infoUsuario = input.nextLine().trim().toLowerCase();

    switch (infoUsuario) {
    case "a":
        if (opcoes.get(0).equalsIgnoreCase(alternativaCorreta)) {  // equalIgonoreCase (ignora CAPS ou caps)GET pega um indice da lista opções (perguntas)
            System.out.println("Resposta Correta!");
            certo = true;

        } else {
        System.out.println("Resposta Incorreta!Tente novamente.");
        }

        break;

        case "b":
            if (opcoes.get(1).equalsIgnoreCase(alternativaCorreta)) {// equalIgonoreCase (ignora CAPS ou caps) / GET pega um indice da lista opções (perguntas)
            System.out.println("Resposta Correta!");
            certo = true;

        } else {
        System.out.println("Resposta Incorreta!Tente novamente.");
        }

         break;

        case "c":
            if (opcoes.get(2).equalsIgnoreCase(alternativaCorreta)) {// equalIgonoreCase (ignora CAPS ou caps) GET pega um indice da lista opções (perguntas)
            System.out.println("Resposta Correta!");
            certo = true;

        } else {
        System.out.println("Resposta Incorreta!Tente novamente.");
        }

        break;

            case "d":
            if (opcoes.get(3).equalsIgnoreCase(alternativaCorreta)) {
            System.out.println("Resposta Correta.");
            certo = true;

        } else {
        System.out.println("Resposta Incorreta!Tente novamente.");
        }
        
        break;
        case "e":

        if (opcoes.get(4).equalsIgnoreCase(alternativaCorreta)) {
        System.out.println("Resposta Correta");
        certo = true;

        } else {
        System.out.println("Resposta Incorreta!Tente novamente.");
        }

 }

 } while (!certo);

 }

}