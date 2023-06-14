package br.com.belval.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
		private Integer id;
		private String nome;
		private String descricao;
		private double preco;
		public Cliente() {
			this.id = 0;
		}
		public Cliente(int id, String nome, String descricao, double preco) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		}
		public int getId() {
		return id;
		}
		public void setId(int id) {
		this.id = id;
		}
		public String getNome() {
		return nome;
		}
		public void setNome(String nome) {
		this.nome = nome;
		}
		public String getDescricao() {
		return descricao;
		}
		public void setDescricao(String descricao) {
		this.descricao = descricao;
		}
		public double getPreco() {
		return preco;
		}
		public void setPreco(double preco) {
		this.preco = preco;
		}
		@Override
		public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", descricao=" + 
		descricao + ", preco=" + preco + "]";
		}
}