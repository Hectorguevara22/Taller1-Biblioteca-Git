/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    static ArrayList<Cliente> clientes = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    }

    public static Cliente crear() {
        System.out.println("id :");
        String id = sc.nextLine();
        System.out.println("nombre :");
        String nombre = sc.nextLine();
        System.out.println("telefono :");
        String telefono = sc.nextLine();
        System.out.println("correo :");
        String correo = sc.nextLine();
        return new Cliente(id, nombre, telefono, correo);
    }

    public static Cliente read() {
        System.out.println("consulta y listado de clientes"
                + "1 consulta global"
                + "2 consulta selectiva");
        int a = sc.nextInt();
        sc.nextLine();
        switch (a) {
            case 1:
                for (Cliente cliente : clientes) {
                    System.out.println("id :" + cliente.getId());
                    System.out.println("nombre :" + cliente.getNombre());
                    System.out.println("telefono :" + cliente.getTelefono());
                    System.out.println("email : " + cliente.getEmail());
                    System.out.println("----------------------");

                }
                break;
            case 2:
                System.out.println("Identificación del cliente:");
                String ide = sc.nextLine();

                for (Cliente cliente : clientes) {
                    if (cliente.getId().equals(ide)) {
                        System.out.println("id: " + cliente.getId());
                        System.out.println("nombre: " + cliente.getNombre());
                        System.out.println("telefono: " + cliente.getTelefono());
                        System.out.println("email: " + cliente.getEmail());
                    }
                     }

                System.out.println("Cliente no encontrado.");
                break;
            default:
                System.out.println("Opción inválida.");

        }
    }
