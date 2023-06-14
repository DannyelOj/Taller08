/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    Scanner entrada = new Scanner(System.in);
    private String nombre;
    private String cedula;
    
    public void datosDocente() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del docente: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la cedula del docente: ");
        cedula = entrada.nextLine();
    }

    public void impDatos() {
        System.out.println("=======================================");
        System.out.println("========= DATOS INGRESADOS (: =========");
        System.out.println("=======================================");
        System.out.printf("Nombre del docente: %s\n"
                + "Cedula del docente: %s\n",
                 nombre,
                 cedula);
    }   
}
