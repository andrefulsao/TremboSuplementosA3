package com.suplyfy.trembosuplementos.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.suplyfy.trembosuplementos.model.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long> {
	@Query("from Produto where nome like :nome%")
    public List<Produto> findByProdutoNomeContainingIgnoreCase(String nome);
	
	@Query("from Produto where nome like :nome")
    public boolean findByProdutoNomeEspecificoContainingIgnoreCase(String nome);
}
