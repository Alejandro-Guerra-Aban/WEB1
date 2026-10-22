import java.util.Scanner;

/**
 * @author WEB1-09
 */
public class ejercicios_bucles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== EJERCICIO 1 y 2: Calificación de notas ===");
        System.out.print("Introduce una nota de un examen (0 a 10): ");
        float notaExamen = scanner.nextFloat();
        
        // Ejercicio 2: Validar si está fuera de rango primero
        if (notaExamen < 0 || notaExamen > 10) {
            System.out.println("Error de calificación: El valor debe estar entre 0 y 10.");
        } else {
            // Ejercicio 1: Usando estructura de bucle/control según tu enfoque
            boolean comprobarNota = true;

            while (comprobarNota) {
                if (notaExamen < 0 || notaExamen > 10) {
                    System.out.println("Error de calificación: El valor debe estar entre 0 y 10.");
                } else if (notaExamen <= 4.99) {
                    System.out.println("Suspenso");
                } else if (notaExamen <= 6.99) {
                    System.out.println("Aprobado");
                } else if (notaExamen <= 8.99) {
                    System.out.println("Notable");
                } else if (notaExamen < 10) {
                    System.out.println("Sobresaliente");
                } else {
                    System.out.println("Matrícula de Honor");
                }

                comprobarNota = false;
            }
        }
        
        System.out.println("\n=== EJERCICIO 3: Mayor, menor o iguales (2 números) ===");
        System.out.print("Introduce el primer número entero: ");
        int primerNumero = scanner.nextInt();
        System.out.print("Introduce el segundo número entero: ");
        int segundoNumero = scanner.nextInt();
        
        if (primerNumero > segundoNumero) {
            System.out.println("El mayor es: " + primerNumero + " y el menor es: " + segundoNumero);
        } else if (segundoNumero > primerNumero) {
            System.out.println("El mayor es: " + segundoNumero + " y el menor es: " + primerNumero);
        } else {
            System.out.println("Los dos números son iguales (" + primerNumero + ")");
        }
        
        System.out.println("\n=== EJERCICIO 4: Mayor de tres números ===");
        System.out.print("Introduce el número 1: ");
        int numeroUno = scanner.nextInt();
        System.out.print("Introduce el número 2: ");
        int numeroDos = scanner.nextInt();
        System.out.print("Introduce el número 3: ");
        int numeroTres = scanner.nextInt();
        
        int numeroMayor = numeroUno;
        if (numeroDos > numeroMayor) numeroMayor = numeroDos;
        if (numeroTres > numeroMayor) numeroMayor = numeroTres;
        System.out.println("El mayor de los tres es: " + numeroMayor);
        
        System.out.println("\n=== EJERCICIO 5: Orden creciente ===");
        System.out.print("Introduce el número 1: ");
        int primerValorCreciente = scanner.nextInt();
        System.out.print("Introduce el número 2: ");
        int segundoValorCreciente = scanner.nextInt();
        System.out.print("Introduce el número 3: ");
        int tercerValorCreciente = scanner.nextInt();
        
        if (primerValorCreciente <= segundoValorCreciente && segundoValorCreciente <= tercerValorCreciente) {
            System.out.println("Están ordenados en orden creciente.");
        } else {
            System.out.println("NO están ordenados en orden creciente.");
        }
        
        System.out.println("\n=== NUEVOS EJERCICIOS (A - L) ===");
        
        // a) Imprimir los números pares desde el 40 hasta el 60, ambos inclusive
        System.out.println("\na) Pares del 40 al 60:");
        for (int i = 40; i <= 60; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // b) Imprimir los números 48, 52, 56, ..., 120
        System.out.println("\nb) Secuencia 48 a 120 (de 4 en 4):");
        for (int i = 48; i <= 120; i += 4) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // c) Calcular e imprimir la suma 1+2+3+4+5+...+50
        int sumaNaturales = 0;
        for (int i = 1; i <= 50; i++) {
            sumaNaturales += i;
        }
        System.out.println("\nc) Suma de 1 a 50 = " + sumaNaturales);
        
        // d) Calcular e imprimir el producto 1*2*3*4*5*...*20
        long productoFactorial = 1; // Usamos long para evitar desbordamiento
        for (int i = 1; i <= 20; i++) {
            productoFactorial *= i;
        }
        System.out.println("d) Producto de 1 a 20 = " + productoFactorial);
        
        // e) Calcular e imprimir la suma 50+48+46+44+...+20
        int sumaDescendentePares = 0;
        for (int i = 50; i >= 20; i -= 2) {
            sumaDescendentePares += i;
        }
        System.out.println("e) Suma 50+48+...+20 = " + sumaDescendentePares);
        
        // f) Programa que imprima los números impares desde el 100 hasta la unidad y calcule su suma
        int sumaImparesDescendente = 0;
        System.out.print("f) Impares del 100 al 1: ");
        for (int i = 99; i >= 1; i -= 2) {
            System.out.print(i + " ");
            sumaImparesDescendente += i;
        }
        System.out.println("\n    Suma de impares = " + sumaImparesDescendente);
        
        // g) Imprimir los números del 1 al 100 y calcular la suma de pares e impares por separado
        int sumaParesTotal = 0, sumaImparesTotal = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sumaParesTotal += i;
            } else {
                sumaImparesTotal += i;
            }
        }
        System.out.println("g) Suma de pares (1-100): " + sumaParesTotal + " | Suma de impares (1-100): " + sumaImparesTotal);
        
        // h) Dos números: Imprimir los que hay entre ellos (desde el menor), contar cuántos hay, cuántos pares y suma de pares
        System.out.println("\nh) Introduce dos números para el rango:");
        System.out.print("Número A: ");
        int numeroA = scanner.nextInt();
        System.out.print("Número B: ");
        int numeroB = scanner.nextInt();
        
        int inicioRango = Math.min(numeroA, numeroB);
        int finRango = Math.max(numeroA, numeroB);
        int totalNumerosRango = 0, cantidadParesRango = 0, sumaParesRango = 0;
        
        System.out.print("Números entre ellos: ");
        for (int i = inicioRango; i <= finRango; i++) {
            System.out.print(i + " ");
            totalNumerosRango++;
            if (i % 2 == 0) {
                cantidadParesRango++;
                sumaParesRango += i;
            }
        }
        System.out.println("\n    Total números: " + totalNumerosRango + " | Pares: " + cantidadParesRango + " | Suma de pares: " + sumaParesRango);
        
        // i) Imprimir y contar los números múltiplos de 3 entre 1 y 100
        int cantidadMultiplosDeTres = 0;
        System.out.print("i) Múltiplos de 3 (1-100): ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                cantidadMultiplosDeTres++;
            }
        }
        System.out.println("\n    Total múltiplos de 3: " + cantidadMultiplosDeTres);
        
        // j) Imprimir, sumar y contar múltiplos de 2 y 3 entre 1 y un número introducido
        System.out.print("\nj) Introduce un número límite para múltiplos de 2 y 3: ");
        int limiteMultiplos = scanner.nextInt();
        int sumaMultiplosComunes = 0, cantidadMultiplosComunes = 0;
        System.out.print("    Números (múltiplos de 2 y 3 a la vez): ");
        for (int i = 1; i <= limiteMultiplos; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
                sumaMultiplosComunes += i;
                cantidadMultiplosComunes++;
            }
        }
        System.out.println("\n    Suma: " + sumaMultiplosComunes + " | Cantidad: " + cantidadMultiplosComunes);
        
        // k) Introducir valores A y B
        System.out.println("\nk) Introduce valores A y B:");
        System.out.print("Valor A: ");
        double valorA = scanner.nextDouble();
        System.out.print("Valor B: ");
        double valorB = scanner.nextDouble();
        
        if (valorA >= valorB) {
            int sumaSecuenciaK = 0;
            for (int i = 10; i <= 50; i += 4) {
                sumaSecuenciaK += i;
            }
            System.out.println("    A >= B -> Suma (10+14+...+50) = " + sumaSecuenciaK);
        }
        if (valorB != 0 && (valorA / valorB) <= 30) {
            double resultadoPotenciasK = Math.pow(valorA, 2) + Math.pow(valorB, 2);
            System.out.println("    A/B <= 30 -> (A^2 + B^2) = " + resultadoPotenciasK);
        }
        
        // l) Introducir valores A, B y C
        System.out.println("\nl) Introduce valores A, B y C:");
        System.out.print("Valor A: ");
        double valorA2 = scanner.nextDouble();
        System.out.print("Valor B: ");
        double valorB2 = scanner.nextDouble();
        System.out.print("Valor C: ");
        double valorC2 = scanner.nextDouble();
        
        if (valorB2 != 0 && (valorA2 / valorB2) > 30) {
            if (valorC2 != 0) {
                double resultadoExpresionL = (valorA2 / valorC2) * Math.pow(valorB2, 3);
                System.out.println("    A/B > 30 -> (A/C) * B^3 = " + resultadoExpresionL);
            } else {
                System.out.println("    Error: C no puede ser cero para la división.");
            }
        } else {
            int sumaCuadradosL = 0;
            for (int i = 2; i <= 30; i += 2) {
                sumaCuadradosL += (int) Math.pow(i, 2);
            }
            System.out.println("    A/B <= 30 -> Suma de cuadrados (2^2+...+30^2) = " + sumaCuadradosL);
        }
    }
}