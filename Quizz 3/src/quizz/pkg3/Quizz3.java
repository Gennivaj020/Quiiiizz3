/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizz.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Quizz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] nombreproductos = {"Pan","Mermelada","Jugo", "Huevos"};
        Productos productos = new Productos(nombreproductos);
        productos.VentasAletorias();
    }
    
}
