import java.util.Scanner;

//Faça um programa que verifique (usando if e else) se uma letra digitada é vogal ou consoante.

public class exercicio4ifeelse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char letra;
        System.out.println(" Digite uma letra:");
        letra = entrada.next().charAt(0);

        if ( letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            System.out.println(" A letra digitada é uma vogal ");

        }
        else {
            System.out.println(" A letra é uma consoante");
        }
    }
}
