import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Que horas são?");
        int horas = sc.nextInt();

        if (horas < 12) {
            System.out.println("boa dia");
        } else if (horas < 18) {
            System.out.println("Bom tarde");
        } else {
            System.out.println("Boa noite");
        }
        sc.close();
    }
}
