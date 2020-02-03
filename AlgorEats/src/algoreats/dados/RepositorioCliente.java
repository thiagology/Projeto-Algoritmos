package algoreats.dados;

import java.util.ArrayList;

import algoreats.negocio.beans.Endereco;

public class RepositorioCliente {
	private ArrayList <Endereco> enderecos;
	private static RepositorioCliente instance;
	
	public static RepositorioCliente getInstance() {
		if(instance == null) {
			instance = new RepositorioCliente();
		}
		return instance;
	}
	
	public void criarCliente(Endereco e) {
		if(clienteExiste(e.getNumero()) == false) {
			this.enderecos.add(e);
		}
		else {
			//add exception
		}
	}

	public void excluirCliente(Endereco e) {
		if(clienteExiste(e.getNumero()) == true) {
			this.enderecos.remove(e);
		}
		else {
			//add exception
		}
	}
	
	public Endereco buscarCliente(int numero) {
		for(Endereco e : enderecos) {
			if(e.getNumero() == numero) {
				return e;
			}
			else{
				//add exception
			}
		}
		return null;
	}
	
	public void alterarCliente(Endereco e, Endereco novo) {
		if(clienteExiste(e.getNumero()) == true) {
			int i = this.enderecos.indexOf(e);
			this.enderecos.set(i, novo);
		}
	}
	
	public boolean clienteExiste(int numero) {
		return buscarCliente(numero) != null;
	}
}
