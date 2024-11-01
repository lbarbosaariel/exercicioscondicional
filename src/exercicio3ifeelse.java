

//Faça um programa que verifique (usando if e else) se uma letra digitada é “F” ou “M”.
// Conforme a letra escrever: F – Feminino, M- Masculino, Sexo inválido.

import java.util.Scanner;

public class exercicio3ifeelse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char sexo;

        System.out.println(" Digite seu sexo: F - Feminino ou M - Masculino");
        sexo = entrada.next().charAt(0);

        if (sexo == 'F'){
            System.out.println(" Sexo Feminino");
        }
        else if ( sexo == 'M'){
            System.out.println(" Sexo Masculino");
        }
        else{
            System.out.println(" Sexo não válido, digite novamente!");
        }


    }
}
