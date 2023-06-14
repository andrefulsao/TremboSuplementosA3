package com.suplyfy.trembosuplementos.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_categoria")
	private Long id;
	
	@Column(nullable = false, name="nome_categoria")
	private String nome;	
	
	@Column(name = "sabor")
	private boolean sabor;
	
	@Column(name = "proteina")
	private boolean proteina;
	
	@Column(name = "carboidrato")
	private boolean carboidrato;
	
	@Column(name = "sodio")
	private boolean sodio;
	
	@Column(name = "gorduras_totais")
	private boolean gorduras_totais;
	
	@Column(name = "gorduras_saturadas")
	private boolean gorduras_saturadas;
	
	@Column(name = "gorduras_trans")
	private boolean gorduras_trans;
	
	@Column(name = "cafeina")
	private boolean cafeina;
	
	@Column(name = "creatina")
	private boolean creatina;
	
	@Column(name = "beta_alanina")
	private boolean beta_alanina;
	
	

	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categoria(Long id, String nome, boolean sabor, boolean proteina, boolean carboidrato, boolean sodio,
			boolean gorduras_totais, boolean gorduras_saturadas, boolean gorduras_trans, boolean cafeina,
			boolean creatina, boolean beta_alanina) {
		super();
		this.id = id;
		this.nome = nome;
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

	public boolean isSabor() {
		return sabor;
	}

	public void setSabor(boolean sabor) {
		this.sabor = sabor;
	}

	public boolean isProteina() {
		return proteina;
	}

	public void setProteina(boolean proteina) {
		this.proteina = proteina;
	}

	public boolean isCarboidrato() {
		return carboidrato;
	}

	public void setCarboidrato(boolean carboidrato) {
		this.carboidrato = carboidrato;
	}

	public boolean isSodio() {
		return sodio;
	}

	public void setSodio(boolean sodio) {
		this.sodio = sodio;
	}

	public boolean isGorduras_totais() {
		return gorduras_totais;
	}

	public void setGorduras_totais(boolean gorduras_totais) {
		this.gorduras_totais = gorduras_totais;
	}

	public boolean isGorduras_saturadas() {
		return gorduras_saturadas;
	}

	public void setGorduras_saturadas(boolean gorduras_saturadas) {
		this.gorduras_saturadas = gorduras_saturadas;
	}

	public boolean isGorduras_trans() {
		return gorduras_trans;
	}

	public void setGorduras_trans(boolean gorduras_trans) {
		this.gorduras_trans = gorduras_trans;
	}

	public boolean isCafeina() {
		return cafeina;
	}

	public void setCafeina(boolean cafeina) {
		this.cafeina = cafeina;
	}

	public boolean isCreatina() {
		return creatina;
	}

	public void setCreatina(boolean creatina) {
		this.creatina = creatina;
	}

	public boolean isBeta_alanina() {
		return beta_alanina;
	}

	public void setBeta_alanina(boolean beta_alanina) {
		this.beta_alanina = beta_alanina;
	}
	
	

	
	
}
