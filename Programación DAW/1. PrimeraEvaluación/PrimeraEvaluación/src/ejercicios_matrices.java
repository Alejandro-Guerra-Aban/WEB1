import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WEB1-09
 */
public class ejercicios_matrices {
    public static void main(String[] args) {
        System.out.println("Empezamos");
        Scanner sc = new Scanner(System.in);
        System.out.println(" - MENU -");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("6. Ejercicio 6");
        System.out.println("7. Ejercicio 7");
        System.out.println("8. Ejercicio 8");
        System.out.println("9. Ejercicio 9");
        System.out.println("10. Ejercicio 10");
        System.out.println("11. Ejercicio 11");
        System.out.print("\nIntroduce opcion: ");
        byte opcion = sc.nextByte();
        switch(opcion) {
            case 1:
                ejercicio1();
                break;
            case 2:
                ejercicio2();
                break;
            case 3:
                ejercicio3();
                break;
            case 4:
                ejercicio4();
                break;
            case 5:
                ejercicio5();
                break;
            case 6:
                ejercicio6();
                break;
            case 7:
                ejercicio7();
                break;
            case 8:
                ejercicio8();
                break;
            case 9:
                ejercicio9();
                break;
            case 10:
                ejercicio10();
                break;
            case 11:
                ejercicio11();
                break;
        }
        System.out.println("\nFin");
    }
        public static void ejercicio1() {
        // 1 - Rellenar y mostrar una matriz de tamaño 10x10 con numeros del 1 al 100
        int m1[][] = new int[10][10];
        int contador = 1;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1 [i].length; j++) {
                m1[i][j] = contador;
                contador++;
                System.out.print(m1[i][j] + "\t");
            }
            System.out.println();
        }
    }
        public static void ejercicio2() {
        // 2 - Rellenar y mostrar una matriz de tamaño 10x10 con numeros del 100 al 1
        int m2[][] = new int[10][10];
        int contador = 100;
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2 [i].length; j++) {
                m2[i][j] = contador;
                contador--;
                System.out.print(m2[i][j] + "\t");
            }
            System.out.println();
        }
    }
        public static void ejercicio3() {
        // 3 - Rellenar y mostrar una matriz de tamaño 5x3 con numeros pares aleatorios de entre 2 y 20
        int m3[][] = new int[5][3];
        for (int i = 0; i < m3.length; i++) {
            for (int j = 0; j < m3 [i].length; j++) {
                m3[i][j] = (int) (Math.random() * 10 + 1) * 2;
                System.out.print(m3[i][j] + "\t");
            }
            System.out.println();
        }
    }
        public static void ejercicio4() {
        // 4 - Rellenar y mostrar una matriz de tamaño 5x5 con numeros aleatorios. A continuación, calcula y muestra la suma de todos sus elementos
        
        int m4[][] = new int[5][5];
        int suma = 0;

        for (int i = 0; i < m4.length; i++) {
            for (int j = 0; j < m4[i].length; j++) {
                m4[i][j] = (int) (Math.random() * 100 + 1);
                System.out.print(m4[i][j] + "\t");

                suma = suma + m4[i][j];
            }
            
            System.out.println();
        }

        System.out.println("La suma de todos los elementos es: " + suma);
    }
        public static void ejercicio5() {
        // 5 - Rellenar y mostrar una matriz de tamaño 5x5 con numeros aleatorios. A continuación, calcula y muestra la suma de los numeros impares
        int m5[][] = new int[5][5];
        int suma = 0;

        for (int i = 0; i < m5.length; i++) {
            for (int j = 0; j < m5[i].length; j++) {
                m5[i][j] = (int) (Math.random() * 100 + 1);
                System.out.print(m5[i][j] + "\t");

                if (m5[i][j] % 2 != 0) {
                    suma = suma + m5[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("La suma de los numeros impares es: " + suma);
    }
        public static void ejercicio6() {
        // 6 - Rellenar y mostrar una matriz de tamaño 5x5 con numeros aleatorios. A continuación, pide al usuario un número. El programa deberá indicar TODAS las posiciones donde se encuentre dicho número
        Scanner sc = new Scanner(System.in);

        int m6[][] = new int[5][5];

        for (int i = 0; i < m6.length; i++) {
            for (int j = 0; j < m6[i].length; j++) {
                m6[i][j] = (int) (Math.random() * 10 + 1);
                System.out.print(m6[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();

        for (int i = 0; i < m6.length; i++) {
            for (int j = 0; j < m6[i].length; j++) {
                if (m6[i][j] == num) {
                    System.out.println("El numero " + num + " se encuentra en la posicion: [" + i + "][" + j + "]");
                }
            }
        }
    }
        public static void ejercicio7() {
        // 7 - Rellenar y mostrar una matriz de tamaño 5x6 con numeros aleatorios. A continuación, genera una segunda matriz como resultado de trasponer la primera matriz (invertir filas y columnas)
        int m7[][] = new int[5][6];
        int m7_2[][] = new int[6][5];

        // Rellenar y mostrar la primera matriz
        for (int i = 0; i < m7.length; i++) {
            for (int j = 0; j < m7[i].length; j++) {
                m7[i][j] = (int) (Math.random() * 100 + 1);
                System.out.print(m7[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz transpuesta:");

        // Crear y mostrar la segunda matriz
        for (int i = 0; i < m7.length; i++) {
            for (int j = 0; j < m7[i].length; j++) {
                m7_2[j][i] = m7[i][j];
            }
        }

        // Mostrar la matriz transpuesta
        for (int i = 0; i < m7_2.length; i++) {
            for (int j = 0; j < m7_2[i].length; j++) {
                System.out.print(m7_2[i][j] + "\t");
            }
            System.out.println();
        }
    }
        public static void ejercicio8() {
        // 8 - Rellenar y mostrar una matriz de tamaño 5x5 con numeros aleatorios. A continuación, convierte la matriz en una matriz triangular inferior, es decir, pon a cero los elemento de encima de la diagonal
        int m8[][] = new int[5][5];

        // Rellenar y mostrar la matriz
        for (int i = 0; i < m8.length; i++) {
            for (int j = 0; j < m8[i].length; j++) {
                m8[i][j] = (int) (Math.random() * 100 + 1);
                System.out.print(m8[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz triangular inferior:");

        // Poner a cero los elementos encima de la diagonal
        for (int i = 0; i < m8.length; i++) {
            for (int j = 0; j < m8[i].length; j++) {
                if (j > i) {
                    m8[i][j] = 0;
                }
                System.out.print(m8[i][j] + "\t");
            }
            System.out.println();
        }
    }
        public static void ejercicio9() {
        // 9 - Rellenar y mostrar una matriz de tamaño 5x5 con numeros aleatorios. A continuación, crea 2 arrays de 5 elementos y guarda en cada uno la suma de las filas de la matriz y la suma de las columnas
        int m9[][] = new int[5][5];
        int filas[] = new int[5];
        int columnas[] = new int[5];

        // Rellenar y mostrar la matriz
        for (int i = 0; i < m9.length; i++) {
            for (int j = 0; j < m9[i].length; j++) {
                m9[i][j] = (int) (Math.random() * 100 + 1);
                System.out.print(m9[i][j] + "\t");
            }
            System.out.println();
        }

        // Sumar las filas y las columnas
        for (int i = 0; i < m9.length; i++) {
            for (int j = 0; j < m9[i].length; j++) {
                filas[i] = filas[i] + m9[i][j];
                columnas[j] = columnas[j] + m9[i][j];
            }
        }

        // Mostrar la suma de las filas
        System.out.println("Suma de las filas:");
        for (int i = 0; i < filas.length; i++) {
            System.out.println("Fila " + i + ": " + filas[i]);
        }

        // Mostrar la suma de las columnas
        System.out.println("Suma de las columnas:");
        for (int i = 0; i < columnas.length; i++) {
            System.out.println("Columna " + i + ": " + columnas[i]);
        }
    }
        public static void ejercicio10() {
        // 10 - Representa un tablero de ajedrez en una matriz y muestralo por pantalla
            char tablero[][] = new char[8][8];

        // Rellenar el tablero con espacios vacios
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = ' ';
            }
        }

        // Colocar las piezas negras
        tablero[0][0] = 'T';
        tablero[0][1] = 'C';
        tablero[0][2] = 'A';
        tablero[0][3] = 'R';
        tablero[0][4] = 'K';
        tablero[0][5] = 'A';
        tablero[0][6] = 'C';
        tablero[0][7] = 'T';

        // Peones negros
        for (int j = 0; j < 8; j++) {
            tablero[1][j] = 'P';
        }

        // Colocar las piezas blancas
        tablero[7][0] = 't';
        tablero[7][1] = 'c';
        tablero[7][2] = 'a';
        tablero[7][3] = 'r';
        tablero[7][4] = 'k';
        tablero[7][5] = 'a';
        tablero[7][6] = 'c';
        tablero[7][7] = 't';

        // Peones blancos
        for (int j = 0; j < 8; j++) {
            tablero[6][j] = 'p';
        }

        // Mostrar el tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print("[" + tablero[i][j] + "]");
            }
            System.out.println();
        }
    }
        public static void ejercicio11() {
        // 11 - Implementa un movimiento de uno de los peones del tablero
        // Crear el tablero
        char tablero[][] = new char[8][8];

        // Rellenar con espacios vacios
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = ' ';
            }
        }

        // Colocar piezas negras
        tablero[0][0] = 'T';
        tablero[0][1] = 'C';
        tablero[0][2] = 'A';
        tablero[0][3] = 'R';
        tablero[0][4] = 'K';
        tablero[0][5] = 'A';
        tablero[0][6] = 'C';
        tablero[0][7] = 'T';

        // Peones negros
        for (int j = 0; j < 8; j++) {
            tablero[1][j] = 'P';
        }

        // Colocar piezas blancas
        tablero[7][0] = 't';
        tablero[7][1] = 'c';
        tablero[7][2] = 'a';
        tablero[7][3] = 'r';
        tablero[7][4] = 'k';
        tablero[7][5] = 'a';
        tablero[7][6] = 'c';
        tablero[7][7] = 't';

        // Peones blancos
        for (int j = 0; j < 8; j++) {
            tablero[6][j] = 'p';
        }

        // Mover un peon blanco una casilla hacia delante
        tablero[5][0] = tablero[6][0];
        tablero[6][0] = ' ';

        // Mostrar el tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print("[" + tablero[i][j] + "]");
            }
            System.out.println();
        }
    }
}
