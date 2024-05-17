package org.serratec.backend.individual.model;

import java.util.Date;

import jakarta.persistence.Embeddable;

@Embeddable
public class InformacaoPublicacao {
	private String autor;
	private	 String	editor;
	private Date dataPubiclacao;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public Date getDataPubiclacao() {
		return dataPubiclacao;
	}

	public void setDataPubiclacao(Date dataPubiclacao) {
		this.dataPubiclacao = dataPubiclacao;
	}

	@Override
	public String toString() {
		return "InformacaoPublicacao [autor=" + autor + ", editor=" + editor + ", dataPubiclacao=" + dataPubiclacao
				+ "]";
	}
	
	
}
