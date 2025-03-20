
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Laboratorio
 */
public class Productos {

    private String [] productos;
    private String[] dia = {"Lunes, Martes, Miercoles, Jueves; Viernes"};
    private int [][]ventas;

    public Productos(String[] nombresProductos) {
        this.productos = nombresProductos;
        this.ventas = new int[07][productos.length];
    }
    public void VentasAleatorias () {
        Ramdon rand = new Ramdon();
        for (int i = 0; i <7; i++) {
            for (int j = 0; i <productos.length; j++) {
                int ventas = rand.nextInt(10);
                
        }
        
        }
    
    }
    public int [] calcularVentasPorProducto(){
        int[] totalVentas = new int[productos.length];
        for (int i = 0; i <7; i++) {
            for (int j = 0; i <productos.length; j++) {
                totalVentas[j] += ventas[i][j];
    }
        
        }
        return totalVentas;
     
    }

    private static class Ramdon {

        public Ramdon() {
        }

        private int nextInt(int i) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

}
