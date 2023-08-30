package br.com.belval.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
		private Integer id;
		private String nome;
		private String telefone;
		private String data_nasc;
		private String cpf;
		private String endereco;
		private String cidade;
		private String bairro;
		private String cep;
		private String email;
		private String senha;
		
		public Cliente() {
			this.id = 0;
		}
		public Cliente(int id, String nome, String telefone, String data_nasc, String cpf, String endereco, String cidade,
				String bairro,String cep, String email, String senha) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.data_nasc = data_nasc;
		this.cpf = cpf;
		this.endereco = endereco;
		this.cidade = cidade;
		this.bairro = bairro;
		this.cep = cep;
		this.email = email;
		this.senha = senha;
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
		
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String getData_nasc() {
			return data_nasc;
		}
		public void setData_nasc(String data_nasc) {
			this.data_nasc = data_nasc;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
		public String getBairro() {
			return bairro;
		}
		public void setBairro(String bairro) {
			this.bairro = bairro;
		}
		public String getCep() {
			return cep;
		}
		public void setCep(String cep) {
			this.cep = cep;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		@Override
		public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", telefone=" + 
		telefone + ", data_nasc=" + data_nasc + ", cpf=" + cpf + ", endereco=" + endereco + ", cidade=" + cidade +
		", bairro=" + bairro + ", cep=" + cep + ", email=" + email +"]";
		}
}
