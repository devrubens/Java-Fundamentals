import java.util.Scanner;

public class Telefonia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tempo de ligação em minutos: ");
        int minutos = sc.nextInt();

        if (minutos <= 100) {
            System.out.println("Valor da conta: R$ 50,00");
        } else {

            int MinutosExtras = minutos - 100;
            int valor = MinutosExtras * 2 + 50;

            System.out.printf("Valor da conta: R$ 50,00 + R$ 2,00 por minuto excedente, sua conta é de: R$ %d,00",
                    valor);
        }

        sc.close();

    }
}
