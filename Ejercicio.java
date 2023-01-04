/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;

/**
 *
 * @author Zlex
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        suma3(10, 20, 30);
        coche miCoche = new coche();
        miCoche.CrearPuerta();
        System.out.println(miCoche.numero_puertas);
    }
    
    public static void suma3(int a, int b, int c){
                int total;
                total = a + b + c;
                System.out.println(total);

    }
}
