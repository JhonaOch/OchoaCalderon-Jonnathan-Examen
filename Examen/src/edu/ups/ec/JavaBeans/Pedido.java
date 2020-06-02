package edu.ups.ec.JavaBeans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;





@Entity
public class Pedido implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int numero;
	private String fecha;
	private String cliente;
	private String total;
	private String observaciones;
	
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "pedido",orphanRemoval = true)
	private List<Comida> lista;
	private List<Tarjeta> lista2;
	
	
	

	public List<Tarjeta> getLista2() {
		return lista2;
	}


	public void setLista2(List<Tarjeta> lista2) {
		this.lista2 = lista2;
	}


	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	
	public Pedido(int numero, String fecha, String cliente, String total, String observaciones) {
		this.numero = numero;
		this.fecha = fecha;
		this.cliente = cliente;
		this.total = total;
		this.observaciones = observaciones;
	
	}





	public int getNumero() {
		return numero;
	}











	public void setNumero(int numero) {
		this.numero = numero;
	}











	public String getFecha() {
		return fecha;
	}











	public void setFecha(String fecha) {
		this.fecha = fecha;
	}











	public String getCliente() {
		return cliente;
	}











	public void setCliente(String cliente) {
		this.cliente = cliente;
	}











	public String getTotal() {
		return total;
	}











	public void setTotal(String total) {
		this.total = total;
	}











	public String getObservaciones() {
		return observaciones;
	}











	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}











	public List<Comida> getLista() {
		return lista;
	}











	public void setLista(List<Comida> lista) {
		this.lista = lista;
	}











	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((lista == null) ? 0 : lista.hashCode());
		result = prime * result + numero;
		result = prime * result + ((observaciones == null) ? 0 : observaciones.hashCode());
		result = prime * result + ((total == null) ? 0 : total.hashCode());
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
		Pedido other = (Pedido) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (lista == null) {
			if (other.lista != null)
				return false;
		} else if (!lista.equals(other.lista))
			return false;
		if (numero != other.numero)
			return false;
		if (observaciones == null) {
			if (other.observaciones != null)
				return false;
		} else if (!observaciones.equals(other.observaciones))
			return false;
		if (total == null) {
			if (other.total != null)
				return false;
		} else if (!total.equals(other.total))
			return false;
		return true;
	}











	
}
