package edu.facturacion;

public class Producto {

	private enum IVA {
		SUPERREDUCIDO 	("Super reducido", 4), 
		REDUCIDO 		("Reducido", 10), 
		NORMAL 			("Normal", 21);
		
		private final String nombreTipoIVA;
		private final int porcentaje;
		
		private IVA(String nombreTipoIVA, int porcentaje){
			this.nombreTipoIVA = nombreTipoIVA;
			this.porcentaje = porcentaje;
		}
		
		public String getNombreTipoIVA() {
			return nombreTipoIVA;
		}
		
		public int getPorcentaje() {
			return porcentaje;
		}
		
	}; //FIN ENUM
	
	private double importe;
	private String descripcion;
	private IVA tipoIVA;
	
	
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
