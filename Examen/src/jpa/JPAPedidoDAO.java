package jpa;

import java.util.List;

import edu.ups.ec.JEE.PedidoDAO;
import edu.ups.ec.JavaBeans.Pedido;


public class JPAPedidoDAO extends JPAGenericDAO<Pedido, String> implements PedidoDAO{

	public JPAPedidoDAO() {
		//super(user.class);
		super(Pedido.class);
	}
	
	
	

	public JPAPedidoDAO(Class<Pedido> persistenClass) {
		super(persistenClass);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Pedido findUser(String correo, String contrasena) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pedido> findByIdOrMail(String context) {
		// TODO Auto-generated method stub
		return null;
	}

}
