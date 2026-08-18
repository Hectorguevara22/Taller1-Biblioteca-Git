/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.biblioteca;

import java.util.ArrayList;
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

    static ArrayList<Cliente> clientes = new ArrayList<>();
import java.util.Scanner;
import java.util.ArrayList;

public class main {

    static ArrayList<Libro> libros = new ArrayList<>();
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
        System.out.println("consulta y listado de clientes");
        for (Cliente cliente : clientes) {
            System.out.println("id :" + cliente.getId());
            System.out.println("nombre :" + cliente.getNombre());
            System.out.println("telefono :" + cliente.getTelefono());
            System.out.println("email : " + cliente.getEmail());
            System.out.println("----------------------");

        }
    }

    public static Cliente buscar() {
        System.out.println("consulta selectiva de clientes");
        System.out.println("identificacion del cliente que desea buscar");
        String ide = sc.nextLine();
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(ide)) {
                System.out.println("id :" + cliente.getId());
                System.out.println("nombre :" + cliente.getNombre());
                System.out.println("telefono :" + cliente.getTelefono());
                System.out.println("email : " + cliente.getEmail());
                System.out.println("----------------------");
            } else {
                System.out.println("cliente no encontrado");
            }

        }
    }

    public static Cliente actualizar() {
        System.out.println("actualizacion de clientes");
        System.out.println("identificacion del cliente que desea actualizar");
        String ide = sc.nextLine();
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(ide)) {
                System.out.println("id :" + cliente.getId());
                System.out.println("nombre :" + cliente.getNombre());
                System.out.println("telefono :" + cliente.getTelefono());
                System.out.println("email : " + cliente.getEmail());
                System.out.println("----------------------");
                System.out.println("nuevo nombre :");
                String nombre = sc.nextLine();
                System.out.println("nuevo telefono :");
                String telefono = sc.nextLine();
                System.out.println("nuevo correo :");
                String correo = sc.nextLine();
                cliente.setNombre(nombre);
                cliente.setTelefono(telefono);
                cliente.setEmail(correo);

                return cliente;
            }
        }
        System.out.println("Cliente no encontrado");
        return null;

    }

    public static Cliente eliminar() {
        System.out.println("eliminacion de clientes");
        System.out.println("identificacion del cliente que desea eliminar");
        String ide = sc.nextLine();
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(ide)) {
                System.out.println("id :" + cliente.getId());
                System.out.println("nombre :" + cliente.getNombre());
                System.out.println("telefono :" + cliente.getTelefono());
                System.out.println("email : " + cliente.getEmail());
                System.out.println("----------------------");

                Cliente.remove(clientes);
                System.out.println("Cliente eliminado correctamente");

                return cliente;
            }
        }
        System.out.println("Cliente no encontrado");
        return null;

    public static Libro crear() {
        System.out.println("creacion de libros");
        System.out.println("codigo");
        String codigo = sc.nextLine();
        System.out.println("titulo");
        String titulo = sc.nextLine();
        System.out.println("año de publicacion");
        String yearpublic = sc.nextLine();
        System.out.println("autor");
        String autor = sc.nextLine();
        boolean disponible = true;
        return new Libro(codigo, titulo, yearpublic, autor, disponible);

    }

    public static Libro listar() {
        System.out.println("consulta de libro");
        for (Libro libro : libros) {
            System.out.println("codigo" + libro.getCodigo());
            System.out.println("titulo" + libro.getTitulo());
            System.out.println("año de publicacion" + libro.getYearpublic());
            System.out.println("autor" + libro.getAutor());
            System.out.println("estado" + libro.isDisponible());
            System.out.println("----------------------");
        }
    }

    public static Libro buscar() {
        System.out.println("consulta selectiva de libro");
        System.out.println("codigo del libro");
        String codigo = sc.nextLine();
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                System.out.println("codigo" + libro.getCodigo());
                System.out.println("titulo" + libro.getTitulo());
                System.out.println("año de publicacion" + libro.getYearpublic());
                System.out.println("autor" + libro.getAutor());
                System.out.println("estado" + libro.isDisponible());
                return libro;
            }
        }
        System.out.println("libro no encontrado");
        return null;
    }

    public static Libro actualizar() {
        System.out.println("actualizacion de libro");
        System.out.println("codigo del libro");
        String codigo = sc.nextLine();
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                System.out.println("codigo" + libro.getCodigo());
                System.out.println("titulo" + libro.getTitulo());
                System.out.println("año de publicacion" + libro.getYearpublic());
                System.out.println("autor" + libro.getAutor());
                System.out.println("estado" + libro.isDisponible());
                System.out.println("----------------------");
                System.out.println("nuevo titulo");
                String titulo=sc.nextLine();
                System.out.println("nuevo año de publicacion");
                String yearpublic=sc.nextLine();
                System.out.println("nuevo autor");
                String autor=sc.nextLine();
                libro.setTitulo(titulo);
                libro.setYearpublic(yearpublic);
                libro.setAutor(autor);
                return libro;
            }
        }
        System.out.println("libro no encontrado");
        return null;
    }
    public static Libro eliminar(){
       System.out.println("actualizacion de libro");
        System.out.println("codigo del libro");
        String codigo = sc.nextLine();
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                System.out.println("codigo" + libro.getCodigo());
                System.out.println("titulo" + libro.getTitulo());
                System.out.println("año de publicacion" + libro.getYearpublic());
                System.out.println("autor" + libro.getAutor());
                System.out.println("estado" + libro.isDisponible());
                libro.remove(libros);
                System.out.println("libro eliminado correctamente");
                return libro;
            }
        }
        System.out.println("libro no encontrado");
        return null;  

    }
