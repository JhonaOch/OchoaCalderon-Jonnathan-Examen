package edu.ups.ec.modelo;

import java.io.Serializable;
import java.util.List;



public class Pedido implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	private int numero;
	private String fecha;
	private String cliente;
	private String total;
	private String observaciones;
	
	

	public Pedido() {
		// TODO Auto-generated constructor stub
	}

}
