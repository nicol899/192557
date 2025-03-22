import java.util.Scanner;

public class MuyMal {
    public static void main(String[] args) throws Exception {
        Scanner o = new Scanner (System.in);
        int i = 1;
        int T = 0;
        int M = 0;
        int N = 0;

        System.out.println("Ingrese un número límite:");
        int L= o.nextInt();

        while (i <= L) {
            if (i % 3 == 0) {
                T = T + i;
                System.out.println(i + " es múltiplo de 3");
                int l=o.nextInt();
            }
            i = i + 1;

            if (i % 5 == 0) {
                M = M + i;
                System.out.println(i + " es múltiplo de 5");
                int l =o.nextInt();
            }
            i = i +1;

            if (i % 3 != 0 && i % 5 != 0) {
                N = N + i;
                System.out.println(i + " no es múltiplo de 3 ni 5");
                int l=o.nextInt();
            }

            i = i + 1;
        }

        System.out.println("Suma de múltiplos de 3: " + T);
        System.out.println("Suma de múltiplos de 5: " + M);
        System.out.println("Suma del resto: " + N);
    }
}
