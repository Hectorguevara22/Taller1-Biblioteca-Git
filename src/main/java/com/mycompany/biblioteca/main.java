/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.biblioteca;

import java.util.Scanner;

public class main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean e = true;
        Cliente cliente = new Cliente();
        Libro libro = new Libro();
        Prestamo prestamo = new Prestamo();
        while (e) {
            System.out.println("           sistema de biblioteca /n"
                    + "seleccione                   "
                    + "1 gestion de clientes"
                    + "2 gestion de libros"
                    + "3 gestion de prestamos"
                    + "4 salir");
        }
        int a = sc.nextInt();
        switch (a) {
            case 1:
                boolean x = true;
                while (x) {
                    System.out.println("        gestion de clientes"
                            + "seleccione"
                            + "1 crear cliente"
                            + "2 listar clientes"
                            + "3 buscar clientes"
                            + "4 actualizar clientes"
                            + "5 borrar clientes"
                            + "6 salir");
                    int b = sc.nextInt();
                    switch (b) {
                        case 1:
                            cliente.crear();
                            break;
                        case 2:
                            cliente.read();
                            break;
                        case 3:
                            cliente.buscar();
                            break;
                        case 4:
                            cliente.actualizar();
                            break;
                        case 5:
                            cliente.eliminar();
                            break;
                        case 6:
                            x = false;
                            break;

                    }
                }

                break;
            case 2:
                boolean op = true;
                while (op) {
                    System.out.println("        gestion de libros"
                            + "seleccione"
                            + "1 crear libro"
                            + "2 listar libros"
                            + "3 buscar libros"
                            + "4 actualizar libros"
                            + "5 borrar libros"
                            + "6 salir");
                    int b = sc.nextInt();
                    switch (b) {
                        case 1:
                            libro.crear();
                            break;
                        case 2:
                            libro.listar();
                            break;
                        case 3:
                            libro.buscar();
                            break;
                        case 4:
                            libro.actualizar();
                            break;
                        case 5:
                            libro.eliminar();
                            break;
                        case 6:
                            op = false;
                            break;

                    }

                }
                break;
            case 3:
                boolean z = true 
                while (z) {
                    System.out.println("        gestion de prestamos"
                            + "seleccione"
                            + "1 crear prestamo"
                            + "2 devolver prestamo"
                            + "3 listar prestamos"
                            + "4 salir");
                    int f = sc.nextInt();
                    switch (f) {
                        case 1:
                                Prestamo();
                            break;
                        case 2:
                            prestamo.devolverPrestamo();
                            break;
                        case 3:
                            prestamo.listarPrestamos();
                            break;
                        case 4:
                            z = false;
                            break;

                    }
                }
        }
    }
