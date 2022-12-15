package com.generation.jlsg.myappdb.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.jlsg.myappdb.controllers.Optional;
import com.generation.jlsg.myappdb.models.UsuarioModel;
import com.generation.jlsg.myappdb.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepositorio;
	public ArrayList <UsuarioModel> obtenerUsuarios() {
		return (ArrayList <UsuarioModel>)usuarioRepositorio.findAll();
	}
	
	public UsuarioModel guardarUsuario(UsuarioModel usuario) {
		return usuarioRepositorio.save(usuario);
	}

	public boolean eliminarPorId(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	public ArrayList<UsuarioModel> obtenerPorPrioridad1(Integer prioridad) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<UsuarioModel> obtenerPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<UsuarioModel> obtenerPorPrioridad(Integer prioridad) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean eliminarPorId1(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
}
