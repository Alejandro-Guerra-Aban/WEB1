/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase16_metodos_03
 *
 * Ejercicio de MÉTODOS en Java. Conceptos que se practican:
 *  1. Métodos void (muestran algo, no devuelven nada).
 *  2. Métodos con return (devuelven un valor al lugar desde donde se llaman).
 *  3. Parámetros: los valores que se pasan al método al llamarlo.
 *  4. Sobrecarga: varios métodos con el mismo nombre y distintos parámetros.
 *  5. Métodos que crean y devuelven arrays y matrices.
 *  6. Paso de parámetros POR VALOR (tipos primitivos) frente a
 *     paso por REFERENCIA (arrays).
 *
 */

/**
 *
 * @author WEB1-09
 */

public class Clase16_metodos_03 {

    // =====================================================================
    // MÉTODO PRINCIPAL
    // Es el punto de entrada: Java empieza a ejecutar el programa aquí.
    // Las instrucciones se ejecutan de arriba abajo, en orden.
    // =====================================================================
    public static void main(String[] args) {

        // println muestra el texto y después realiza un salto de línea.
        // \n dentro del texto añade un salto de línea extra (deja una línea en blanco).
        System.out.println("========== EMPEZAMOS ==========\n");

        // ---------------------------------------------------------------
        // 1) MÉTODO VOID: suma
        // ---------------------------------------------------------------
        // Pasamos los valores 5 y 7. Se copian en los parámetros n1 y n2.
        // El método calcula la suma y la imprime él mismo.
        // Salida: "Suma: 12"
        suma(5, 7);

        // Declaramos dos variables int en una sola línea.
        // a vale 8 y b vale 2.
        int a = 8, b = 2;

        // Volvemos a llamar a suma, ahora pasando variables en vez de números fijos.
        // Java copia el contenido de a y b en n1 y n2.
        // Salida: "Suma: 10"
        suma(a, b);

        // ---------------------------------------------------------------
        // 2) MÉTODO CON RETURN: suma2
        // ---------------------------------------------------------------
        // suma2 NO imprime nada: devuelve un int. La llamada "se sustituye"
        // por el valor devuelto (10), y ese valor se concatena al texto.
        // Salida: "Suma2 (3, 7): 10"
        System.out.println("Suma2 (3, 7): " + suma2(3, 7));

        System.out.println("\n========== OPERACIONES ==========\n");

        // Guardamos lo que devuelve el método en una variable para poder
        // reutilizarlo después. Aquí la variable "suma" tiene el mismo nombre
        // que el método suma(); es legal porque Java distingue variables y
        // métodos (los métodos siempre llevan paréntesis), aunque no es
        // recomendable porque puede confundir.
        // Salida: "Suma: 10"
        int suma = suma2(a, b);
        System.out.println("Suma: " + suma);

        // 8 - 2 = 6
        int resta = resta(a, b);
        System.out.println("Resta: " + resta);

        // 8 * 2 = 16
        int multiplicacion = multiplicacion(a, b);
        System.out.println("Multiplicacion: " + multiplicacion);

        // División ENTERA: 8 / 2 = 4. Si fuera 7 / 2 daría 3 (se pierde el decimal).
        int division = division(a, b);
        System.out.println("Division: " + division);

        // Resto: 8 % 2 = 0 (la división es exacta).
        int resto = resto(a, b);
        System.out.println("Resto: " + resto);

        // ---------------------------------------------------------------
        // 3) MATRIZ (array de dos dimensiones)
        // ---------------------------------------------------------------
        System.out.println("\n========== MATRIZ ==========\n");

        // crearM construye una matriz de 5 filas x 3 columnas con números
        // aleatorios entre 0 y 100 (ambos incluidos) y la devuelve.
        // La variable m guarda la referencia (la "dirección") de esa matriz.
        int m[][] = crearM(0, 100);

        // Recorre la matriz e imprime una fila por línea.
        // Los valores serán distintos en cada ejecución porque son aleatorios.
        mostarMatriz(m);

        // ---------------------------------------------------------------
        // 4) ARRAY (una dimensión)
        // ---------------------------------------------------------------
        System.out.println("\n========== ARRAY ==========\n");

        // crearArray devuelve un array de 5 enteros aleatorios entre 0 y 100.
        int a1[] = crearArray(0, 100);

        // Imprime los 5 elementos en una sola línea, separados por espacios.
        mostrarArray(a1);

        // ---------------------------------------------------------------
        // 5) PASO POR VALOR (tipos primitivos)
        // ---------------------------------------------------------------
        // Con los tipos primitivos (int, double, boolean...) el método recibe
        // una COPIA del valor. Lo que haga con esa copia no afecta a la
        // variable original del main.
        int var1 = 5, var2 = 10;

        // Salida: "main 5-10"
        System.out.println("main " + var1 + "-" + var2);

        // Dentro de metodo4 se modifican n1 y n2 (las copias), pero var1 y var2 no cambian.
        // Salida dentro del método: "Antes 5-10" y "Despues 6-9".
        metodo4(var1, var2);

        // Siguen valiendo lo mismo que antes -> demuestra el paso por valor.
        // Salida: "main 5-10"
        System.out.println("main " + var1 + "-" + var2);

        // ---------------------------------------------------------------
        // 6) PASO POR REFERENCIA (arrays)
        // ---------------------------------------------------------------
        // Un array es un objeto: la variable lista1 no contiene los números,
        // sino una referencia a la zona de memoria donde están. Al pasarla a
        // un método, se copia la referencia, pero apunta al MISMO array.
        // Por eso los cambios hechos dentro del método SÍ se ven aquí.
        int lista1[] = {1, 2, 3, 4, 5};

        // metodo5 cambia el primer y el último elemento a 55.
        // Ahora lista1 es {55, 2, 3, 4, 55}.
        metodo5(lista1);

        // Suma de todos los elementos: 55 + 2 + 3 + 4 + 55 = 119.
        System.out.println(sumaArrays(lista1));

        // Mensaje final para indicar que el programa ha terminado.
        System.out.println("\n============= FIN =============");
    }

