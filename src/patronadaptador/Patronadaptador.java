/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronadaptador;

/**
 *
 * @author Acer
 */
public class Patronadaptador {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // Crear la biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Crear adaptador para la biblioteca
        GestionLibros adaptadorBiblioteca = new AdaptadorBiblioteca(biblioteca);

        // Alquilar y devolver libros usando el adaptador
        adaptadorBiblioteca.alquilarLibro("Cien años de soledad");
        adaptadorBiblioteca.devolverLibro("Cien años de soledad");
    }
}

