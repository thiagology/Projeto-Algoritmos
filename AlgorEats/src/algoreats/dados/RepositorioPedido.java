package algoreats.dados;

import java.util.ArrayList;

import algoreats.negocio.beans.Pedido;


public class RepositorioPedido {
	private ArrayList <Pedido> pedidos;
	private static RepositorioPedido instance;
	
	public static RepositorioPedido getInstance() {
		if(instance == null) {
			instance = new RepositorioPedido();
		}
		return instance;
	}
	
	
}
