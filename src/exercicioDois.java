

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 * 
 * @author joao.pfserafim1
 */
public class exercicioDois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite uma temperatura: ");
        double tempInserida = input.nextFloat();
        
        double calc = (tempInserida - 32)/1.8;
        
        System.out.println("Temperatura final: "+ calc);
        
   
        
    }
    
}
