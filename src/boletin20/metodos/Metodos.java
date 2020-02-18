/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20.metodos;

import boletin20.metodos.PedirDatos;
import boletin20.metodos.Libro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author aalvarezbretana
 */
public class Metodos {

    public Libro crearLibro() {
        Libro x = new Libro(PedirDatos.pedirString(), PedirDatos.pedirString(), PedirDatos.pedirString(), PedirDatos.pedirFloat(), PedirDatos.pedirInt());
        return x;
    }

    public void venderLibro(ArrayList<Libro> lista) {
        // String codigo = JOptionPane.showInputDialog("");
        if (lista.isEmpty()) {
            throw new NullPointerException("El ArrayList está vacío");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Que libro ha sido vendido(por su ISBN)?");
            String codigo = sc.nextLine();
            for (int i = 0; i < lista.size(); i++) {
                if (codigo.equals(lista.get(i).ISBN)) {
                    lista.get(i).unidades--;
                }
            }
        }
    }

    public void amosar(ArrayList<Libro> lista) {
        if (lista.isEmpty()) {
            throw new NullPointerException("El ArrayList está vacío");
        } else {
            Collections.sort(lista);
            Iterator it = lista.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }

    public void darBaixa(ArrayList<Libro> lista) {
        if (lista.isEmpty()) {
            throw new NullPointerException("El ArrayList está vacío");
        } else {
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).unidades == 0) {
                    lista.remove(lista.get(i));
                }
            }
        }
    }

    public void consultarLibro(ArrayList<Libro> lista) {
        // String libroBuscar = JOptionPane.showInputDialog("");
        if (lista.isEmpty()) {
            throw new NullPointerException("El ArrayList está vacío");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Que libro deseas consultar(por su ISBN)?");
            String libroBuscar = sc.nextLine();
            for (int i = 0; i < lista.size(); i++) {
                if (libroBuscar.equals(lista.get(i).ISBN)) {
                    System.out.println("Ese ISBN corresponde ao libro co titulo "
                            + lista.get(i).titulo
                            + " de autor " + lista.get(i).autor + " cun prezo de "
                            + lista.get(i).prezo
                            + " e quedan dispoñibles " + lista.get(i).unidades
                            + " unidades.");
                }
            }
        }
    }
}
