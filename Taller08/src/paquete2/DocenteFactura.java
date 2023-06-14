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
public class DocenteFactura extends Ejecutor {
    private double valorFactura;
    private double valorIvaDescuento;
    private double valorCancelar;

    public void datosFactura() {
        super.datosDocente();
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(US);
        System.out.print("Ingrese el valor de la factura: ");
        valorFactura = entrada.nextDouble();
        System.out.print("Ingrese el valor del IVA: ");
        valorIvaDescuento = entrada.nextDouble();
    }

    public void calcularTotalCancelar() {
        valorCancelar = valorFactura + valorIvaDescuento;
    }

    public void impTotalCancelar() {
        System.out.println("Total a cancelar: " + valorCancelar);
        System.out.println("=======================================");
    }

    public void impDato() {
        System.out.printf("Valor de la factura: %.2f\n"
                + "Valor del IVA: %.2f\n",
                valorFactura,
                valorIvaDescuento);
    }
    
}
