package com.suplyfy.trembosuplementos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.suplyfy.trembosuplementos.model.Usuario;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
	@Query("from Usuario where email = :email and senha = :senha")
    public Usuario findByLoginAndSenha(@Param("email")String email,
    @Param("senha") String senha);
}
