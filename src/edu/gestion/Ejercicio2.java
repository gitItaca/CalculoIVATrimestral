package edu.gestion;
import java.util.ArrayList;
import java.util.List;

import edu.facturacion.*;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Producto leche = new Producto(0.75, "leche", Producto.IVA.SUPERREDUCIDO);
		Producto pan = new Producto(0.5, "pan", Producto.IVA.SUPERREDUCIDO);
		Producto salmon = new Producto(8.99, "salmon", Producto.IVA.NORMAL);
		Producto aguacates = new Producto(2.95, "aguacates", Producto.IVA.NORMAL);
		Producto friegasuelos = new Producto(2.95, "friegasuelos", Producto.IVA.REDUCIDO);
		Producto cerveza = new Producto(2.95, "cerveza", Producto.IVA.NORMAL);
		Producto sandia = new Producto(2.95, "sandia", Producto.IVA.REDUCIDO);
		
		List<Producto> productos = new ArrayList<Producto>();
		productos.add(leche);
		productos.add(pan);
		productos.add(salmon);
		productos.add(aguacates);
		productos.add(friegasuelos);
		productos.add(cerveza);
		productos.add(sandia);
		
		Factura comida = new Factura(1, productos);
		
		System.out.println("El total de la factura es de " + UtilidadesFactura.calcularImporteFactura(comida) + "€");
		System.out.println("El total del IVA es de " + UtilidadesFactura.calcularIVAFactura(comida) + "€");
		System.out.println("El importe total de la factura es de " + UtilidadesFactura.calcularImporteFacturaConIVA(comida) + "€");
		

	}//FIN MAIN

}//FIN ejercicio1
