import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        double temperatura, fahrenheit;
        int fahrenheit_inteiro;

        // Criando um objeto Scanner para ler dados do teclado
        Scanner scanner = new Scanner(System.in);

        // Pedindo dados de entrada do usuário
        System.out.print("Digite a temperatura em graus celsius: ");

        // Lendoo número digitado pelo usuário
        temperatura = scanner.nextDouble();

        // Convertendo de graus celsius para fahrenheit
        fahrenheit = (temperatura * 1.8) + 32;

        // Imprimindo o resultado com casas decimais
        System.out.println("A temperatura em fahrenheit é: " + fahrenheit);

        fahrenheit_inteiro = (int) fahrenheit;

        // imprimindo o resultado sem casas decimais
        System.out.println("A temperatura inteira em fahrenheit é: " + fahrenheit_inteiro);


    }
}