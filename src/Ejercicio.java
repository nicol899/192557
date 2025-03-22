import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int a = 1;

        while (a <= 5) {
            System.out.print("Nombre del conductor " + a + ": ");
            String n = e.nextLine();

            System.out.print("Velocidad del conductor " + a + " (km/h): ");
            double v = 0;
            try {
                v = Double.parseDouble(e.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Velocidad inválida. Se asume 0 km/h.");
            }

            if (v > 60) {
                double m = (v - 60) * 2.5;
                System.out.println("Multa para " + n + ": $" + m + " por exceso de velocidad.");
            } else {
                System.out.println("¡Bien hecho, " + n + "! Conducción responsable.");
            }

            System.out.println();
            a++;
        }
        e.close();
        
    }
}
