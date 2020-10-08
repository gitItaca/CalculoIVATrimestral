package edu.facturacion;

import java.util.ArrayList;
import java.util.List;

public class UtilidadesFactura {
	
	private Factura f;
	
//CONSTRUCTOR
	public UtilidadesFactura(Factura f) {
		super();
		this.f = f;
	}
	
//GETTERS Y SETTERS
	public Factura getF() {
		return f;
	}

	public void setF(Factura f) {
		this.f = f;
	}

	
//METODOS	
	public static double calcularImporteFactura(Factura f) {
		List<Producto> lista = new ArrayList<Producto>();
		double total = 0;
		
		lista = f.getProductos();
		
		for(Producto producto:lista) {
			total += producto.getImporte();
		}
		return total;
	}//FIN calcularImporteFactura
	
	public static double calcularIVAFactura(Factura f) {
		List<Producto> lista = new ArrayList<Producto>();
		double total = 0;
		
		lista = f.getProductos();
		
		for(Producto producto:lista) {
			double IVA = producto.getTipoIVA().getPorcentaje();
			double precio = producto.getImporte();
			
			total += (precio*IVA/100);
		}		
		return total;
	}//FIN calcularIVAFactura

	public static double calcularImporteFacturaConIVA(Factura f) {
		double total;
		
		total = calcularImporteFactura(f) + calcularIVAFactura(f);
		
		return total;
	}//FIN calcularImporteFacturaConIVA
	

}//FIN UtilidadesFactura
