/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.biblioteca;

import java.util.Scanner;
import java.util.ArrayList;

public class main {

    static ArrayList<Libro> libros = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    }

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
}
