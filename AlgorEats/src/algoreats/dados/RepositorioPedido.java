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
	
	public void criarPedido(Pedido p) {
		if(pedidoExiste(p.getNome()) == false) {
			this.pedidos.add(p);
		}
		else {
			//add exception
		}
	}
	
	public Pedido buscarPedido(String nome) {
		for(Pedido p : pedidos) {
			if(p.getNome() == nome) {
				return p;
			}
			else {
				return null; //add exception
			}
		}
		return null;
	}

	public boolean pedidoExiste(String nome) {
		return buscarPedido(nome) != null;
	}
	
	public void excluirPedido(Pedido p) {
		if(pedidoExiste(p.getNome()) == true) {
			this.pedidos.remove(p);
		}		
		else {
			//add exception
		}
	}
	
	public void alterarPedido(Pedido p) {
		if(buscarPedido(p.getNome()) != null) {
			int i = this.pedidos.indexOf(p);
			this.pedidos.set(i, p);
		}
		else {
			//add exception
		}
	}
	
	
}
