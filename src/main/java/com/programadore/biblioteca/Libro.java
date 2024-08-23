/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programadore.biblioteca;

/**
 *
 * @author perez
 */
public class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private boolean disponible;

    // Constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true; // El libro está disponible por defecto
    }

    // Método para prestar el libro
    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + titulo + "' no está disponible para préstamo.");
        }
    }

    // Método para devolver el libro
    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro '" + titulo + "' ha sido devuelto y ahora está disponible.");
        } else {
            System.out.println("El libro '" + titulo + "' ya está disponible en la biblioteca.");
        }
    }

    // Método para consultar la disponibilidad del libro
    public void consultarDisponibilidad() {
        if (disponible) {
            System.out.println("El libro '" + titulo + "' está disponible para préstamo.");
        } else {
            System.out.println("El libro '" + titulo + "' no está disponible para préstamo.");
        }
    }
   // Métodos getter y setter si es necesario
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
