import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WEB1-09
 */
public class Clase13_arrays_01 {
    
    public static void main(String[] args) {
        System.out.println("Empezamos");
        //ejem1();
        //ejer1();
        //ejer2();
        //ejer3();
        //ejer4();
        //ejer5();
        //ejem2();
        //ejem3();
        //ejem4();
        //ejer6();
        //ejer7();
        //ejer8();
        ejer9();
        
        System.out.println("Fin");
    }
    
    public static void ejem1() {
        int a = 5;
        int arr_1[]; // Declaración
        arr_1 = new int [10]; // Reserva en memoría
        arr_1[0] = 5;
        arr_1[9] = 15;
        // Mostramos el array
        for (int i=0; i < arr_1.length; i++) {
                System.out.println(i + ":" + arr_1[i]);
    }
        System.out.println("------------------");
        String lista_cadenas[] = new String[5];
        lista_cadenas[0] = "a";
        lista_cadenas[1] = "b";
        lista_cadenas[2] = "c";
        lista_cadenas[3] = "d";
        lista_cadenas[4] = "e";
        System.out.println(lista_cadenas[3]);
        for (int i=0; i < lista_cadenas.length; i++) {
                System.out.println(i + ":" + lista_cadenas[i]);
    }
}
    public static void ejer1() {
        // Crear un array de 10 posiciones e introducir dentro las posiciones del 1 al 9
        System.out.println("------------------");
        int arr_2[]; // Declaración
        arr_2 = new int [10]; // Reserva en memoría
        // Mostramos el array
        for (int i=0; i < arr_2.length; i++) {
                arr_2[i] = i;
                System.out.println(i + ":" + arr_2[i]);
    }
    }
    public static void ejer2() {
        // Crear un array de 10 posiciones e introducir dentro las posiciones del 1 al 10
        System.out.println("------------------");
        int arr_3[]; // Declaración
        arr_3 = new int [10]; // Reserva en memoría
        arr_3[0] = 1;
        arr_3[1] = 2;
        arr_3[2] = 3;
        arr_3[3] = 4;
        arr_3[4] = 5;
        arr_3[5] = 6;
        arr_3[6] = 7;
        arr_3[7] = 8;
        arr_3[8] = 9;
        arr_3[9] = 10;
        for (int i=0; i < arr_3.length; i++) {
                System.out.println(i + ":" + arr_3[i]);
        }
    }
    public static void ejer3() {
    // Crear un array de 10 posiciones e introducir dentro las posiciones del 1 al 10
    System.out.println("------------------");
    int arr_4[]; // Declaración
    arr_4 = new int [10]; // Reserva en memoría
    arr_4[0] = 10;
    arr_4[1] = 9;
    arr_4[2] = 8;
    arr_4[3] = 7;
    arr_4[4] = 6;
    arr_4[5] = 5;
    arr_4[6] = 4;
    arr_4[7] = 3;
    arr_4[8] = 2;
    arr_4[9] = 1;
    for (int i=0; i < arr_4.length; i++) {
            System.out.println(i + ":" + arr_4[i]);
}
    for (int i = 0, j = 10; i < arr_4.length; i++, j--)
        arr_4[i] = j;
}
        
