/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_logica;

import java.util.Scanner;

/**
 *
 * @author Aaron Rojas Vera
 */
public class Conjunto {
    private int numero1;
    private int numero2;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void leer(){
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese numero 01: ");
        numero1 = leer.nextInt();
        System.out.print("Ingrese numero 02: ");
        numero2 = leer.nextInt();
    }
}
