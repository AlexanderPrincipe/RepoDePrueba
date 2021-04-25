package com.example.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.UsuarioDTO;
import com.example.demo.models.Pais;
import com.example.demo.models.Usuario;
import com.example.demo.repositories.IPaisRepository;
import com.example.demo.repositories.IUsuarioRepository;
import com.example.demo.services.UsuarioServicee;

import reactor.core.publisher.Mono;

@Service
public class UsuarioServiceImpl implements UsuarioServicee {
	
	@Autowired
	IUsuarioRepository usuarioRepository;
	
	@Autowired
	IPaisRepository paisRepository;

	@Override
	public List<Usuario> listar() {
		return usuarioRepository.findAll();
	}

	@Override
	public Optional<Usuario> listarPorId(Integer id) {
		return usuarioRepository.findById(id);
	}

	@Override
	public Usuario registrar(UsuarioDTO usuarioDTO) {
		
		Pais pais = new Pais();
		pais = paisRepository.findById(usuarioDTO.getId()).orElse(null);
		
		Usuario usuario = new Usuario();
		usuario.setId(usuarioDTO.getId());
		usuario.setApellido_materno(usuarioDTO.getApellido_materno());
		usuario.setApellido_paterno(usuarioDTO.getApellido_paterno());
		usuario.setBio(usuarioDTO.getBio());
		usuario.setFecha_nacimiento(usuarioDTO.getFecha_nacimiento());
		usuario.setFoto(usuarioDTO.getFoto());
		usuario.setNombre(usuarioDTO.getNombre());
		usuario.setId_pais(pais);
		
		return usuarioRepository.save(usuario) ;
	}

	@Override
	public Usuario modificar(UsuarioDTO usuarioDTO) {
		Pais pais = new Pais();
		pais = paisRepository.findById(usuarioDTO.getId()).orElse(null);
		
		Usuario usuario = new Usuario();
		usuario.setId(usuarioDTO.getId());
		usuario.setApellido_materno(usuarioDTO.getApellido_materno());
		usuario.setApellido_paterno(usuarioDTO.getApellido_paterno());
		usuario.setBio(usuarioDTO.getBio());
		usuario.setFecha_nacimiento(usuarioDTO.getFecha_nacimiento());
		usuario.setFoto(usuarioDTO.getFoto());
		usuario.setNombre(usuarioDTO.getNombre());
		usuario.setId_pais(pais);
		
		return usuarioRepository.save(usuario) ;
	}

	@Override
	public void eliminar(Integer id) {
		usuarioRepository.deleteById(id);
	}

	




}
