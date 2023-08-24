import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int menu;
        float numero1;
        float numero2;
        float resultado = 0;

        System.out.println("===== CALCULADORA ====");
        System.out.println("[1] - Adição");
        System.out.println("[2] - Subtração");
        System.out.println("[3] - Multiplicação");
        System.out.println("[4] - Divisão");
        System.out.println("[9] - Saír");
        System.out.print("Escolha: ");
        menu = entrada.nextInt();

        System.out.println("-----------------");
        System.out.println("Qual o primeiro número?");
        System.out.print("R: ");
        numero1 = entrada.nextInt();

        System.out.println("-----------------");
        System.out.println("Qual o segundo número?");
        System.out.print("R: ");
        numero2 = entrada.nextInt();

        switch (menu) {
            case 1:
                System.out.println(numero1+" + "+numero2);

                resultado = numero1 + numero2;
                break;

            case 2:
                System.out.println(numero1+" - "+numero2);

                resultado = numero1 - numero2;
                break;

            case 3:
                break;

            case 4:
                break;

            default:
                break;

        }
        System.out.println("A resposta é: "+resultado);
    }
}