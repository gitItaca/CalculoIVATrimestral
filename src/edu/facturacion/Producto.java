package edu.facturacion;

public class Producto {

	private double importe;
	private String descripcion;
	
//CONSTRUCTOR
	public Producto(double importe, String descripcion) {
		super();
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
	
}
