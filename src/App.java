import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int number;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        number = sc.nextInt();
        
        System.out.println("Tabela do " + number);

        for(int i = 0; i <= 10; i++){
            int result = number * i;
            System.out.println(result);
        }
    }
}