    // =====================================================================
    // MÉTODO SUMA (void)
    // Recibe dos enteros (n1 y n2), calcula la suma y la MUESTRA por pantalla.
    // Al ser void no devuelve nada al main, por lo que no se puede guardar
    // su resultado en una variable.
    // =====================================================================
    public static void suma(int n1, int n2) {

        // Los paréntesis son imprescindibles: sin ellos Java concatenaría
        // el texto con n1 y luego con n2 ("Suma: 57" en vez de "Suma: 12").
        System.out.println("Suma: " + (n1 + n2));
    }

    // =====================================================================
    // MÉTODO SUMA2 (dos enteros)
    // Recibe dos enteros y DEVUELVE su suma (tipo de retorno: int).
    // No imprime nada: quien lo llame decide qué hacer con el resultado
    // (mostrarlo, guardarlo, usarlo en otra operación...).
    // Es más reutilizable que un método void.
    // =====================================================================
    public static int suma2(int n1, int n2) {

        // return devuelve el valor y termina el método.
        return n1 + n2;
    }

    // =====================================================================
    // MÉTODO RESTA
    // Devuelve n1 - n2. El orden importa: resta(8, 2) = 6 pero resta(2, 8) = -6.
    // =====================================================================
    public static int resta(int n1, int n2) {
        return n1 - n2;
    }

    // =====================================================================
    // MÉTODO MULTIPLICACIÓN
    // Devuelve el producto de n1 por n2.
    // =====================================================================
    public static int multiplicacion(int n1, int n2) {
        return n1 * n2;
    }

    // =====================================================================
    // MÉTODO DIVISIÓN (entera)
    // Al dividir dos int, el resultado también es int: se descarta la parte
    // decimal (7 / 2 = 3, no 3.5).
    // OJO: si n2 vale 0 se produce una ArithmeticException ("/ by zero").
    // Una versión más segura comprobaría antes que n2 != 0.
    // =====================================================================
    public static int division(int n1, int n2) {
        return n1 / n2;
    }

