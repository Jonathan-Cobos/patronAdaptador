/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronadaptador;

/**
 *
 * @author Acer
 */
public class AdaptadorBiblioteca implements GestionLibros {
    private Biblioteca biblioteca;

    public AdaptadorBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    @Override
    public void alquilarLibro(String titulo) {
        biblioteca.alquilarLibro(titulo);
    }

    @Override
    public void devolverLibro(String titulo) {
        biblioteca.devolverLibro(titulo);
    }
}