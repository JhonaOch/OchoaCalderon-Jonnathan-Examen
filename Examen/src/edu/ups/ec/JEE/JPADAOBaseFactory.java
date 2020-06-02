package edu.ups.ec.JEE;

import jpa.JPAComidaDAO;
import jpa.JPAPedidoDAO;

public  class JPADAOBaseFactory extends DAObaseFactory{

	

	@Override
	public PedidoDAO getPedidoDAO() {
		// TODO Auto-generated method stub
		return new JPAPedidoDAO();
	}

	@Override
	public ComidaDAO getComidaDAO() {
		// TODO Auto-generated method stub
		return new JPAComidaDAO();
	}
	
	

	


	

	

	

    
    
}
