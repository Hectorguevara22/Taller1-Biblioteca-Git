/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

<<<<<<< HEAD
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
=======
    static ArrayList<Prestamo> prestamos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static Prestamo() {
        System.out.println("         CREAR PRESTAMO ");

        System.out.print("Ingrese ID del préstamo: ");
        String idPrestamo = sc.nextLine();
        System.out.print("Ingrese identificación del cliente: ");
        String idCliente = sc.nextLine();
        Cliente clienteEncontrado = null;
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(idCliente)) {
                clienteEncontrado = cliente;
                break;
            }
        }
        if (clienteEncontrado == null) {
            System.out.println("Cliente no encontrado.");
            return null;
        }
        System.out.print("Ingrese código del libro: ");
        String codigoLibro = sc.nextLine();
        Libro libroEncontrado = null;

        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigoLibro)) {
                libroEncontrado = libro;
                break;
            }
        }
        if (libroEncontrado == null) {
            System.out.println("Libro no encontrado.");
            return null;
        }
        if (!libroEncontrado.isDisponible()) {
            System.out.println("El libro no está disponible.");
            return null;
        }
        Prestamo prestamo = new Prestamo(
                idPrestamo,
                clienteEncontrado,
                libroEncontrado,
                LocalDate.now(),
                "Activo"
        );
        libroEncontrado.setDisponible(false);
        prestamos.add(prestamo);
        System.out.println("\nPréstamo creado correctamente.");
        System.out.println("ID préstamo: " + prestamo.getIdPrestamo());
        System.out.println("Cliente: " + prestamo.getCliente().getNombre());
        System.out.println("Libro: " + prestamo.getLibro().getTitulo());
        System.out.println("Fecha: " + prestamo.getFecha());
        System.out.println("Estado: " + prestamo.getEstado());

        return prestamo;
    }

    public static Prestamo devolverPrestamo() {

        System.out.println("\n===== DEVOLVER PRESTAMO =====");

        System.out.print("Ingrese el ID del préstamo: ");
        String idPrestamo = sc.nextLine();

        for (Prestamo prestamo : prestamos) {

            if (prestamo.getIdPrestamo().equals(idPrestamo)) {

                System.out.println("\nPréstamo encontrado:");
                System.out.println("ID: " + prestamo.getIdPrestamo());
                System.out.println("Cliente: " + prestamo.getCliente().getNombre());
                System.out.println("Libro: " + prestamo.getLibro().getTitulo());
                System.out.println("Fecha: " + prestamo.getFecha());
                System.out.println("Estado: " + prestamo.getEstado());

                if (prestamo.getEstado().equals("Devuelto")) {
                    System.out.println("Este préstamo ya fue devuelto.");
                    return;
                }
                prestamo.setEstado("Devuelto");

                prestamo.getLibro().setDisponible(true);

                System.out.println("\nPréstamo devuelto correctamente.");
                System.out.println("El libro ahora está disponible.");

                return;
            }
        }

        System.out.println("No se encontró un préstamo con ese ID.");
    }

    public static Prestamo listarPrestamos() {
        if (prestamos.isEmpty()) {
            System.out.println("No hay préstamos registrados.");
            return;
        }

        System.out.println("\n       LISTA DE PRÉSTAMOS ");

        for (Prestamo p : prestamos) {
            System.out.println("ID Préstamo: " + p.getIdPrestamo());
            System.out.println("Cliente: " + p.getCliente().getNombre());
            System.out.println("Libro: " + p.getLibro().getTitulo());
            System.out.println("Fecha: " + p.getFecha());
            System.out.println("Estado: " + p.getEstado());
            System.out.println("-----------------------------");
        }
>>>>>>> origin/feature/getion-prestamos
    }
}
