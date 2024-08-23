/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programadore.biblioteca;

/**
 *
 * @author perez
 */
public class Biblioteca {
    public static void main(String[] args) {
        // Crear un libro
        Libro libro1 = new Libro("Kafka y la muñeca viajera", "Jordi Sierra i Fabra");

        // Consultar disponibilidad
        libro1.consultarDisponibilidad();

        // Prestar el libro
        libro1.prestar();

        // Intentar prestar de nuevo el libro (debe fallar)
        libro1.prestar();

        // Consultar disponibilidad después del préstamo
        libro1.consultarDisponibilidad();

        // Devolver el libro
        libro1.devolver();

        // Consultar disponibilidad después de la devolución
        libro1.consultarDisponibilidad();
    }
}