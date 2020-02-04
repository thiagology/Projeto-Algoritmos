package algoreats.negocio;

import algoreats.dados.RepositorioCliente;
import algoreats.negocio.beans.Endereco;


public class ControladorCliente {
	private RepositorioCliente repositorioCliente;
	private static ControladorCliente instance;
	
	public static ControladorCliente getInstance() {
        if (instance == null) {
            instance = new ControladorCliente();
        }
        return instance;
    }
	
	private ControladorCliente() {
		this.repositorioCliente = RepositorioCliente.getInstance();
	}
	
	public void criarCliente(Endereco e) {
		if(e != null && e.getNumero() >= 0) {
			repositorioCliente.criarCliente(e);
		}
	}
	
	public void excluirCliente(Endereco e) {
		if(e != null && e.getNumero() >= 0) {
			repositorioCliente.excluirCliente(e);
		}		
	}
	
	public Endereco buscarCliente(int numero) {
		if(numero >= 0 ){
			return repositorioCliente.buscarCliente(numero);
		}
		return null;
	}
	
	public void alterarCliente(Endereco e, Endereco novo) {
		if(e != null && e.getNumero() >= 0) {
			if(novo != null && novo.getNumero() >= 0) {
				if(!(novo.equals(e))) {
					repositorioCliente.alterarCliente(e, novo);
				}
			}
		}
	}
	
}
