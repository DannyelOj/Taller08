/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import static java.util.Locale.US;
import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class DocenteNombramiento extends Ejecutor {
     private double valorSueldo;
    private double valorHoraExtra;
    private int numeroHorasExtra;
    private double sueldo;

    public void datosDocenteN() {
        super.datosDocente();
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(US);
        System.out.println("Ingrese valor del sueldo: ");
        valorSueldo = entrada.nextDouble();
        System.out.println("Ingrese valor de la hora extra: ");
        valorHoraExtra = entrada.nextDouble();
        System.out.println("Ingrese numero de horas extra: ");
        numeroHorasExtra = entrada.nextInt();
    }

    public void calcularSueldo() {
        sueldo = valorSueldo + (valorHoraExtra * numeroHorasExtra);
    }

    public void salidaDatos() {
        System.out.printf("Valor sueldo: %.2f\n"
                + "Valor de la hora extras: %.2f\n"
                + "Numero de horas extras: %d\n"
                + "El sueldo del docente de nombramiento es: %.2f\n",
                 valorSueldo,
                 valorHoraExtra,
                 numeroHorasExtra,
                 sueldo);
        System.out.println("=======================================");
    }

    
        
    
   
}
