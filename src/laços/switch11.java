package laços;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author joao.pfserafim1
 */
public class switch11 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("*****Dia da Semana*****");
        
        System.out.println("Digite um número de 1 a 7: ");
        int num = input.nextInt();
        
        char dia;
        
        if (num == 1){
            dia = '1';
        }else  if (num == 2){
            dia = '2';
        }else  if (num == 3){
            dia = '3';
        }else  if (num == 4){
            dia = '4';
        }else  if (num == 5){
            dia = '5';
        }else  if (num == 6){
            dia = '6';
        }else  if (num == 7){
            dia = '7';
        }else{
            dia = '0';
        }
        
        
        switch (dia) {
            case '1':
                System.out.println("Dia selecionado é: Domingo");
                break;
            case '2':
                System.out.println("Dia selecionado é: Segunda-Feira");
                break;
            case '3':
                System.out.println("Dia selecionado é: Terça-Feira");
                break;
            case '4':
                System.out.println("Dia selecionado é: Quarta-Feira");
                break;
            case '5':
                System.out.println("Dia selecionado é: Quinta-Feira");
                break;
            case'6':
                System.out.println("Dia selecionado é: Sexta-Feira");
                break;
            case '7':
                System.out.println("Dia selecionado é: Sábado");
                break;
            default:
                System.out.println("Opçaõ Invalida!!!");
        }
        
    }
    
}
