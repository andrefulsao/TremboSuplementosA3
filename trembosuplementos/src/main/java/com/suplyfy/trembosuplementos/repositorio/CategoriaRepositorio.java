package com.suplyfy.trembosuplementos.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.suplyfy.trembosuplementos.model.Categoria;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Long>{
	@Query("from Categoria where nome like :nome%")
    public List<Categoria> findByCategoriaNomeContainingIgnoreCase(String nome);
	
	@Query("from Categoria where nome like :nome")
    public Categoria findByCategoriaNomeEspecificoContainingIgnoreCase(String nome);
}
