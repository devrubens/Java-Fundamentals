import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Que horas o jogo começou?");
        int inicio = sc.nextInt();

        System.out.println("Que horas o jogo terminou?");
        int fim = sc.nextInt();

        int tempo;

        if (inicio < fim) {
            tempo = fim - inicio;
            System.out.println("O jogo durou " + tempo + " horas");
        } else {
            tempo = 24 - inicio + fim;
            System.out.println("O jogo durou " + tempo + " horas");
        }

        sc.close();


    }
}
