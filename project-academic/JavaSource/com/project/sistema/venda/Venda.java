/**
 * 
 */
package com.project.sistema.venda;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.project.sistema.cliente.Cliente;
import com.project.sistema.produto.Produto;

/**
 * @author Isaac
 *
 */

@Entity
@Table(name = "VENDA")
public class Venda {

	@Id
	@GeneratedValue
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "ID_CLIENTE", nullable= false)
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "ID_PRODUTO", nullable = false)
	private Produto produto;
	
	@Column(name = "DATA_VENDA")
	private Date dataVenda;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}
	
}
