import java.util.Scanner;

// Faça um programa que peça dois números e verifique (usando if e else) e imprima o maior deles

public class exercicio1ifeelse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1, num2;

        System.out.println(" Digite um numero numero inteiro: ");
        num1 = entrada.nextInt();
        System.out.println(" Digite o segundo  numero inteiro: ");
        num2 = entrada.nextInt();

        if ( num1< num2){
            System.out.println(" O segundo número digitado é maior que o primeiro!");
        }
        else if ( num1 == num2){
            System.out.println("Os númeos são iguais! Digite novamente um dos numeros");
        }
        else{
            System.out.println( " O primeiro número digitado é maior que o segundo!");
        }


    }
}
