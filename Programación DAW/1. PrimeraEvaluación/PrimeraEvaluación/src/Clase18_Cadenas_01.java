/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WEB1-09
 */
public class Clase18_Cadenas_01 {

    public static void main(String[] args) {
        System.out.println("Empezamos");
        
        String cadena = "hola mundo";
        String subcadena = "hola";
        // ejem1();
        ejem2();
        System.out.println("La subcadena " + "'" + subcadena + "'" + " aparece " + ejer1(cadena, subcadena) + " veces en la cadena " + "'" + cadena + "'");
        System.out.println("Fin");
    }
    
    public static void ejem2() {
        String nombreCompleto = "Alejandro Guerra Aban";
        String palabras[] = nombreCompleto.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
        System.out.println("Nombre: " + palabras[0]);
        System.out.println("Apellidos: " + palabras[1] + " " + palabras[2]);
    }
    
    // Metodo que reciba una cadena de texto y una subcadena y devuelva en numero de veces que aparece la subcadena de la cadena.
    
    public static int ejer1(String cadena, String subcadena) {
        int contador = 0;
        int posicion = 0;

        do {
            posicion = cadena.indexOf(subcadena,posicion);
            if (posicion != -1) {
                contador++;
                posicion++;
            }
        } while (posicion != -1);
        return contador;
    }

    public static void ejem1() {
        String txt = "Hello World";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt);
        txt = txt.toUpperCase();
        System.out.println(txt);
    }

}
