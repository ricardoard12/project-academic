/**
 * 
 */
package com.project.sistema.cliente;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Isaac
 * Classe criada para receber os cadastros dos clientes que forem cadastrar
 * neste pequeno programa web
 */

@Entity
@Table(name = "CLIENTE")
public class Cliente {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "ENDERECO")
	private String endereco;
	
	@Column(name = "CPF")
	private String cpf;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "DATA_CADASTRO")
	private String dataCadastro;
	
	@Column(name = "RENDA")
	private float renda;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public float getRenda() {
		return renda;
	}

	public void setRenda(float renda) {
		this.renda = renda;
	}
	
}
