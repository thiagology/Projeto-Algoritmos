package algoreats.negocio;

import algoreats.dados.RepositorioPedido;
import algoreats.negocio.beans.Pedido;

public class ControladorPedido {
	private RepositorioPedido repositorioPedido;
	private static ControladorPedido instance;
	
	public static ControladorPedido getInstance() {
        if (instance == null) {
            instance = new ControladorPedido();
        }
        return instance;
    }
	
	private ControladorPedido() {
		this.repositorioPedido = RepositorioPedido.getInstance();
	}
	
	public void criarPedido(Pedido p) {
		if(p != null && p.getNome() != null) {
			this.repositorioPedido.criarPedido(p);
		}
	}
	
	public void excluirPedido(Pedido p){
		if(p != null && p.getNome() != null) {
			this.repositorioPedido.excluirPedido(p);
		}
	}
	
	public Pedido buscarPedido(String nome) {
		if(nome != null) {
			return this.repositorioPedido.buscarPedido(nome);
		}
		return null;
	}

	
	public void alterarPedido(Pedido p){
		if(p != null && p.getNome() != null) {
			this.repositorioPedido.alterarPedido(p);
		}
	}
}
