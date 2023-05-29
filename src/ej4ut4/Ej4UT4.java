/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4ut4;
import java.util.Scanner;
/**
 *
 * @author daniel
 */
public class Ej4UT4 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i = 0;
        int contador = 0;
        while (i<3) {
            int x = sc.nextInt();
            if (x%2 == 0) {
               contador++; 
            }
            i++;   
        }
         System.out.println(contador);
    }
    
}
