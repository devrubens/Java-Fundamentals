import java.util.Scanner;

public class Mercado {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Codigo - Produto - Preço");
        System.out.println(" 1 - Cachorro Quente - R$ 4,00");
        System.out.println(" 2 - X-Salada - R$ 4,50");
        System.out.println(" 3 - X-Bacon - R$ 5,00");
        System.out.println(" 4 - Torrada Simples - R$ 2,00");
        System.out.println(" 5 - Refrigerante - R$ 1,50");

        System.out.println("Digite o codigo do produto:");
        double codigo = ler.nextDouble();

        System.out.println("Qual é a quantidade do produto:");
        double quantidade = ler.nextDouble();

        double total;
    
        if (codigo == 1){
            total = quantidade * 4.00;
            System.out.printf("Total: R$ %.2f", total);
        } else if (codigo == 2){
            total = quantidade * 4.50;
            System.out.printf("Total: R$ %.2f", total);
        }else if (codigo == 3){
            total = quantidade * 5.00;
            System.out.printf("Total: R$ %.2f", total);
        } else if (codigo == 4){
            total = quantidade * 2.00;
            System.out.printf("Total: R$ %.2f", total);
        } else if (codigo == 5){
            total = quantidade * 1.50;
            System.out.printf("Total: R$ %.2f", total);
        } else {
            System.out.println("Codigo invalido");
        }

    }
}
