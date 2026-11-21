import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WEB1-09
 */
public class Clase19_Cadenas_02 {
    
    public static void main(String[] args) {
        System.out.println("Empezamos");
        // ejer1();
        // ejer2();
        // ejer3();
        System.out.println(esNumero("1234"));
        System.out.println(esNumero("1234asd"));
        System.out.println(eliminarVocales("Cadena de prueba"));
        String va = "valo9r";
        String cadena = new String ("valor");
        System.out.println(eliminarVocales(va));
        System.out.println(eliminarVocales(cadena));
        System.out.println("-----------------------");
        System.out.println(eliminarVocales2("Cadena de prueba"));
        System.out.println("Cadena de pruebaaaaa".replace("aa", "a"));
        System.out.println("." + ultimaMayuscula("Cadena de          prueba") + ".");
        System.out.println("Fin");
    }
    
    // Escribir un metodo que reciba una frase y ponga a mayúsculas la última letra de cada palabra. El resto de la palabra debe quedar en minúsucla
    // EJEMPLO: "CADENA DE PRUEBA" -> "cadenA dE pruebA"
    
    public static String ultimaMayuscula(String cadena) {
        String aux = "";
        // Pasar todo a minusuclas
        cadena = cadena.toLowerCase();
        //Separar las palabras de la cadena
        String palabras[] = cadena.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            // Extraer el ultimo caracter y pasarlo a mayuscula de cada palabra
            char letra = palabras[i].charAt(palabras[i].length()-1);
            // Psarlo a mayúsculas cada letra de cada palabra
            letra = Character.toUpperCase(letra);
            // Juntar caracter con el resto de la palabra
            String resto = palabras[i].substring(0, palabras[i].length()-1);
            resto = resto + letra;
            // Crear frase
            aux = aux + resto + " ";
        }
        // Devolver sin espacio de sobra del final
        return aux.trim();
    }
    
    public static String eliminarVocales2(String valor) {
        String aux = "";
        char letras [] = valor.toCharArray();
        for (int i = 0; i < letras.length; i ++) {
            char c = letras[i];
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
             aux = aux + letras[i];   
            }
        }
        
        return aux;
        }
    
    // Metodo que reciba una cadena (String) y devuelva la misma cadena pero con las vocales borradas
    public static String eliminarVocales(String valor) {
        // Cadena de prueba -> Cdn d prb
        valor = valor.replace("a", " ");
        valor = valor.replace("e", " ");
        valor = valor.replace("i", " ");
        valor = valor.replace("o", " ");
        valor = valor.replace("u", " ");
        valor = valor.replace("A", " ");
        valor = valor.replace("E", " ");
        valor = valor.replace("I", " ");
        valor = valor.replace("O", " ");
        valor = valor.replace("U", " ");
        
        return valor;
        }
    
    public static void ejer3() {
        String cadena = "Cadena de texto";
        System.out.println("La cadena de texto sin vocales seria: " + eliminarVocales(cadena));
    }
    
    public static boolean esNumero(String valor) {
        boolean esNum = true;
        char digitos[] = valor.toCharArray();
        for (int i = 0; i < digitos.length && esNum; i++) {
        if (!Character.isDigit(digitos[i])) {
            esNum = false;
        }
    }
        
        return esNum;
    }
    
    public static void ejer2() {
        // Hacer una versión complicada de una suma de dos números introducidos por el usuario comprobando que sean números.
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce un numero: ");
        String valor1 = sc.nextLine(); // WRAPPER
        while (!esNumero(valor1)){
            System.out.println("Error: El numero introducido no es un numero valido");
            System.out.print("Introduce un numero: ");
            valor1 = sc.nextLine();
        }
        int num1 = Integer.parseInt(valor1);
        String valor2;
        do {
            System.out.print("Introduce otro numero: ");
            valor2 = sc.nextLine();
            if (!esNumero(valor2)) {
                System.out.println("Error: El numero introducido no es un numero valido");
            }
        } while (!esNumero(valor2));
        int num2 = Integer.parseInt(valor2);       
        System.out.println("El resultado de la suma es: " + (num1 + num2));
    }
    
    public static void ejer1() {
        // Hacer una versión sencilla de la suma de dos números introducidos por el usuario.
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce un numero: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce otro numero: ");
        int num2 = sc.nextInt();
        System.out.println("El resultado de la suma es: " + (num1 + num2));
    }
}
