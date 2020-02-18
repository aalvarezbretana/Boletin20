/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20.metodos;

/**
 *
 * @author aalvarezbretana
 */
public class Libro implements Comparable {

    String titulo;
    String autor;
    String ISBN;
    float prezo;
    int unidades;

    public Libro() {

    }

    public Libro(String titulo, String autor, String ISBN, float prezo, int unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.unidades = unidades;
    }

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

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Libro:\n" + " Titulo= " + titulo
                + "\n Autor= " + autor + "\n ISBN= " + ISBN
                + "\n Prezo= " + prezo + "\n Unidades= " + unidades + '\n';
    }

    @Override
    public int compareTo(Object o) {
        Libro libro = (Libro) o;
        if (this.titulo.compareToIgnoreCase(libro.titulo) == 0) {
            return 0;
        } else if (this.titulo.compareToIgnoreCase(libro.titulo) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
