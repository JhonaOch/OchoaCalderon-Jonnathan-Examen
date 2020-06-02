package edu.ups.ec.JEE;

import java.util.List;

import edu.ups.ec.JavaBeans.Comida;



public interface ComidaDAO extends GenericBaseDAO<Comida, Integer>{
	
	 public abstract List<Comida> findByPersonaId(String cedula);
	    public abstract List<Comida> findBySearchTelf(String cedula, String numero);
	
	
}
