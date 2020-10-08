package edu.gestion;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.GregorianCalendar;
import edu.facturacion.*;

public class Ejercicio3 {

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
						
		List<Factura> facturas = new ArrayList<Factura>();
		Random ale = new Random();
		
		//creo las 5 facturas con 10 productos aleatorios
		for(int numFac=1; numFac<6; numFac++) {
			List<Producto> cesta = new ArrayList<Producto>();
			for(int numLista = 1; numLista < 11; numLista++) {
				int numProdAleatorio = ale.nextInt(7);
				cesta.add(productos.get(numProdAleatorio));
			}
			Factura comida = new Factura(numFac, cesta);
			facturas.add(comida);
		}
		
		//creo las fechas y las asigno a las facturas
		Calendar fechaActual = new GregorianCalendar();		
		Calendar fecha1 = new GregorianCalendar();
		fecha1.set(2020, 9, 02);
		Calendar fecha2 = new GregorianCalendar();
		fecha2.set(2020, 8, 10);
		Calendar fecha3 = new GregorianCalendar();
		fecha3.set(2020, 8, 23);
		Calendar fecha4 = new GregorianCalendar();
		fecha4.set(2020, 7, 19);
		
		facturas.get(0).setFecha(fechaActual);
		facturas.get(1).setFecha(fecha1);
		facturas.get(2).setFecha(fecha2);
		facturas.get(3).setFecha(fecha3);
		facturas.get(4).setFecha(fecha4);
		
		//Imprimo las facturas
		System.out.print(facturas.get(0).toString());
		System.out.printf("El IVA es de: %.2f € \n", UtilidadesFactura.calcularIVAFactura(facturas.get(0)));
		System.out.println();
		System.out.print(facturas.get(1).toString());
		System.out.printf("El IVA es de: %.2f € \n", UtilidadesFactura.calcularIVAFactura(facturas.get(1)));		
		System.out.println();
		System.out.print(facturas.get(2).toString());
		System.out.printf("El IVA es de: %.2f € \n", UtilidadesFactura.calcularIVAFactura(facturas.get(2)));
		System.out.println();
		System.out.print(facturas.get(3).toString());
		System.out.printf("El IVA es de: %.2f € \n", UtilidadesFactura.calcularIVAFactura(facturas.get(3)));		
		System.out.println();
		System.out.print(facturas.get(4).toString());
		System.out.printf("El IVA es de: %.2f € \n", UtilidadesFactura.calcularIVAFactura(facturas.get(4)));
		System.out.println("__________________________________________________________________________________________________________________");
		System.out.printf("El IVA total de todas las facturas de este trimestre es de:  %.2f € \n", UtilidadesCalculoIVA.calculoIVATrimestral(facturas));
		System.out.printf("El IVA de todas las facturas de este mes es de:  %.2f € \n", UtilidadesCalculoIVA.calculoIVAMesActual(facturas));
		
	}//FIN MAIN

}//FIN ejercicio1