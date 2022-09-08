import java.util.Scanner;

public class Mutiplos {
    
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Adicione um número inteiro:");
        int A = ler.nextInt();
        System.out.println("Adicione outro número inteiro:");
        int B = ler.nextInt();

        if (A % B == 0 || B % A ==0){
            System.out.println("Esses numéros são multiplos");
        } else {
            System.out.println("Esses números não são multiplos");
        }
        ler.close();
    }
    

}
