package jpa;

import java.util.List;

import edu.ups.ec.JEE.PedidoDAO;
import edu.ups.ec.JavaBeans.Pedido;
import edu.ups.ec.JavaBeans.Tarjeta;


public class JPATarjetaDAO extends JPAGenericDAO<Tarjeta, String> implements PedidoDAO{

	public JPATarjetaDAO() {
		//super(user.class);
		super(Tarjeta.class);
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
