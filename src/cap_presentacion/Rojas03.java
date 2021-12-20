/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_presentacion;

import cap_logica.Conjunto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Aaron Rojas Vera
 */
public class Rojas03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Conjunto> conjuntos = new ArrayList<>();
        
        int op;
        
        do{
            op = menu();
             
            switch(op){
                case 1: registrarConjunto(conjuntos);
                    break;
                case 2: mostrarParesConsecutivos(conjuntos);
                    break;
            }
        }while(op != 3);
    }
    
    private static int menu() {
        Scanner leer = new Scanner(System.in);
        
        int opcion;
        
        System.out.println("\n\n");
        System.out.println("---------- MENU ---------- ");
        System.out.println("[1] Registrar Conjunto");
        System.out.println("[2] Mostrar solo los pares consecutivos");
        System.out.println("[3] Salir");      
        
        do{
            System.out.print("  Ingrese Opcion: ");
            opcion = leer.nextInt();
        }while(opcion < 1 || opcion > 3);
        
        return opcion;
    }

    private static void registrarConjunto(ArrayList<Conjunto> auxList) {
        Conjunto conj = new Conjunto();
        
        conj.leer();
        
        auxList.add(conj);
        
        System.out.println("\n * Conjunto registrado exitosamente");
    }

    private static void mostrarParesConsecutivos(ArrayList<Conjunto> auxList) {
        Iterator<Conjunto> elemento;
        
        if(!auxList.isEmpty()){
        
            elemento = auxList.iterator();
            
            System.out.println("\n -- LISTA DE PARES CONSECUTIVOS --");
            while(elemento.hasNext()){
                Conjunto c = elemento.next();
                                 
                if(c.getNumero1() % 2 == 0 && c.getNumero1() + 2 == c.getNumero2()){
                    System.out.println("\tNumero1: " + c.getNumero1() + " - Numero2: " + c.getNumero2());
                }
            }
        }
    }
    
}
