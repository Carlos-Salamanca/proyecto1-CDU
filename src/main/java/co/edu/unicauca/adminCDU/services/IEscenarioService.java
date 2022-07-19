package co.edu.unicauca.adminCDU.services;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unicauca.adminCDU.models.Escenario;

public interface IEscenarioService extends JpaRepository<Escenario, String>{
	
}
