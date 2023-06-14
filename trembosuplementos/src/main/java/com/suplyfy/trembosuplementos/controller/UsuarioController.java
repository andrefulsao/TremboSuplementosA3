package com.suplyfy.trembosuplementos.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.suplyfy.trembosuplementos.model.Usuario;
import com.suplyfy.trembosuplementos.repositorio.UsuarioRepositorio;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepositorio userrepositorio;
	
	@GetMapping("/logar/{email}/{senha}")
	@ResponseBody
	public boolean Buscar(@PathVariable String email, @PathVariable String senha) {	
		Usuario usuario = userrepositorio.findByLoginAndSenha(email, senha);
		if (usuario != null) {
			return true;
		}else {
			return false;
		}
	}
}
