/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller8_v2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author valeriayunga
 */
public class Taller8_v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String cadena = "";
        String nombre;
        int cedula;
        int tipo;
        double Computadora1 = 1000;
        double Computadora2 = 1100;
        double Computadora3 = 900;
        double tipo_compu = 0;
        double num_compu;
        String salida = "";
        boolean bandera = true;
        double descuento;
        double porcentaje1 = 1;
        double porcentaje2 = 5;
        double porcentaje3 = 10;
        double porcentaje4 = 15;
        double total_pagar = 0;
        double subtotal;
        double total_venta = 0;

        do {

            System.out.println("Ingrese el nombre del cliente");
            nombre = entrada.nextLine();

            System.out.println("Ingrese el número de cedula del ciente");
            cedula = entrada.nextInt();

            System.out.println("Ingrese el tipo de cliente");
            tipo = entrada.nextInt();

            System.out.println("Seleccionar una computadora de las disponibles"
                    + "\n\n"
                    + "Ingrese 1 para la computadora1\n"
                    + "Ingrese 2 para la computadora2\n"
                    + "Ingrese 3 para la computadora3\n");
            num_compu = entrada.nextDouble();

            System.out.println("Ingrese cuantas computadoras se comprarán");
            tipo = entrada.nextInt();

            switch (tipo) {

                case 1:
                    tipo_compu = Computadora1;

                    break;

                case 2:
                    tipo_compu = Computadora2;
                    break;

                case 3:
                    tipo_compu = Computadora3;
                    break;

                default:
                    System.out.println("Tipo incorrecto");
                    break;

            }

            subtotal = tipo_compu * num_compu;

            if (tipo == 1) {
                descuento = (porcentaje1 * subtotal) / 100;
                total_pagar = subtotal - descuento;
            } else {

                if (tipo == 2) {
                    descuento = (porcentaje2 * subtotal) / 100;
                    total_pagar = subtotal - descuento;
                } else {

                    if (tipo == 3) {
                        descuento = (porcentaje3 * subtotal) / 100;
                        total_pagar = subtotal - descuento;

                    } else {
                        if (tipo == 4) {
                            descuento = (porcentaje4 * subtotal) / 100;
                            total_pagar = subtotal - descuento;
                        } else {
                            System.out.println("Tipo incorrecto");
                        }

                    }
                }
            }

            total_venta = total_venta + total_pagar;

            cadena = String.format("%sCliente: %s, con cédula %d, compra %.2f "
                    + "computadoras con precio individual: %.2f"
                    + " Total apagar: %.2f"
                    + "\n ",
                     cadena, nombre, cedula, num_compu, tipo_compu, 
                     total_pagar);

            entrada.nextLine();
            System.out.println("Ingrese (s),(si),"
                    + " (yes)o (y) si desea salir del ciclo ");
            salida = entrada.nextLine();

            if (salida.equals("s") || salida.equals("si") || salida.equals
        ("yes")
                    || salida.equals("y")) {
                bandera = false;
            }
            entrada.nextLine();

        } while (bandera);

        System.out.printf("%s\n\nTotal venta de computadoras: %.2f"
                , cadena,total_venta);

    }

}
