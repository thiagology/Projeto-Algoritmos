package algoreats.negocio;

import algoreats.negocio.beans.Endereco;
import algoreats.negocio.beans.Pedido;

public class Fachada {
	
	private ControladorCliente controladorCliente;
	private ControladorPedido controladorPedido;
	private static Fachada instance;
	
	public static Fachada getInstance() {
		if(instance == null) {
			instance = new Fachada();
		}
		return instance;
	}
	
	private Fachada() {
		this.controladorCliente = ControladorCliente.getInstance();
		this.controladorPedido = ControladorPedido.getInstance();
	}
	
	
	public void criarCliente(Endereco e) {
		this.controladorCliente.criarCliente(e);
	}
	public void excluirCliente(Endereco e) {
		this.controladorCliente.excluirCliente(e);
	}
	public Endereco buscarCliente(int numero) {
		return this.controladorCliente.buscarCliente(numero);
	}
	public void alterarCliente(Endereco e, Endereco novo) {
		this.controladorCliente.alterarCliente(e, novo);
	}
	
	public void criarPedido(Pedido p) {
		this.controladorPedido.criarPedido(p);
	}
	public void excluirPedido(Pedido p) {
		this.controladorPedido.excluirPedido(p);
	}
	public Pedido buscarPedido(String nome) {
		return this.controladorPedido.buscarPedido(nome);
	}
	public void alterarPedido(Pedido p) {
		this.controladorPedido.alterarPedido(p);
	}
	
}
