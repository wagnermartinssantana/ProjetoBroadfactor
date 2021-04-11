package br.com.projetobroadfactor.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import br.com.projetobroadfactor.enums.Sexo;


@Entity
@Table(name = "usuario")
public class Usuario implements Serializable { 
		
		private static final long serialVersionUID = 1L;
		
		
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
	    private Integer id;
	    
		@Size(min =5, max = 35, message = "O nome deve conter no minimo 5 caracteres")
		@NotBlank(message = "O nome não pode ser vazio!")
	    private String nome;
	    private String cpf;
	    
	    private String cnpj;
	    
	    private String data_nasc;
	    
	    @Enumerated(EnumType.STRING)
	    private Sexo sexo;
	   
	   

	    // valor unico para E-MAIL e não pode ser nulo
	    @Email
	    @Column(unique=true)
	    @NotBlank(message = "O e-mail não pode ser vazio e não pode repetir!")
	    private String email;
	   
	    
	    
	    
	    
		@ElementCollection
		@CollectionTable(name ="TELEFONE")
		private Set<String> telefones = new HashSet<>();
	    
	    
	    private String cep;
	    private String endereco;
	    private String numero;
	    private String bairro;
	    private String cidade; 
	    private String estado;
	    
	    
	     
		private String senha;
	    
	    
	    public Usuario() {
		}
	    
	    
	 



	public Usuario(Integer id, String nome, String cpf, String cnpj, String data_nasc, Sexo sexo, String email,
				Set<String> telefones, String cep, String endereco, String numero, String bairro, String cidade,
				String estado, String senha) {
			super();
			this.id = id;
			this.nome = nome;
			this.cpf = cpf;
			this.cnpj = cnpj;
			this.data_nasc = data_nasc;
			this.sexo = sexo;
			this.email = email;
			this.telefones = telefones;
			this.cep = cep;
			this.endereco = endereco;
			this.numero = numero;
			this.bairro = bairro;
			this.cidade = cidade;
			this.estado = estado;
			this.senha = senha;
		}









	// construtor



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
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getCnpj() {
			return cnpj;
		}
		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}
		public String getData_nasc() {
			return data_nasc;
		}
		public void setData_nasc(String data_nasc) {
			this.data_nasc = data_nasc;
		}
	
		public Sexo getSexo() {
			return sexo;
		}
		public void setSexo(Sexo sexo) {
			this.sexo = sexo;
		}

		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getCep() {
			return cep;
		}
		public void setCep(String cep) {
			this.cep = cep;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public String getNumero() {
			return numero;
		}
		public void setNumero(String numero) {
			this.numero = numero;
		}
		public String getBairro() {
			return bairro;
		}
		public void setBairro(String bairro) {
			this.bairro = bairro;
		}
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
	    public Set<String> getTelefones() {
			return telefones;
		}
		public void setTelefones(Set<String> telefones) {
			this.telefones = telefones;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}
		
		public String getSenha() {
			return senha;
		}


		public void setSenha(String senha) {
			this.senha = senha;
		}

		
		
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			return result;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Usuario other = (Usuario) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}

		


}
