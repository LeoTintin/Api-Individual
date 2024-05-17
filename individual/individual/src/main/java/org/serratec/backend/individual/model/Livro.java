package org.serratec.backend.individual.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Livro {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		@NotBlank(message = "Campo vazio")
		@Size(max=30, message ="Titulo grande demais!")	
		@Column(name = "Titulo")
		private String titulo;
		@Embedded
		private InformacaoPublicacao informacaoPublicacao;
		public Livro () {
			super();
		}
		public Livro(Long id,
				@NotBlank(message = "Campo vazio") @Size(max = 30, message = "Titulo grande demais!") String titulo,
				InformacaoPublicacao informacaoPublicacao) {
			super();
			this.id = id;
			this.titulo = titulo;
			this.informacaoPublicacao = informacaoPublicacao;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public InformacaoPublicacao getInformacaoPublicacao() {
			return informacaoPublicacao;
		}
		public void setInformacaoPublicacao(InformacaoPublicacao informacaoPublicacao) {
			this.informacaoPublicacao = informacaoPublicacao;
		}
		
}
