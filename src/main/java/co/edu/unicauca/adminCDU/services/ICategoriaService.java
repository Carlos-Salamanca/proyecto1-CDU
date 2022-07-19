package co.edu.unicauca.adminCDU.services;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unicauca.adminCDU.models.Categoria;

public interface ICategoriaService extends JpaRepository<Categoria, String>{
	
}
