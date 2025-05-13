package laços;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author joao.serafim
 */
public class teste_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Digite um número par de 1 a 100: ");
        int usuario = input.nextInt();
        
        
        while ( usuario <= 0 || usuario >= 100 || usuario % 2 != 0){  
            System.out.print("\n Número invalido. \nInsira um número par de 1 a 100: ");
            usuario = input.nextInt();
        }
        
        
        
        while (usuario < 100){
            usuario = usuario + 2;
            System.out.println(usuario);
        }
    }
}
    
    

 