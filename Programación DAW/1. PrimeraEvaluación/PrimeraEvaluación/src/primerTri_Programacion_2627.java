/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WEB1-09
 */

/*
* Desarrolla un programa que simule un juego de laberinto donde el jugador debe recolectar monedas mientras evita ser atrapado por enemigos. El juego se desarrolla en un tablero 2D representado por una matriz.
* La posición del protagonista se guardará en un array de 2 valores y las posiciones de los enemigos se guardarán en un array de 3X2 o de 2X3.
*/
public class primerTri_Programacion_2627 {
    public static void main(String[] args) {
        System.out.println("Empezamos");
        char laberinto [][] = crearLaberinto(10, 15);
        mostrarMatriz(laberinto);
        System.out.println("Fin");
    }
    
    public static char[][] crearLaberinto(int filas, int columnas) {
        char[][] laberinto = new char[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int valor = (int) (Math.random()*3);
                if (valor == 0) {
                    laberinto[i][j] = '#'; // Pared
                } else if (valor == 1) {
                    laberinto[i][j] = ' '; // Espacio libre
                } else {
                    laberinto[i][j] = '.'; // Moneda
                }
            }
        }

        return laberinto;
    }

    public static void mostrarMatriz(char m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void rellenarMatriz(int m[][]) {
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                m[i][j] = (int)(Math.random()*10);
            }
        }
    }
}
