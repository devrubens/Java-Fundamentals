import java.util.Scanner;

public class ExpressaoTernaria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        double valor = sc.nextDouble();
        double desconto = (valor < 100.0) ? valor * 0.1 : valor * 0.06;
        double valorFinal = valor - desconto;
        System.out.printf("O desconto da compra: R$ %.2f", desconto);
        System.out.printf("O valor da compra: R$ %.2f", valorFinal);

        sc.close();

    }
}
