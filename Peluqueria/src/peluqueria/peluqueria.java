/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peluqueria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author barre
 */
public class peluqueria {

    public static void main(String[] args) {

        List<empleado> peluqueros = new ArrayList<>();

        peluqueros.add(new empleado("Ana"));
        peluqueros.add(new empleado("Roberto"));
        peluqueros.add(new empleado("Jose"));
        peluqueros.add(new empleado("Lucrecia"));

        Scanner sc = new Scanner(System.in);
        while (true) {
            // Registro del día para cada peluquero
            for (empleado peluquero : peluqueros) {
                System.out.println("Registro del día para " + peluquero.nombre + ":");
                while (true) {
                    System.out.println("Seleccione el tipo de servicio (1-4) o 0 para finalizar el dia:");
                    System.out.println("1. Corte Caballero");
                    System.out.println("2. Corte Dama");
                    System.out.println("3. Tintura");
                    System.out.println("4. Peinado");
                    int opcion = sc.nextInt();
                    if (opcion == 0) {
                        break;
                    }
                    if (opcion >= 1 && opcion <= 4) {
                        peluquero.registro(crearServicio(opcion));
                    } else {
                        System.out.println("Opción no valida.");
                    }
                }
            }

            // Mostrar detalle para cada peluquero
            for (empleado peluquero : peluqueros) {
                peluquero.mostrarDetalle();
                System.out.println();
            }

            // Mostrar consolidado para la peluquería
            int totalIngresos = 0;
            for (empleado peluquero : peluqueros) {
                totalIngresos += peluquero.corteCaballero * 8000
                        + peluquero.corteDama * 10500
                        + peluquero.tintura * 40000
                        + peluquero.peinado * 15000;
            }
            System.out.println("Total ingresos de la peluquería en el dia: $" + totalIngresos);

            // Preguntar al usuario si desea continuar o finalizar el programa
            System.out.println("¿Desea continuar con otro dia? (1. Continuar / 2. Finalizar)");
            int opcionDia = sc.nextInt();
            if (opcionDia != 1) {
                // Finalizar el programa si no se desea continuar
                return;
            } else {
                // Reiniciar el día
                for (empleado peluquero : peluqueros) {
                    peluquero.reiniciarDia();
                }
            }
        }
    }

    // Método para crear el servicio según la opción seleccionada
    private static servicioPeluqueria crearServicio(int opcion) {
        switch (opcion) {
            case 1:
                return new corteCaballero();
            case 2:
                return new corteDama();
            case 3:
                return new tintura();
            case 4:
                return new peinado();
            default:
                return null;
        }
    }
}