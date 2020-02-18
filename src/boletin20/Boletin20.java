/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20;

import boletin20.metodos.Metodos;
import boletin20.metodos.Libro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aalvarezbretana
 */
public class Boletin20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Libro> libro = new ArrayList();
        Metodos obx = new Metodos();
        int resposta;

        do {
            System.out.println("\nQue queres facer?"
                    + "\n 1.-Crear libro."
                    + "\n 2.-Vender libro."
                    + "\n 3.-Mostrar libros."
                    + "\n 4.-Dar de baixa un libro se has unidades son 0."
                    + "\n 5.-Ordenar."
                    + "\n 0.-Saír.");
            Scanner sc = new Scanner(System.in);
            resposta = sc.nextInt();
            switch (resposta) {
                case 1:
                    libro.add(obx.crearLibro());
                    break;
                case 2:
                    obx.venderLibro(libro);
                    break;
                case 3:
                    obx.amosar(libro);
                    break;
                case 4:
                    obx.darBaixa(libro);
                    break;
                case 5:
                    obx.consultarLibro(libro);
                    break;
            }
        } while (resposta != 0);

    }

}
