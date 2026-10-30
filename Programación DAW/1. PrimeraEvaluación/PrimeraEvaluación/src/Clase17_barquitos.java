/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WEB1-09
 */
public class Clase17_barquitos {

    public static void main(String[] args) {
        System.out.println("Empezamos");
        char[][] tablero = crearTablero(); // Definimos la variable char de tablero para que sea el tablero que hemos creado en el método
        mostrar(tablero); // Llamamos al método mostrar y le pasamos como parametro el tablero que acabamos de crear para poder obtener en la salida el tablero que acabamos de crear
        //jugar_01(tablero);
        jugar_02(tablero);
        System.out.println("------------------------------------");
        mostrar(tablero); // Llamamos al método mostrar y le pasamos como parametro el tablero que acabamos de crear para poder obtener en la salida el tablero que acabamos de crear
        System.out.println("Fin");
    }
    
    public static boolean todosHundidos (char [][] tablero) {
        boolean fin = true;
        for (int i = 0; i < tablero.length && fin; i++) {
            for (int j = 0; j < tablero [i].length && fin; j++) {
                if (tablero[i][j] == '1' || tablero[i][j] == '2' || tablero[i][j] == '3' || tablero[i][j] == '4')
                    fin = false;
            }
        }
        return fin;
    }
    
    public static void jugar_02(char[][] tablero) {
        // Generar tiraradas aleatorias
        // AGUA 'A'
        // TOCADO 'T'
        // JUGAR HASTA TOCAR TODOS LOS BARCOS
        boolean fin = false; // Declarar la variable fin como 
        do {
            int i = (int) (Math.random() * tablero.length);
            int j = (int) (Math.random() * tablero[i].length);
            // System.out.println("Columna: " + j);
            // System.out.println("Fila: " + i);
            System.out.println("Disparo: (" + j + "," + i +")");
            if (tablero[i][j] == '.') {
                tablero[i][j] = 'A';
            } else if (tablero[i][j] == '1' || tablero[i][j] == '2' || tablero[i][j] == '3' || tablero[i][j] == '4') {
                tablero[i][j] = 'T';
            }
            // SI todos hundidos
            if (todosHundidos(tablero)){
                fin = true;
            }
        } while(!fin);
    }
    
    public static void jugar_01(char[][] tablero) {
        // Generar tiraradas aleatorias
        // AGUA 'A'
        // TOCADO 'T'
        // JUGAR HASTA TOCAR SOLO UN BARCO
        boolean fin = false; // Declarar la variable fin como 
        do {
            int i = (int) (Math.random() * tablero.length);
            int j = (int) (Math.random() * tablero[i].length);
            // System.out.println("Columna: " + j);
            // System.out.println("Fila: " + i);
            System.out.println("Disparo: (" + j + "," + i +")");
            if (tablero[i][j] == '.') {
                tablero[i][j] = 'A';
            } else if (tablero[i][j] == '1' || tablero[i][j] == '2' || tablero[i][j] == '3' || tablero[i][j] == '4') {
                tablero[i][j] = 'T';
                fin = true;
            }
        } while(!fin);
 
    }
    
    public static char[][] crearTablero() { // Creación del tablero con una matriz de 10 x 10
     char tablero [][] = { // Definición de la variable tablero de variable char
         {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.', }, // Fila 1
         {'.', '1', '1', '.', '.', '.', '.', '.', '.', '.', }, // Fila 2
         {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.', }, // Fila 3
         {'.', '.', '.', '.', '3', '3', '3', '3', '3', '4', }, // Fila 4
         {'.', '.', '.', '.', '.', '.', '.', '.', '.', '4', }, // Fila 5
         {'.', '.', '2', '.', '.', '.', '.', '.', '.', '4', }, // Fila 6
         {'.', '.', '2', '.', '.', '.', '.', '.', '.', '4', }, // Fila 7
         {'.', '.', '2', '.', '.', '.', '.', '.', '.', '4', }, // Fila 8
         {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.', }, // Fila 9
         {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.', }, // Fila 10
     };
     return tablero;
    }
    public static void mostrar(char[][] tablero) { // Definimos el metodo mostrar para poder mostrar el tablero por la salida
        for (int i = 0; i < tablero.length; i++) { // Para cada valor de i (empezando en 0), si i es menor que la longitud del tablero, se le suma uno a la i.
            for (int j = 0; j < tablero [i].length; j++) { // Para cada valor de j (empezando en 0), si j es menor que la longitud del tablero, se le suma uno a la j.
                System.out.print(tablero[i][j] + "\t"); // Mostrar por pantalla el tablero
            }
            System.out.println(); // Salto de linea
        }
        System.out.println("\n");
    }
}
