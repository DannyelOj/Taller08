/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;
import java.util.Scanner;
import paquete2.*;
/**
 *
 * @author reroes
 */
public class Docente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op;        
        System.out.println("==================================================");
        System.out.println("                Taller8 2-Bim");
        System.out.println("==================================================");
        System.out.println("Ingrese un numero de acuerdo a su requerimiento:\n"
                + "[1]     Docente Nombramiento\n[2]     DocenteFactura");
        System.out.println("==================================================");
        System.out.print("Ingrese aqui el numero: ");
        op = entrada.nextInt();
        
        
        if (op == 1) {
            DocenteNombramiento dN = new DocenteNombramiento();
            System.out.println("=======================================");
            System.out.println("=========  INGRESE LOS DATOS  =========");
            System.out.println("=======================================");
            dN.datosDocenteN();
            dN.calcularSueldo();
            dN.impDatos();
            dN.salidaDatos();
            System.out.println("=======================================");
        } else if (op == 2) {
            DocenteFactura dF = new DocenteFactura();
            System.out.println("=======================================");
            System.out.println("=========  INGRESE LOS DATOS  =========");
            System.out.println("=======================================");
            dF.datosFactura();
            dF.calcularTotalCancelar();
            dF.impDato();
            dF.impTotalCancelar();
            System.out.println("=======================================");
        } else {
            System.out.println("=======================================");
            System.out.println("      ERROR OPCION FUERA DE RANGO      ");
            System.out.println("=======================================");
        }
    }
    
}
