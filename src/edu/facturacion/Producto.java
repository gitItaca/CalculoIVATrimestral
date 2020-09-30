package edu.facturacion;

public class Producto {

	private double importe;
	private String descripcion;
	
	private enum IVA {
		SUPERREDUCIDO ("Super reducido", 4), 
		REDUCIDO ("Reducido", 10), 
		NORMAL ("Normal", 21);
		
		private final String nombreTipoIVA;
		private final int porcentaje;
		
		IVA(String nombreTipoIVA, int porcentaje){
			
		}
	}; //FIN ENUM
	
//CONSTRUCTOR
	public Producto(double importe, String descripcion) {
		this.importe = importe;
		this.descripcion = descripcion;
	}
	
//GETTERS Y SETTERS 
	public double getImporte() {
		return importe;
	}
	public String getDescripcion() {
		return descripcion;
	}
	
}//FIN class producto
