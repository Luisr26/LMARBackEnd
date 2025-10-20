package com.example.demo.springboot.Repository;
import com.example.demo.springboot.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}