    // =====================================================================
    // MÉTODO RESTO (módulo)
    // El operador % devuelve el resto de la división entera.
    // Ejemplos: 8 % 3 = 2, 8 % 2 = 0. Sirve, por ejemplo, para saber si un
    // número es par (n % 2 == 0).
    // =====================================================================
    public static int resto(int n1, int n2) {
        return n1 % n2;
    }

    // =====================================================================
    // MÉTODO CREAR MATRIZ
    // Parámetros:
    //   ini -> valor mínimo de los números aleatorios.
    //   fin -> valor máximo de los números aleatorios.
    // Devuelve una matriz int[5][3] (5 filas, 3 columnas) ya rellenada.
    // =====================================================================
    public static int[][] crearM(int ini, int fin) {

        // Se reserva memoria para 15 enteros (5 x 3), todos a 0 inicialmente.
        int m[][] = new int[5][3];

        // BUCLE EXTERNO: recorre las filas.
        // m.length es el número de filas (5). i va de 0 a 4.
        for (int i = 0; i < m.length; i++) {

            // BUCLE INTERNO: recorre las columnas de la fila i.
            // m[i].length es el número de columnas de esa fila (3). j va de 0 a 2.
            for (int j = 0; j < m[i].length; j++) {

                // FÓRMULA DEL ALEATORIO EN UN RANGO [ini, fin]:
                //  - Math.random() da un double en [0.0, 1.0) (el 1.0 no sale nunca).
                //  - (fin - ini + 1) es la cantidad de valores posibles
                //    (con 0 y 100 son 101 valores).
                //  - Multiplicar nos da un decimal en [0, 101).
                //  - (int) trunca los decimales -> entero entre 0 y 100.
                //  - Sumar ini desplaza el rango a [ini, fin].
                m[i][j] = ini + (int) (Math.random() * (fin - ini + 1));
            }
            // Al acabar el bucle interno la fila está completa; el externo pasa a la siguiente.
        }

        // Devolvemos la referencia a la matriz para usarla desde el main.
        // (Aunque m es una variable local, el objeto matriz sigue existiendo
        // porque el main guarda su referencia.)
        return m;
    }

    // =====================================================================
    // MÉTODO CREAR ARRAY
    // Igual que crearM pero en una dimensión: 5 enteros aleatorios en [ini, fin].
    // =====================================================================
    public static int[] crearArray(int ini, int fin) {

        // Array de 5 posiciones (índices 0 a 4).
        int a[] = new int[5];

        // a.length vale 5. Rellenamos posición a posición.
        for (int i = 0; i < a.length; i++) {

            // Misma fórmula de aleatorio en rango que en crearM.
            a[i] = ini + (int) (Math.random() * (fin - ini + 1));
        }

        return a;
    }

    // =====================================================================
    // MÉTODO MOSTRAR MATRIZ
    // (El nombre tiene una errata: "mostar" en lugar de "mostrar". Funciona
    // igual, pero conviene corregirlo para mantener el código legible.)
    // Recibe una matriz y la imprime con una fila por línea.
    // =====================================================================
    public static void mostarMatriz(int m[][]) {

        // Recorremos las filas.
        for (int i = 0; i < m.length; i++) {

            // Recorremos las columnas de la fila i.
            for (int j = 0; j < m[i].length; j++) {

                // print (sin "ln") NO salta de línea, así los elementos de
                // la fila quedan seguidos. \t es una tabulación que alinea las columnas.
                System.out.print(m[i][j] + "\t");
            }

            // Al terminar la fila, saltamos de línea para empezar la siguiente.
            System.out.println();
        }
    }

