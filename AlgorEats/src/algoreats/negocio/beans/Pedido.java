/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoreats.negocio.beans;

/**
 *
 * @author Rayan
 */
public class Pedido {
    private String nome;
    private Endereco endereco;
    private String prato;
    
	public Pedido(String nome, Endereco endereco, String prato) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.prato = prato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getPrato() {
		return prato;
	}

	public void setPrato(String prato) {
		this.prato = prato;
	}

	@Override
	public String toString() {
		return "Pedido: \nNome: " + nome + "\n" + endereco + "\nPrato: " + prato;
	}
    
    
    
}
