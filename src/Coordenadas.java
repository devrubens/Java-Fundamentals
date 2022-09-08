import java.util.Locale;
import java.util.Scanner;


public class Coordenadas {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor de  da coordenada X: ");
        double x = ler.nextDouble();
        System.out.println("Digite o valor de  da coordenada Y: ");
        double y = ler.nextDouble();

        if (x == 0 && y == 0){
            System.out.print("Está na origem");
        } else if (x > 0 && y > 0){
            System.out.print("Está no primeiro quadrante a coordenada adicionada");
        } else if (x < 0 && y > 0){
            System.out.print("Está no segundo quadrando a coordenada adicionada");
        } else if (x < 0 && y < 0){
            System.out.println("Está no terceiro quadrande a coordenada adicionada");
        } else if (x > 0 && y < 0){
            System.out.print("Está no quarto quadrante coordenada a coordenada adicionada");
        
        ler.close();
        }
    }
}
