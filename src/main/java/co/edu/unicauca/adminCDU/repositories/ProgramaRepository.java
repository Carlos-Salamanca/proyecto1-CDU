package co.edu.unicauca.adminCDU.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicauca.adminCDU.models.Programa;
import co.edu.unicauca.adminCDU.services.IProgramaService;

@Service
public class ProgramaRepository {
	
	@Autowired
	private IProgramaService prog;
	
	public List<Programa> findAll(){
		System.out.println("Invocando a listar todos los programas");
		return prog.findAll();
	}
	
	public Programa save(Programa programa) {
		System.out.println("Invocando a guardar programa");
		return prog.save(programa);
	}
	
	public Programa findById(int id) {
		System.out.println("Invocando a buscar programa por id");
		Programa programa = null;
		programa = prog.findById(id).orElse(null);
		return programa;
	}
	
	public Programa delete(int id) {
		System.out.println("Invocando a buscar programa por id");
		Programa programaAux = findById(id);
		
		if(programaAux != null) {
			prog.delete(programaAux);
		}
		return programaAux;
	}
	
	public Programa upDate(int id, Programa programa) {
		System.out.println("Invocando a editar programa por id");
		
		Programa programaAux = findById(id);
		if (programaAux != null) {
			programaAux = prog.save(programa);
		}
		return programaAux;
	}
	
}
