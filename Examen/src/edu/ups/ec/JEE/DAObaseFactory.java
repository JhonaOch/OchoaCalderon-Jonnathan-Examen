package edu.ups.ec.JEE;



public abstract class DAObaseFactory {
	protected static DAObaseFactory factory = new JPADAOBaseFactory();

	public static DAObaseFactory getDAOFactory() {
		return factory;
	}

//	public abstract void createTables();

	public abstract ComidaDAO getComidaDAO();

	public abstract PedidoDAO getPedidoDAO();
		// TODO Auto-generated method stub
	

	

}
