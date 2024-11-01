import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salarioAtual, salarioNovo, aumento;

        System.out.println(" Digite seu salário atual:");
        salarioAtual = entrada.nextDouble();
         if ( salarioAtual <=280){
             aumento = salarioAtual * 0.20;
             salarioNovo = salarioAtual + aumento;
             System.out.println(" Seu salario atual é: R$"+salarioAtual+"\n\r Seu novo salário é :R$"+salarioNovo+ "\n\r O valor do aumento de :R$"+aumento+"\n\rA sua porcentam de aumento foi de: 20%");

        }
         else if ( salarioAtual> 280 && salarioAtual <= 700){
            aumento = salarioAtual * 0.15;
             salarioNovo = salarioAtual + aumento;
             System.out.println(" Seu salario atual é: R$"+salarioAtual+ "\n\rSeu novo salário é: R$"+salarioNovo+ "\n\r O valor do aumento de: R$"+aumento+"\n\r A sua porcentam de aumento foi de: 15%");



         }
             else if ( salarioAtual > 700 && salarioAtual<1500){
            aumento = salarioAtual * 0.10;
             salarioNovo = salarioAtual + aumento;
             System.out.println(" Seu salario atual é: R$"+salarioAtual+ "\n\rSeu novo salário é:R$"+salarioNovo+ "\n\r O valor do aumento de:R$"+aumento+"\n\r A sua porcentam de aumento foi de: 10%");


         }
         else if ( salarioAtual > 1500) {
             aumento = salarioAtual * 0.05;
             salarioNovo = salarioAtual + aumento;
             System.out.println(" Seu salario atual é:R$"+salarioAtual+ "\n\r Seu novo salário é:R$"+salarioNovo+ "\n\r O valor do aumento de:R$"+aumento+"\n\r A sua porcentam de aumento foi de: 5%");

         }






    }
    }
