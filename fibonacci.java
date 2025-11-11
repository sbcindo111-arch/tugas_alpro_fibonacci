import java.util.Scanner;

public class fibonacci {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan indeks suku deret Fibonacci: ");
        int deret = input.nextInt();

        if (deret < 0) {
            System.out.println("Indeks harus bilangan positif");
        } else {

            int u = fibonacci(deret);
            System.out.println("Suku Fibonacci ke-" + deret + " adalah: " + u);
            System.out.println("");

            System.out.println("Barisan Fibonacci: ");
            for (int i = 0; i <= deret; i++) {
                System.out.print(fibonacci(i) + (i < deret ? ", " : ""));
            }
            System.out.println("");
        }

    }

    public static int fibonacci(int a) {

        if (a <= 1) {
            return a;
        }

        return fibonacci(a-1) + fibonacci(a-2);

    }

}
