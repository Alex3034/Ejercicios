/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicios;

/**
 *
 * @author Zlex
 */
public class Tema4ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("----If----");
        int numeoIf = 0;
        
        if (numeoIf < 0){
            System.out.println("Negativo");
        }else if (numeoIf > 0){
            System.out.println("Positivo");
        }else {
            System.out.println("Es Zero");
        }
        
        System.out.println("----While----");        
        int numeroWhile = 0;
        
        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        
        System.out.println("----Do-While----");
        int numeroDoWhile = 9;
        
        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        }while(numeroDoWhile < 3);
        
        System.out.println("----For----");
        
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }
        
        System.out.println("----Switch----");
        String estacion = "primavera";
        
        switch(estacion){
            case "verano":
                System.out.println("Verano");
                break;
            case "invierno":
                System.out.println("Invierno");
                break;
            case "otoño":
                System.out.println("Otoño");
                break;
            case "primavera":
                System.out.println("Primavera");
                break;
            default:
                System.out.println("Error");
        }
    }
    
}
