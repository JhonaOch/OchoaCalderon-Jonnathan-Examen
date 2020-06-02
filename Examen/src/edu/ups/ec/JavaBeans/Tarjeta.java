package edu.ups.ec.JavaBeans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Tarjeta implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String numeroTarjeta;
	private String nombre;
	private String fechasCaducidad;
	private int csv;
	
	@ManyToOne()
	private Pedido pedido;
	
	
	
	public Tarjeta(String numeroTarjeta, String nombre, String fechasCaducidad,Pedido pedido) {

		this.numeroTarjeta = numeroTarjeta;
		this.nombre = nombre;
		this.fechasCaducidad = fechasCaducidad;
		this.pedido=pedido;
	}


	
	
	
	public Tarjeta() {
		// TODO Auto-generated constructor stub
	}





	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}





	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}





	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public String getFechasCaducidad() {
		return fechasCaducidad;
	}





	public void setFechasCaducidad(String fechasCaducidad) {
		this.fechasCaducidad = fechasCaducidad;
	}





	public int getCsv() {
		return csv;
	}





	public void setCsv(int csv) {
		this.csv = csv;
	}





	public Pedido getPedido() {
		return pedido;
	}





	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}





	public static long getSerialversionuid() {
		return serialVersionUID;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + csv;
		result = prime * result + ((fechasCaducidad == null) ? 0 : fechasCaducidad.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((numeroTarjeta == null) ? 0 : numeroTarjeta.hashCode());
		result = prime * result + ((pedido == null) ? 0 : pedido.hashCode());
		return result;
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarjeta other = (Tarjeta) obj;
		if (csv != other.csv)
			return false;
		if (fechasCaducidad == null) {
			if (other.fechasCaducidad != null)
				return false;
		} else if (!fechasCaducidad.equals(other.fechasCaducidad))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numeroTarjeta == null) {
			if (other.numeroTarjeta != null)
				return false;
		} else if (!numeroTarjeta.equals(other.numeroTarjeta))
			return false;
		if (pedido == null) {
			if (other.pedido != null)
				return false;
		} else if (!pedido.equals(other.pedido))
			return false;
		return true;
	}
	
	

}