    public static void ejer4() {
    System.out.println("------------------");
    int arr_5[]; // Declaración
    arr_5 = new int [10]; // Reserva en memoría
    for (int i = 0; i < arr_5.length; i++) {
        arr_5[i] = (int) Math.random()*10;
        System.out.println(i + ":" + arr_5[i]);
    }
}
    public static void ejer5() {
    /* Rellenar un array con numeros introducidos por el usuario */
    System.out.println("------------------");
    Scanner sc = new Scanner (System.in);
    int arr_6[]; // Declaración
    arr_6 = new int [5]; // Reserva en memoría
    for (int i = 0; i < arr_6.length; i++) {
        System.out.print("Introduce numero " + i + ": ");
        arr_6[i] = sc.nextInt();
    }
    for (int a = 0; a < arr_6.length; a++) {
        System.out.println(a + ":" + arr_6[a]);
    }
}
    public static void ejem2() {
        System.out.println("------------------");
        int m[][] = new int [3][2];
        int z = 1;
        System.out.println(m.length);
        System.out.println(m[0].length);
        System.out.println(m[1].length);
        System.out.println(m[2].length);
        System.out.println("---------------------");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m [i].length; j++) {
                m[i][j] = z++;
            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m [i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
    public static void ejem3() {
        System.out.println("------------------");
        int m[][] = new int [10][10];
        int z = 1;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m [i].length; j++) {
                m[i][j] = z++;
            }
        }
        m[2][6] = 555555;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m [i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("*********************");
        System.out.println(m[2][6]);
        int m2[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}};
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                System.out.print(m2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(m2[1][1]);
        System.out.println(m2[1][2]);
        System.out.println(m2[1][0]);
        }
    public static void ejem4() {
        int m[][] = new int [10][10];
        int z = 1;
        for (int i = 0; i < m.length;i++) {
            for (int j=0;j<m.length;j++) {
                m[i][j] = z++;
                System.out.print(m[i][j]+"\t");
                //System.out.print((z++)+"\t");
            }
            System.out.println();
        }
        System.out.println("----------------");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m [i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void ejer6() {        
        // Rellenar una matriz 10 x 10 con un numero introducido por un usuario y luego mostrar la matriz
        Scanner sc = new Scanner (System.in);
        int m[][] = new int [10][10];
        System.out.print("Introduce un numero: ");
        int n = sc.nextInt();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m [i].length; j++) {
                m[i][j] = n;
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void ejer7() {
        // Rellenar una matriz de 3x3 con numeors aleatorios, mostrar y sumar todos los elementos de la matriz
        int m[][] = new int [3][3]; // Declaracion de matriz de 3 x 3
        for (int i = 0; i < m.length; i++) { // Pa
            for (int j = 0; j < m [i].length; j++) {
                m[i][j] = (int) (Math.random()*10);
                System.out.print(m[i][j] + "\t");
            }
        }
            System.out.println();
            System.out.println("------------------------");
            for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m [i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
            }
            int suma = 0;
            
            for (int i = 0; i < m.length; i++){
                for (int j = 0; j < m.length; j++) {
                    if (m[i][j] % 2 == 0)
                    suma+= m[i][j];
                }
            }
            System.out.println("La suma es: " + suma);
    }
    public static void ejer8() {
     // Matriz de 5x5 con umeros aleatorios, mostarla, y crearla en una matriz triangular superior y mostrarla
     
     int m[][] = new int [5][5]; // Declaracion de matriz de 5 x 5
        for (int i = 0; i < m.length; i++) { // Pa
            for (int j = 0; j < m [i].length; j++) {
                m[i][j] = (int) (Math.random()*10);
                System.out.print(m[i][j] + "\t");
            }
        }
            System.out.println();
            System.out.println("------------------------");
            
            for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m [i].length; j++) {
                if (i > j)
                    m[i][j] = 0;
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
            }
    }
    public static void ejer9() {
     // Dos matrices con valores aleatorios y calcula en una tercera matriz la suma de las dos primeras
     
     int m[][] = new int [3][3]; // Declaracion de matriz de 3 x 3
     int m2[][] = new int [3][3]; // Declaracion de matriz de 3 x 3
     int m3[][] = new int [3][3]; // Declaracion de matriz de 3 x 3
     System.out.println("Matriz 1");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m [i].length; j++) {
                m[i][j] = (int) (Math.random()*10);
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n");
        System.out.println("Matriz 2");
        for (int i = 0; i < m2.length; i++) { 
            for (int j = 0; j < m2[i].length; j++) {
                m2[i][j] = (int) (Math.random()*10);
                System.out.print(m2[i][j] + "\t");
            }
            System.out.println();
        }
            System.out.println("\n");
            System.out.println("Matriz 3 - Resultado");
            for (int i = 0; i < m3.length; i++) { 
            for (int j = 0; j < m3[i].length; j++) {
                m3[i][j] = m[i][j] += m2[i][j];
                System.out.print(m3[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
