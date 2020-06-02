package edu.ups.ec.JEE;

import java.util.List;

import edu.ups.ec.JavaBeans.Pedido;


public interface PedidoDAO extends GenericBaseDAO<Pedido, String> {
    public abstract Pedido findUser(String correo, String contrasena);
    public abstract List<Pedido> findByIdOrMail(String context);
}