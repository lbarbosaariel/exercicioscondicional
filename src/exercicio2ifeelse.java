import java.util.Scanner;

// Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo

public class exercicio2ifeelse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double numero;
        System.out.println( " Digite um numero: ");
        numero = entrada.nextDouble();

        if ( numero <0 ){
            System.out.println(" O numero digitado é negativo");
        }
        else {
            System.out.println(" O numerdo digitado é positivo!");
        }
        
    }
}