    // =====================================================================
    // MÉTODO MOSTRAR ARRAY
    // Recibe un array y muestra todos sus elementos en una sola línea.
    // =====================================================================
    public static void mostrarArray(int a[]) {

        for (int i = 0; i < a.length; i++) {
            // Cada número seguido de un espacio, sin salto de línea.
            System.out.print(a[i] + " ");
        }

        // Un único salto de línea al final, para que lo siguiente
        // que se imprima empiece en una línea nueva.
        System.out.println();
    }

    // =====================================================================
    // SOBRECARGA DE suma2 (1): TRES ENTEROS
    // SOBRECARGA = varios métodos con el MISMO nombre pero distinta lista de
    // parámetros (distinto número o distinto tipo). Java elige cuál ejecutar
    // según los argumentos de la llamada: suma2(1, 2) usa la versión de dos
    // enteros, suma2(1, 2, 3) usa esta.
    // Importante: NO basta con cambiar el tipo de retorno para sobrecargar.
    // =====================================================================
    public static int suma2(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    // =====================================================================
    // SOBRECARGA DE suma2 (2): DOS FLOAT
    // Se distingue de suma2(int, int) por el TIPO de los parámetros.
    // Ejemplo: suma2(1.5f, 2.7f) -> 4.2 -> (int) -> 4.
    // =====================================================================
    public static int suma2(float n1, float n2) {

        // (int) hace un casting que TRUNCA el decimal (no redondea):
        // 4.9 se convierte en 4, no en 5.
        return (int) (n1 + n2);
    }

    // =====================================================================
    // MÉTODO MOSTRAR (índice: valor)
    // Imprime cada elemento del array junto a su posición, uno por línea.
    // Ejemplo con {7, 9}:  0:7  y  1:9
    // Nota: en este programa no se llama desde el main; está definido para practicar.
    // =====================================================================
    public static void mostrar(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println(i + ":" + lista[i]);
        }
    }

    // =====================================================================
    // PARÁMETROS POR VALOR (tipos primitivos)
    // n1 y n2 son COPIAS de var1 y var2 del main. Modificarlas aquí no
    // altera las variables originales.
    // =====================================================================
    public static void metodo4(int n1, int n2) {
        System.out.println("Antes");
        System.out.println(n1 + "-" + n2);   // 5-10

        n1++;   // la copia pasa de 5 a 6
        n2--;   // la copia pasa de 10 a 9

        System.out.println("Despues");
        System.out.println(n1 + "-" + n2);   // 6-9
        // Al terminar el método, n1 y n2 desaparecen; var1 y var2 siguen en 5 y 10.
    }

    // =====================================================================
    // PARÁMETROS POR REFERENCIA (arrays)
    // 'lista' recibe una copia de la REFERENCIA al array original, así que
    // ambas apuntan al mismo array en memoria. Modificar sus elementos aquí
    // SÍ cambia el array del main.
    // (Si hiciéramos lista = new int[3], solo cambiaría la copia local de la
    // referencia y el main no notaría nada.)
    // =====================================================================
    public static void metodo5(int lista[]) {

        // Primer elemento (índice 0).
        lista[0] = 55;

        // Último elemento: el índice es length - 1 porque se empieza a contar en 0.
        lista[lista.length - 1] = 55;
    }

    // =====================================================================
    // MÉTODO SUMA ARRAYS
    // Suma todos los valores de un array y devuelve el total.
    // Con {55, 2, 3, 4, 55} devuelve 119.
    // =====================================================================
    public static int sumaArrays(int array[]) {

        // ACUMULADOR: variable que va guardando el total parcial.
        // Debe iniciarse en 0 (elemento neutro de la suma).
        // Tiene el mismo nombre que el método, lo cual es legal pero poco claro;
        // sería mejor llamarla "total".
        int sumaArrays = 0;

        // Recorremos todas las posiciones, de 0 a length - 1.
        for (int i = 0; i < array.length; i++) {

            // += es la forma abreviada de: sumaArrays = sumaArrays + array[i];
            sumaArrays += array[i];
        }

        // Devolvemos el total acumulado.
        return sumaArrays;
    }
}
