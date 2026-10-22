import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WEB1-09
 */
public class ejercicios_estructura_decision {
    public static void main(String[] args) {
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
        System.out.println("12. Ejercicio 12");
        System.out.println("13. Ejercicio 13");
        System.out.println("14. Ejercicio 14");
        System.out.println("15. Ejercicio 15");
        System.out.println("16. Ejercicio 16");
        System.out.println("17. Ejercicio 17");
        System.out.println("18. Ejercicio 18");
        System.out.println("19. Ejercicio 19");
        System.out.println("20. Ejercicio 20");
        System.out.println("21. Ejercicio 21");
        System.out.println("22. Ejercicio 22");
        System.out.println("23. Ejercicio 23");
        System.out.println("24. Ejercicio 24");
        System.out.println("\nIntroduce opcion: ");
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
            case 12:
                ejercicio12();
                break;
            case 13:
                ejercicio13();
                break;
            case 14:
                ejercicio14();
                break;
            case 15:
                ejercicio15();
                break;
            case 16:
                ejercicio16();
                break;
            case 17:
                ejercicio17();
                break;
            case 18:
                ejercicio18();
                break;
            case 19:
                ejercicio19();
                break;
            case 20:
                ejercicio20();
                break;
            case 21:
                ejercicio21();
                break;
            case 22:
                ejercicio22();
                break;
            case 23:
                ejercicio23();
                break;
            case 24:
                ejercicio24();
                break;
        }
}
    
    public static void ejercicio1() {
        // 1. Que pida un número del 1 al 5 y diga si es primo o no.
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero del 1 al 5: ");
        int numero = sc.nextInt();
        if (numero == 2) {
            System.out.println("Es primo");
        }
        else if (numero == 3) {
        System.out.println("Es primo");
        }
        else if (numero == 5) {
        System.out.println("Es primo");
        }
        else {
            System.out.println("Es natural");
        }
    }
    
    public static void ejercicio2() {
        // 2. Que pida un número y diga si es par o impar.
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        byte numero2 = sc.nextByte();
        if (numero2%2==0) { // Precedencia de operadores
            System.out.println("Es par");
        }
        else {
            System.out.println("Es impar");
        }
    }
    
    public static void ejercicio3() {
        // 3. Que pida un número del 1 al 7 y diga el día de la semana correspondiente.
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un numero del 1 al 7: ");
        int dia = sc.nextInt();
        if (dia == 1) {
            System.out.println("Lunes");
        }
        else if (dia == 2) {
        System.out.println("Martes");
        }
        else if (dia == 3) {
        System.out.println("Miércoles");
        }
        else if (dia == 4) {
        System.out.println("Jueves");
        }
        else if (dia == 5) {
        System.out.println("Viernes");
        }
        else if (dia == 6) {
        System.out.println("Sábado");
        }
        else if (dia == 7) {
        System.out.println("Domingo");
        }
        else {
            System.out.println("No es un día de la semana");
        }
    }
    
    public static void ejercicio4() {
        // 4. Que pida un número del 1 al 12 y diga el nombre del mes correspondiente.
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero del 1 al 12: ");
        int mes = sc.nextInt();
        if (mes == 1) {
            System.out.println("Enero");
        }
        else if (mes == 2) {
        System.out.println("Febrero");
        }
        else if (mes == 3) {
        System.out.println("Marzo");
        }
        else if (mes == 4) {
        System.out.println("Abril");
        }
        else if (mes == 5) {
        System.out.println("Mayo");
        }
        else if (mes == 6) {
        System.out.println("Junio");
        }
        else if (mes == 7) {
        System.out.println("Julio");
        }
        else if (mes == 8) {
        System.out.println("Agosto");
        }
        else if (mes == 9) {
        System.out.println("Septiembre");
        }
        else if (mes == 10) {
        System.out.println("Octubre");
        }
        else if (mes == 11) {
        System.out.println("Noviembre");
        }
        else if (mes == 12) {
        System.out.println("Diciembre");
        }        
        else {
            System.out.println("No es un numero de mes valido");
        }
    }
    public static void ejercicio5() {
        // 5. Que pida 3 números y los muestre en pantalla de menor a mayor.
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tres numeros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                System.out.println(num1 + " " + num2 + " " + num3);
            } else {
                System.out.println(num1 + " " + num3 + " " + num2);
            }
        } 
        else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                System.out.println(num2 + " " + num1 + " " + num3);
            } else {
                System.out.println(num2 + " " + num3 + " " + num1);
            }
        } 
        else {
            if (num1 <= num2) {
                System.out.println(num3 + " " + num1 + " " + num2);
            } else {
                System.out.println(num3 + " " + num2 + " " + num1);
            }
        }
    }
    public static void ejercicio6() {
        // 6. Que pida 3 numeros y los muestre en pantalla de mayor a menor.
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tres numeros: ");
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        int num6 = sc.nextInt();

        if (num4 >= num5 && num4 >= num6) {
            if (num5 >= num6) {
                System.out.println(num4 + " " + num5 + " " + num6);
            } else {
                System.out.println(num4 + " " + num6 + " " + num5);
            }
        } 
        else if (num5 >= num4 && num5 >= num6) {
            if (num4 >= num6) {
                System.out.println(num5 + " " + num4 + " " + num6);
            } else {
                System.out.println(num5 + " " + num6 + " " + num4);
            }
        } 
        else {
            if (num4 >= num5) {
                System.out.println(num6 + " " + num4 + " " + num5);
            } else {
                System.out.println(num6 + " " + num5 + " " + num4);
            }
        }
    }
    public static void ejercicio7(){
        // 7. Que pida 3 numeros y los muestre en pantalla de mayor a menor en lineas distintas. En caso de haber numeros iguales se pintan en la misma linea.
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tres numeros: ");
        int num7 = sc.nextInt();
        int num8 = sc.nextInt();
        int num9 = sc.nextInt();

        if (num7 == num8 && num8 == num9) {
            System.out.println(num7 + " " + num8 + " " + num9);
        } 
        
        else if (num7 == num8) {
            if (num7 > num9) {
                System.out.println(num7 + " " + num8);
                System.out.println(num9);
            } else {
                System.out.println(num9);
                System.out.println(num7 + " " + num8);
            }
        } 

        else if (num7 == num9) {
            if (num7 > num8) {
                System.out.println(num7 + " " + num9);
                System.out.println(num8);
            } else {
                System.out.println(num8);
                System.out.println(num7 + " " + num9);
            }
        } 

        else if (num8 == num9) {
            if (num8 > num7) {
                System.out.println(num8 + " " + num9);
                System.out.println(num7);
            } else {
                System.out.println(num7);
                System.out.println(num8 + " " + num9);
            }
        } 

        else {
            if (num7 > num8 && num7 > num9) {
                System.out.println(num7);
                if (num8 > num9) {
                    System.out.println(num8);
                    System.out.println(num9);
                } else {
                    System.out.println(num9);
                    System.out.println(num8);
                }
            } 
            else if (num8 > num7 && num8 > num9) {
                System.out.println(num8);
                if (num7 > num9) {
                    System.out.println(num7);
                    System.out.println(num9);
                } else {
                    System.out.println(num9);
                    System.out.println(num7);
                }
            } 
            else {
                System.out.println(num9);
                if (num7 > num8) {
                    System.out.println(num7);
                    System.out.println(num8);
                } else {
                    System.out.println(num8);
                    System.out.println(num7);
                }
            }
        }
    }
    public static void ejercicio8(){
        // 8. Que pida un numero y diga si es positivo o negativo.
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int positivonegativo = sc.nextInt();
        if (positivonegativo > 0) {
            System.out.println("El numero es positivo");
        }
        else if (positivonegativo == 0){
            System.out.println("El 0 es un numero neutro, es decir, no es ni positivo ni negativo");
        }
        else {
            System.out.println("El numero es negativo");
        }
    }
    public static void ejercicio9(){
        // 9. Que solo permita introducir los caracteres S y N.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un caracter: ");
        sc.nextLine();
        String caracter1 = sc.next();
        if (caracter1.equals("S") || caracter1.equals("N")) {
            System.out.println("El caracter introducido es valido");
        }
        else {
            System.out.println("El caracter introducido es invalido, solo puedes insertar caracteres S y N");
        }
    }
    public static void ejercicio10(){
        // 10. Que pida un numero y diga si es mayor de 100.
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numeromayor100 = sc.nextInt();
        if (numeromayor100 > 100) {
            System.out.println("El numero: " + numeromayor100 + " es mayor que 100");
        }
        else {
            System.out.println("El numero: " + numeromayor100 + " es menor que 100");
        }
    }
    public static void ejercicio11(){
        // 11. Que pida una letra y detecte si es una vocal.
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una letra: ");
        sc.nextLine();
        String letra11 = sc.nextLine();
        if (letra11 == "a" && letra11 == "e" && letra11 == "i" && letra11 == "o" && letra11 == "u" && letra11 == "A" && letra11 == "E" && letra11 == "I" && letra11 == "O" && letra11 == "U") {
            System.out.println("La letra introducida es una vocal");
        }
        else {
            System.out.println("La letra introducida es una consontante");
        }
    }
    public static void ejercicio12() {
        // 12. Que pida tres numeros y detecte si se han introducido en orden creciente.
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tres numeros: ");
        int numero4 = sc.nextInt();
        int numero5 = sc.nextInt();
        int numero6 = sc.nextInt();
        if (numero4 < numero5 && numero5 < numero6) {
            System.out.println("Los numeros han sido introducidos en orden creciente");
        }
        else {
            System.out.println("Los numeros no han sido introducidos en orden creciente");
        }
    }
    public static void ejercicio13() {
        // 13. Que pida tres numeros y detecte si se han introducido en orden decreciente.
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tres numeros: ");
        int numero7 = sc.nextInt();
        int numero8 = sc.nextInt();
        int numero9 = sc.nextInt();
        if (numero7 > numero8 && numero8 > numero9) {
            System.out.println("Los numeros han sido introducidos en orden decreciente");
        }
        else {
            System.out.println("Los numeros no han sido introducidos en orden decreciente");
        }
    }
    public static void ejercicio14() {
        // 14. Que pida 10 numeros y diga cual es el mayor y cual el menor.
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce 10 numeros: ");
        int ejer14num1 = sc.nextInt();
        int mayor = ejer14num1;
        int menor = ejer14num1;
        
        int ejer14num2 = sc.nextInt();
        mayor = Math.max(mayor, ejer14num2);
        menor = Math.min(menor, ejer14num2);
        
        int ejer14num3 = sc.nextInt();
        mayor = Math.max(mayor, ejer14num3);
        menor = Math.min(menor, ejer14num3);
        
        int ejer14num4 = sc.nextInt();
        mayor = Math.max(mayor, ejer14num4);
        menor = Math.min(menor, ejer14num4);
        
        int ejer14num5 = sc.nextInt();
        mayor = Math.max(mayor, ejer14num5);
        menor = Math.min(menor, ejer14num5);
        
        int ejer14num6 = sc.nextInt();
        mayor = Math.max(mayor, ejer14num6);
        menor = Math.min(menor, ejer14num6);
        
        int ejer14num7 = sc.nextInt();
        mayor = Math.max(mayor, ejer14num7);
        menor = Math.min(menor, ejer14num7);
        
        int ejer14num8 = sc.nextInt();
        mayor = Math.max(mayor, ejer14num8);
        menor = Math.min(menor, ejer14num8);
        
        int ejer14num9 = sc.nextInt();
        mayor = Math.max(mayor, ejer14num9);
        menor = Math.min(menor, ejer14num9);
        
        int ejer14num10 = sc.nextInt();
        mayor = Math.max(mayor, ejer14num10);
        menor = Math.min(menor, ejer14num10);
        
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }
    public static void ejercicio15() {
        // 15. Que pida tres numeros e indicar si el tercero es igual a la suma del primero y el segundo.
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tres numeros: ");
        
        int ejer15num1 = sc.nextInt();
        int ejer15num2 = sc.nextInt();
        int ejer15num3 = sc.nextInt();
        
        if ((ejer15num1 + ejer15num2) == ejer15num3) {
            System.out.println("La suma del los dos primeros numeros coincide con el tercer numero insertado");
        }
        else {
            System.out.println("La suma de los dos primeros numeros no coincide con el tercer numero insertado");
        }
    }
    public static void ejercicio16() {
        // 16. Que muestre un menu que contemple las opciones Archivo, Buscar y Salir, en caso de que no se introduzca una opcion correcta se notificara por pantalla.
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Archivo");
        System.out.println("2. Buscar");
        System.out.println("3. Salir");
        System.out.print("Introduce una opcion: ");
        
        byte opcion = sc.nextByte();
        if (opcion == 1) {
            System.out.println("Opcion Archivo");
        }
        else if (opcion == 2) {
            System.out.println("Opcion Buscar");
        }
        else if (opcion == 3) {
            System.out.println("Salida");
        }
        else {
            System.out.println("La opcion introducida no es valida");
        }
    }
    public static void ejercicio17() {
        // 17. Que tome dos numeros del 1 al 5 y diga si ambos son primos.
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce dos numeros del 1 al 5: ");
        int ejer17num1 = sc.nextInt();
        int ejer17num2 = sc.nextInt();
        
        if (ejer17num1 == 2 && ejer17num2 == 3) {
            System.out.println("Es primo");
        }
        else if (ejer17num1 == 3 && ejer17num2 == 5) {
        System.out.println("Es primo");
        }
        else {
            System.out.println("Los numeros introducidos no son primos");
        }
    }
    public static void ejercicio18() {
        // 18. Que tome dos numeros y diga si ambos son pares o impares.
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce dos numeros: ");
        byte ejer18num1 = sc.nextByte();
        byte ejer18num2 = sc.nextByte();
        
        if (ejer18num1%2==0 && ejer18num2%2 == 0) { // Precedencia de operadores
            System.out.println("Es par");
        }
        else {
            System.out.println("Es impar");
        }
    }
    public static void ejercicio19() {
        // 19. Que tome tres numeros y diga si la multiplicacion de los dos primeros es igual al tercero.
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tres numeros: ");
        byte ejer19num1 = sc.nextByte();
        byte ejer19num2 = sc.nextByte();
        byte ejer19num3 = sc.nextByte();
        
        if (ejer19num1 * ejer19num2 == ejer19num3) {
            System.out.println("La multiplicacion de el primer numero x segundo numero es igual al tercer numero");
        }
        else {
            System.out.println("La multiplicacion de el primer numero x segundo numero es diferente al tercer numero");
        }
    }
    public static void ejercicio20() {
        // 20. Que tome tres numeros y diga si el tercero es el resto de la division de los dos primeros.
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tres numeros: ");
        byte ejer20num1 = sc.nextByte();
        byte ejer20num2 = sc.nextByte();
        byte ejer20num3 = sc.nextByte();
        
        if (ejer20num1 % ejer20num2 == ejer20num3) {
            System.out.println("El resto de la division de el primer numero / segundo numero es igual al tercer numero");
        }
        else {
            System.out.println("El resto de la division de el primer numero / segundo numero es diferente al tercer numero");
        }
    }
    public static void ejercicio21() {
        // 21. Que muestre un menu donde las opciones sean Equilatero, Isosceles y Escaleno, pida una opcion y calcule el perimetro del triangulo seleccionado.
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Equilatero");
        System.out.println("2. Isosceles");
        System.out.println("3. Escaleno");
        
        System.out.print("Selecciona una opcion: ");
        
        int ejer21opcion = sc.nextInt();
        double perimetro = 0;

        if (ejer21opcion == 1) {
            System.out.print("Introduce la medida del lado: ");
            double ladoEquilatero = sc.nextDouble();
            perimetro = 3 * ladoEquilatero;
            System.out.println("El perimetro del triangulo equilatero es: " + perimetro);
        } 
        else if (ejer21opcion == 2) {
            System.out.print("Introduce la medida de los dos lados iguales: ");
            double ladoIsosceles = sc.nextDouble();
            System.out.print("Introduce la medida de la base: ");
            double base = sc.nextDouble();
            perimetro = (2 * ladoIsosceles) + base;
            System.out.println("El perimetro del triangulo isosceles es: " + perimetro);
        } 
        else if (ejer21opcion == 3) {
            System.out.print("Introduce la medida del primer lado: ");
            double lado1 = sc.nextDouble();
            System.out.print("Introduce la medida del segundo lado: ");
            double lado2 = sc.nextDouble();
            System.out.print("Introduce la medida del tercer lado: ");
            double lado3 = sc.nextDouble();
            perimetro = lado1 + lado2 + lado3;
            System.out.println("El perimetro del triangulo escaleno es: " + perimetro);
        } 
        else {
            System.out.println("Opcion no valida.");
        }
    }
    public static void ejercicio22() {
        // 22. Que pase de Kg a otra unidad de medida de masa, mostrar en pantalla un menu con las opciones posibles.
        Scanner sc = new Scanner(System.in);
        // Mostrar el menú en pantalla
        System.out.println("1. Convertir a Gramos");
        System.out.println("2. Convertir a Libras");
        System.out.println("3. Convertir a Onzas");
        System.out.println("4. Convertir a Toneladas");
        System.out.print("Elija una opción (1-4): ");
        int ejer22opcion = sc.nextInt();
        
            System.out.print("Ingrese la cantidad en Kilogramos (kg): ");
            double kg = sc.nextDouble();

            // Realizar las conversiones usando solo if / else if / else
            if (ejer22opcion == 1) {
                double gramos = kg * 1000;
                System.out.println(kg + " kg equivalen a " + gramos + " g");
            } 
            else if (ejer22opcion == 2) {
                double libras = kg * 2.20462;
                System.out.println(kg + " kg equivalen a " + libras + " lb");
            } 
            else if (ejer22opcion == 3) {
                double onzas = kg * 35.274;
                System.out.println(kg + " kg equivalen a " + onzas + " oz");
            } 
            else {
                double toneladas = kg / 1000;
                System.out.println(kg + " kg equivalen a " + toneladas + " t");
            }
    }
    public static void ejercicio23() {
        // 23. Que lea un importe bruto y calcule su importe neto, si es mayor de 15.000 se le aplicara un 16% de impuestos, en caso contrario se le aplicara un 10%.
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce un importe en bruto: ");
            
            double importebruto = sc.nextDouble();
            double importeneto = 0;
            
            if (importebruto > 15000) {
                importeneto = importebruto * 0.84;
            }
            else {
                importeneto = importebruto * 0.90;
            }
            System.out.println("El importe neto es: " + importeneto);
    }
    public static void ejercicio24() {
        // 24. Que lea una hora en hora:minutos:segundos y diga la hora que es un segundo despues.
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce una hora: ");
            int hora = sc.nextInt();
            System.out.print("Introduce los minutos: ");
            int minutos = sc.nextInt();
            System.out.print("Introduce los segundos: ");
            int segundos = sc.nextInt();
            
            segundos ++;
            
            if (segundos >= 60) {
                minutos ++;
            }
            if (minutos > 60) {
                hora ++;
            }
            if (segundos >= 60) {
                segundos = 0;
                minutos ++;
            }
            if (minutos >= 60) {
                minutos = 0;
                hora ++;
            }
            
            System.out.println("La hora despues de un segundo seria: " + hora + ":" + minutos + ":" + segundos);
    }
    
}