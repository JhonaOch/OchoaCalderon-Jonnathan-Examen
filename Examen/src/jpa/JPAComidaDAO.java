package jpa;

import java.util.List;

import edu.ups.ec.JEE.ComidaDAO;
import edu.ups.ec.JavaBeans.Comida;
import edu.ups.ec.JavaBeans.Pedido;

;

public class JPAComidaDAO extends JPAGenericDAO<Comida, String> implements ComidaDAO{

	public JPAComidaDAO() {
		//super(user.class);
		super(Comida.class);
	}

	@Override
	public Comida findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Comida> findByPersonaId(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comida> findBySearchTelf(String cedula, String numero) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
	

	
	
	

	
	
	
	

}
