package com.uca.capas.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Estudiante;

public interface EstudianteDAO {

	public void insertStudent(Estudiante estudiante) throws DataAccessException;
	
	public List<Estudiante> findAll() throws DataAccessException;
}
