/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WEB1-09
 */
public class Clase10_metodos1 {
    
    public static void main(String[] args) {
        System.out.println("Empezamos");
        metodo1();
        metodo1();
        metodo2();
        metodo3();
        ejem1();
        System.out.println("Fin");
    }
    
        public static void metodo1(){
            System.out.println("metodo1");
    }
    
    public static void metodo2(){
            System.out.println("metodo2");
    }
    
    public static void metodo3(){
            System.out.println("metodo3");
            metodo1();
            metodo2();
    }
    
    public static void ejem1() {
        int cont = 0;
        while (cont < 10) {
            System.out.println(cont);
            cont++;
        }
    }
}
