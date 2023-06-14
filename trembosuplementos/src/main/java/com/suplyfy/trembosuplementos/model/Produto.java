package com.suplyfy.trembosuplementos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_produto")
	private Long id;
	
	@Column(nullable = false, name="nome_produto")
	private String nome;
	
	@Column(nullable = false, name="quantidade")
	private Integer quantidade;
	
	@Column(nullable = false, name="valor")
	private Double valor;
	
	@Column(nullable = false, name="conteudo")
	private String conteudo;
	
	@Column(nullable = false, name="porcao")
	private String porcao;
	
	@Column(nullable = false, name="valor_energetico")
	private String valor_energetico;
	
	@Column(name="sabor")
	private String sabor;
	
	@Column(name="proteina")
	private String proteina;
	
	@Column(name="carboidrato")
	private String carboidrato;
	
	@Column(name="sodio")
	private String sodio;
	
	@Column(name="gorduras_totais")
	private String gorduras_totais;
	
	@Column(name="gorduras_saturadas")
	private String gorduras_saturadas;
	
	@Column(name="gorduras_trans")
	private String gorduras_trans;
	
	@Column(name="cafeina")
	private String cafeina;
	
	@Column(name="creatina")
	private String creatina;
	
	@Column(name="beta_alanina")
	private String beta_alanina;
	
	@ManyToOne
	@JoinColumn(name="id_categoria")
	private Categoria categoria;
	
	

	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produto(Long id, String nome, Integer quantidade, Double valor, String conteudo, String porcao,
			String valor_energetico, String sabor, String proteina, String carboidrato, String sodio,
			String gorduras_totais, String gorduras_saturadas, String gorduras_trans, String cafeina, String creatina,
			String beta_alanina, Categoria categoria) {
		super();
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
		this.conteudo = conteudo;
		this.porcao = porcao;
		this.valor_energetico = valor_energetico;
		this.sabor = sabor;
		this.proteina = proteina;
		this.carboidrato = carboidrato;
		this.sodio = sodio;
		this.gorduras_totais = gorduras_totais;
		this.gorduras_saturadas = gorduras_saturadas;
		this.gorduras_trans = gorduras_trans;
		this.cafeina = cafeina;
		this.creatina = creatina;
		this.beta_alanina = beta_alanina;
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getPorcao() {
		return porcao;
	}

	public void setPorcao(String porcao) {
		this.porcao = porcao;
	}

	public String getValor_energetico() {
		return valor_energetico;
	}

	public void setValor_energetico(String valor_energetico) {
		this.valor_energetico = valor_energetico;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getProteina() {
		return proteina;
	}

	public void setProteina(String proteina) {
		this.proteina = proteina;
	}

	public String getCarboidrato() {
		return carboidrato;
	}

	public void setCarboidrato(String carboidrato) {
		this.carboidrato = carboidrato;
	}

	public String getSodio() {
		return sodio;
	}

	public void setSodio(String sodio) {
		this.sodio = sodio;
	}

	public String getGorduras_totais() {
		return gorduras_totais;
	}

	public void setGorduras_totais(String gorduras_totais) {
		this.gorduras_totais = gorduras_totais;
	}

	public String getGorduras_saturadas() {
		return gorduras_saturadas;
	}

	public void setGorduras_saturadas(String gorduras_saturadas) {
		this.gorduras_saturadas = gorduras_saturadas;
	}

	public String getGorduras_trans() {
		return gorduras_trans;
	}

	public void setGorduras_trans(String gorduras_trans) {
		this.gorduras_trans = gorduras_trans;
	}

	public String getCafeina() {
		return cafeina;
	}

	public void setCafeina(String cafeina) {
		this.cafeina = cafeina;
	}

	public String getCreatina() {
		return creatina;
	}

	public void setCreatina(String creatina) {
		this.creatina = creatina;
	}

	public String getBeta_alanina() {
		return beta_alanina;
	}

	public void setBeta_alanina(String beta_alanina) {
		this.beta_alanina = beta_alanina;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	

}
