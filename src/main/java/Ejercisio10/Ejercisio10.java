package Ejercisio10;

import java.util.Scanner;

public class Ejercisio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1;
        int edad;
        double promedio_edad = 0;
        double estatura_m;
        double estatura;
        int contador_estatura = 0;
        int contador_edad = 0;
        System.out.println(" indice la cantidad de alumnos ");
        n1 = entrada.nextInt();
        for (int i = 0; i < n1; i++) {
            System.out.println(" por favor introducir la edad");
            edad = entrada.nextInt();
            System.out.println(" introducir la estatura ");
            estatura = entrada.nextDouble();
            if (edad > 18) {
                contador_edad++;
            }
            if (estatura > 1.75) {
                contador_estatura++;
            }
            promedio_edad = promedio_edad + edad;

        }

        System.out.println(" la edad promedio es de " + promedio_edad);
        System.out.println(" la cantidad que tienen mayor de 18 es de " + contador_edad);
        System.out.println(" la cantidad que tienen mas de 1.75" + contador_estatura);

    }

}
