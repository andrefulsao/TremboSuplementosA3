package com.suplyfy.trembosuplementos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.suplyfy.trembosuplementos.model.Produto;
import com.suplyfy.trembosuplementos.repositorio.ProdutoRepositorio;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
	@Autowired
	private ProdutoRepositorio repositorio;		
	
	@GetMapping
	public List<Produto> listar(){
		return repositorio.findAll();		
	}
	
	@GetMapping("{id}")
	public Optional<Produto> buscarId(@PathVariable("id") Long id) {
		return repositorio.findById(id);
	}
	
	@GetMapping("/nome/{nome}")
	@ResponseBody
	public List<Produto> Buscar(@PathVariable String nome) {	
		return repositorio.findByProdutoNomeContainingIgnoreCase(nome);
		
	}
	
	@PostMapping
	public Boolean adicionar(@RequestBody Produto produto){				
		repositorio.save(produto);
		return true;
	}
	
	@PutMapping
	public boolean alterar(@RequestBody Produto produto){			
		if(repositorio.existsById(produto.getId())) {
			repositorio.save(produto); 
			return true; 
		}else {
			return false; 
		}			
	}
	
	@DeleteMapping("{id}")
	public List<Produto> excluir(@PathVariable("id") Long id){
		if(repositorio.existsById(id)) {
			repositorio.deleteById(id);
			return repositorio.findAll();
		}else {
			return repositorio.findAll();
		}		
	}
}
