package edu.facturacion;

import java.util.List;

public class Factura {
	 
    private int numero;
    private List<Producto> productos;
   
//CONSTRUCTOR
    public Factura(int numero, List<Producto> productos) {
		this.numero = numero;
		this.productos = productos;
	}
    
//GETTERS Y SETTERS 
	public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

	
//METODOS
	public String toString() {
		System.out.println("Factura " + numero + ":");
		for (Producto producto:productos) {
			System.out.println("  " + producto.getDescripcion() + ": " + producto.getImporte());
		}
		return  "";
	}
    
}//FIN CLASS
