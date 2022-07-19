package co.edu.unicauca.adminCDU.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicauca.adminCDU.models.Escenario;
import co.edu.unicauca.adminCDU.services.IEscenarioService;

@Service
public class EscenarioRepository {
	
	@Autowired
	private IEscenarioService esc;
	
	public List<Escenario> findAll() {
		System.out.println("Invocando a listar escenarios");
		return esc.findAll();
	}
	
	public Escenario findByName(String name) {
		System.out.println("Invocando a buscar escenario");
		Escenario escenario = esc.findById(name).orElse(null);	
		return escenario;
	}
	
	public Escenario save(Escenario escenario) {
		System.out.println("Invocando a guardar escenario");
		esc.save(escenario);		
		return escenario;
	}
	
	public Escenario update(Escenario escenario) {
		System.out.println("Invocando a editar escenario");
		Escenario escSave = null;	
		escSave = esc.save(escenario);
		return escSave;
	}
	
	public Escenario delete(String name) {
		System.out.println("Invocando a eliminar escenario");
		Escenario escenario = findByName(name);
		if(escenario != null) {
			esc.deleteById(name);
		}
		return escenario;
	}
	
}
