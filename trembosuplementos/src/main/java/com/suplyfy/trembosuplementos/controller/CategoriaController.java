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

import com.suplyfy.trembosuplementos.model.Categoria;
import com.suplyfy.trembosuplementos.repositorio.CategoriaRepositorio;


@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepositorio repositorio;		
	
	@GetMapping
	public List<Categoria> listar(){
		return repositorio.findAll();		
	}
	
	@GetMapping("{id}")
	public Optional<Categoria> buscarId(@PathVariable("id") Long id) {
		return repositorio.findById(id);
	}
	
	@GetMapping("/nome/{nome}")
	@ResponseBody
	public List<Categoria> Buscar(@PathVariable String nome) {	
		return repositorio.findByCategoriaNomeContainingIgnoreCase(nome);
		
	}
	
	@PostMapping
	public Boolean adicionar(@RequestBody Categoria categoria){
		if(repositorio.findByCategoriaNomeEspecificoContainingIgnoreCase(categoria.getNome()) != null) {					
			return false;
		}else {
			repositorio.save(categoria);
			return true;
		}
	}
	
	@PutMapping
	public boolean alterar(@RequestBody Categoria categoria){	
		
		if(repositorio.existsById(categoria.getId())) {
			repositorio.save(categoria); 
			return true; 
		}else {
			return false; 
		}			
	}
	
	@DeleteMapping("{id}")
	public List<Categoria> excluir(@PathVariable("id") Long id){
		if(repositorio.existsById(id)) {
			repositorio.deleteById(id);
			return repositorio.findAll();
		}else {
			return repositorio.findAll();
		}		
	}
}
