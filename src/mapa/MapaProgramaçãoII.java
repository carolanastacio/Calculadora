/**
 * Delta : ax² + bx + c = 0
 *
 * Formula de baskara : x1 = -b + raíz quadrada delta/2.a 
 *                      x2 = -b - raíz quadrada delta/2.a 
 * Testes: a = 2, b = – 16 e c = – 18 
 * Teste negativo: a= 7; b= 3; c= 4
 *
 */
package mapa;

import java.util.Scanner;


public class MapaProgramaçãoII {

    public static void main(String[] args) {

        int a, b, c;
        double x1, x2;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        a = ler.nextInt();

        System.out.println("Digite o valor de b: ");
        b = ler.nextInt();

        System.out.println("Digite o valor de c: ");
        c = ler.nextInt();

        double delta = calcularDelta(a, b, c);
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("O valor de delta é: " + delta);
        System.out.println("O valor de x1 é: " + x1);
        System.out.println("O valor de x1 é: " + x2);

    }

    private static double calcularDelta(int a, int b, int c) throws IllegalArgumentException {
        try {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                throw new IllegalArgumentException("Delta é: " + delta + "\nNão existem raízes reais.");
            }
            return delta;
        } catch (IllegalArgumentException e) {
            System.out.println( e.getMessage());
        }
        return 0;

    }
}
