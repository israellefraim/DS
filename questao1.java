package variáveis.e.estruturas.de.condição;

import java.util.Scanner;

public class questao1 {
    
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Insira o 1º número: ");
        int num1 = myObj.nextInt();
        
        System.out.println("Insira o 2º número: ");
        int num2 = myObj.nextInt();
        
        System.out.println("Somatória: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        System.out.println("Divisão: " + (num1 / num2));
    }
}
