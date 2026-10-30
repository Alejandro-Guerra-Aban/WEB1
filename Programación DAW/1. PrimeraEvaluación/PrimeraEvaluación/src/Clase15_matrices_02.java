
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author javier.ortiz
 */
public class Clase15_matrices_02 {
    public static void main(String[] args) {
        //ejer4();
        ejer5_SumaMatrices2();
    }
    
    public static void mostrarMatriz(int m[][]) {
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.print(m[i][j]+"\t");
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
    
    public static void ejer5_SumaMatrices2() {
        int m1[][] = new int[5][5];
        int m2[][] = new int[5][5];
        int m3[][] = new int[5][5];
        rellenarMatriz(m1);
        mostrarMatriz(m1);
        System.out.println("-------------------");
        rellenarMatriz(m2);
        mostrarMatriz(m2);
        System.out.println("************************");
        for(int i=0;i<m3.length;i++){
            for(int j=0;j<m3[i].length;j++){
                m3[i][j] = m1[i][j]+m2[i][j];
            }
        }
        mostrarMatriz(m3);
    }
    
    public static void ejer5_SumaMatrices() {
        int m1[][] = new int[5][5];
        int m2[][] = new int[5][5];
        int m3[][] = new int[5][5];
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
                m1[i][j] = (int)(Math.random()*10);
            }
        }
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
                System.out.print(m1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        for(int i=0;i<m2.length;i++){
            for(int j=0;j<m2[i].length;j++){
                m2[i][j] = (int)(Math.random()*10);
            }
        }
        for(int i=0;i<m2.length;i++){
            for(int j=0;j<m2[i].length;j++){
                System.out.print(m2[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("************************");
        for(int i=0;i<m3.length;i++){
            for(int j=0;j<m3[i].length;j++){
                m3[i][j] = m1[i][j]+m2[i][j];
            }
        }
        for(int i=0;i<m3.length;i++){
            for(int j=0;j<m3[i].length;j++){
                System.out.print(m3[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
    public static void ejer4() {
        int m1[][] = new int[5][5];
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
                m1[i][j] = (int)(Math.random()*10);
            }
        }
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
                System.out.print(m1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("------------");
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
                if(i>j)
                    m1[i][j]=0;
            }
        }
        
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
                System.out.print(m1[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
    public static void ejer3() {
        int m1[][] = new int[3][3];
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
                m1[i][j] = (int)(Math.random()*10);
            }
        }
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
                System.out.print(m1[i][j]+"\t");
            }
            System.out.println();
        }
        int suma = 0;
        
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
                if(m1[i][j]%2==0)
                    suma += m1[i][j];
            }
        }
        System.out.println("La suma es:"+suma);
    }
    
    public static void ejer2() {
        int m1[][] = new int[3][3];
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
                m1[i][j] = (int)(Math.random()*10);
            }
        }
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
                System.out.print(m1[i][j]+"\t");
            }
            System.out.println();
        }
        int suma = 0;
        
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
                suma += m1[i][j];
            }
        }
        System.out.println("La suma es:"+suma);
    }
    
    public static void ejer1() {
        Scanner sc = new Scanner(System.in);
        int m1[][] = new int[10][10];
        System.out.println("Introduce un numero:");
        int num=sc.nextInt();
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
                m1[i][j] = num;
            }
        }
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
                System.out.print(m1[i][j]+"\t");
            }
            System.out.println();
        }
        
    }
}
