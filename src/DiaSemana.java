import java.util.Scanner;


public class DiaSemana {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7: ");
        int dia = sc.nextInt();

        switch (dia){
            case 1:
                System.out.println("Domingo é o dia escolhido");
                break;
            case 2:
                System.out.println("Segunda é o dia escolhido");
                break;
            case 3:
                System.out.println("Terça é o dia escolhido");
                break;
            case 4:
                System.out.println("Quarta é o dia escolhido");
                break;
            case 5:
                System.out.println("Quinta é o dia escolhido");
                break;
            case 6:
                System.out.println("Sexta é o dia escolhido");
                break;
            case 7:
                System.out.println("Sábado é o dia escolhido");
                break;
            default:
                System.out.println("dia da semana escolhido é inválido");
                break;
        }
        

    }
}
